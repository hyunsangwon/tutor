1. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public int getCount(List<Object> list){
        return 0;
    }
    //리턴 타입 :
    //메소드 이름:
    //파라미터 타입 :
```

2. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public void insertData(Map<String, Object> map){

    }
    //리턴 타입 :
    //메소드 이름:
    //파라미터 타입 :
```

3. 메소드 리턴,이름,파라미터 타입 작성.

```java
    public List<Object> list insertData(String str){
        return null;
    }
    //리턴 타입 :
    //메소드 이름:
    //파라미터 타입 :
```

4. 오버라이딩(Overriding)과 오버로딩(Overloading)이 무엇인지 간략히 기술하시오.

5. 추상클래스와 Interface(인터페이스)에 차이점을 간략히 기술하시오.

6. 상속에 대해 아는 내용을 간략히 기술하시오.

7. 생성자에 대해 아는 내용을 간략히 기술하시오.

8. 컬렉션에 대해 아는 내용을 간략히 서술하시오.

9. 아래 코드를 보고 예상되는 결과는?

```java
    class A{

        public static int count;
        public int temp;

    }
    class B{

        main(){

            A a1 = new A();
            a1.count = 10;
            a1.temp = 20;

            A a2 = new A();
            a2.count = 20;
            a2.temp = 20;

            System.out.println(a1.count); // 답 :
            System.out.println(a1.temp); // 답 :

            System.out.println(a2.count); // 답 :
            System.out.println(a2.temp); // 답 :
        }
    }

```

10. 아래 코드를 보고 예상되는 결과는?

```java
    class A{
        public int money;
    }
    class B{
        public A getInstance(){
            A a = new A();
            return a;
        }
    }
    class C{
        main(){
            B b = new B();
            A a = b.getInstance();
            a.money = 1000;
            a = b.getInstance();
            a.money = a.money + 1000;
            System.out.println(a.money); // 답 :
        }
    }
```

11. getter, setter을 이용하지 않고 필드변수 값을 초기화 하는 방법을 아래 코드로 작성하시오.

```java
class A{
    private String name;
    private int age;

}
```
