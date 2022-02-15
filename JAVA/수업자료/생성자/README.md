### 생성자란
    객체(Class)가 객체화(or 인스턴스화)될 때 호출되는 특수 함수(or 메소드).
  
### 특징 
    생성자는 아래와 같은 특징을 가지고 있다.

1. 일반 함수와 달리 리턴타입이 없고, 함수 이름은 클래스이름과 동일.
```java
    public class Pizza{
        
        public Pizza(){ //생성자(특수 함수) 함수 생성
            
        }
    }
```
2. 파라미터에 데이터를 받을 수 있고 필드변수(전역변수)를 처리할 때 사용.
```java
public class Pizza{
	
	String pizzaName;
	int pizzaPrice;

	public Pizza(String pizzaName, int pizzaPrice){ 
        //생성자(특수 함수)는 필드변수에 값을 대입할 때 사용.
		this.pizzaName = pizzaName; 
        //전역변수와 파라미터에 있는 변수이름 중복 가능. 그래서 *this로 구별.
		this.pizzaPrice = pizzaPrice;
		String pizzaName = ""; //오류 파라미터에 있는 변수이름과 중복.
	}

}
```
3. 외부클래스에서 생성자 호출.
```java
    Pizza p = new Pizza();
    /* Pizza()가 매개변수가 없는 생성자(특수 함수) 호출.
    매개변수가 있다면? 아래와 같이 작성 :) */
    String name = "치즈피자";
    int price = 10000;

    Pizza p = new Pizza(name, price); //클래스 생성과 동시에 생성자 호출
    // ***생성자는 필드변수(전역번수)를 초기화할 때 사용. (중요한 개념!)
```
4. 디폴트 생성자.
```java
    public class Pizza{

        public Pizza(){ // 디폴트로 매개변수가 없는 생성자를 만들어 줌.
            
        }
    }
    //디폴트 생성자가 있기 때문에 Pizza클래스를 외부에서 호출할 때 아래 코드가 가능 :)
    Pizza p = new Pizza();
```
5. 생성자에 파라미터를 넣으면 디폴트 생성자는 없어짐.
```java
    public class Pizza{

        public Pizza(String pizzaName, int price){
            
        }
    }
    Pizza p = new Pizza(); //오류! 디폴트 생성자가 없으므로 매개변수를 넣어야 함!
```