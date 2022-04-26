## 추상화?

    공통적으로 사용하는 기능을 정의 (내가 공통기능을 만들테니깐 가져다써~ 요런 느낌!)

### 추상클래스

    추상클래스는 abstract 키워드로 선언된 클래스
    추상클래스에는 일반메소드, 추상메소드를 정의할 수 있다.

1. 추상클래스 선언

```java
    abstract class Chef{ //추상 클래스
        public void 요리를하다(){//일반 메소드

        }
        abstract public void 비법을전수하다();
        //추상 메소드는 무조건 public 이어야 한다.
        //추상메소드는 구현이 목적이 아님!


    }
```

2. 추상클래스은 클래스를 생성할 수 없다.

```java
    //추상클래스는 인스턴스화 할 수 없다.
    Chef chef = new Chef(); //오류 발생!
```

3. 추상클래스를 상속받으면 추상클래스가 된다.

```java
    abstract class Chef{
        abstract public void 요리를하다(){

        }
    }
    abstract class Food extends Chef{ //추상메소드를 가진 추상 클래스를 상속받는 서브 클래스는 자동으로 추상 클래스가 된다.

    }
```

4. 추상클래스를 상속받고 오버라이딩(무조건 해야함)을 하면 클래스를 생성할 수 있다.

```java
    abstract class Chef{
        abstract public void 요리를하다(){

        }
    }
    class Food extends Chef{ //오버라이딩을하면 Food클래스는 더 이상 추상클래스가 아니다.
        @override
        abstract public void 요리를하다(){
            System.out.println("요리 중 ~");
        }
    }
```

### 인터페이스

    추상클래스도 클래스 종류이기 때문에 다중상속 불가능.
    인터페이스로 다중상속 구현가능.
    인터페이스는 데이터를 제공하는 규격(공통기능을 제공하는 것)!

1. 선언 방법

```java
    //인터페이스에 있는 모든 변수와 메소드는 모두 public abstract 이다.
    interface Food{ //class를 사용하지 않고 interface라는 키워드를 작성한다.

        public abstract void 라면끓이는방법();
        void 찌개끓으는방법(); //public abstract 생략 가능

    }
```

2. 인터페이스 상속 방법

```java
class Chef implements Food{ //implements라는 키워드를 사용

}
```

3. 인터페이스 상속 조건

```java
class Chef implements Food{ //인터페이스를 상속받으면 인터페이스에서 정의한 메소드를 무조건 오버라이드 해야함.
    @override
    public void 라면끓이는방법(){}
    @override
    public void 찌개끓으는방법(){}
}
```
