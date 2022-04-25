## 스태틱 (static)

    static의 목적은 공유이다.
    static은 인스턴스화를 하지 않아도 호출이 가능하다.

```java
class Chef{
    static int x;
}

Chef c1 = new Chef();
c1.x = 10;
Chef c2 = new Chef();
c2.x = x + 10; //20이 나온다!
```

```java
class Member{
    static String NAME = "홍길동";
    static int AGE = 30;
}

String name = Member.NAME;  //static 변수는 new없이 바로 호출
int age = Member.AGE //static 변수는 new없이 바로 호출
```

### 결론 : static을 사용하는 경우

1. 코드를 정의할 때
   단, 해당 클래스에는 변수만 존재!

```java
public static final String NEW_RELEASE = "release_new"; // 출고 첫 등록
public static final String NEW_WAREHOUSING = "warehousing_new"; //입고 첫 등록
```

2. 객체를 여러개 생성해서 사용하는 상황일 때(싱글톤 패턴)
   ex) 데이터베이스 연동할 때
