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

Member.NAME;  //static 변수는 new없이 바로 호출
Member.AGE //static 변수는 new없이 바로 호출
```
