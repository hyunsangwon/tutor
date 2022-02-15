1. 2단부터 9단까지 출력
```java
    for(int i=2; i<=9; i++) {
        System.out.println(i + "단은");
        for(int j=1; j<=9; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
    }
```
2. * 별찍기
```java
    for(int i=0; i<6; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
```

3. 반대로 *별찍기
```java
    for(int i=5; i>=1; --i) {
        for(int j=1; j<=i; ++j) {
            System.out.print("*");
        }
        System.out.println();
    }
```