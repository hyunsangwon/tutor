1. 1부터 10까지 짝수, 홀수 판단.
```java
    for(int i=1; i<=10; i++) {
        if((i%2) == 0) {
            System.out.print("짝수는"+i);
        }
        if((i%3) == 0) {
			System.out.print("홀수는"+i);
		}
    }
```
2. 1부터 100까지 짝수 개수 구하기.
```java
    int count = 0;
    for(int i=1; i<=100; i++) {
        if(i%2 == 0) {
            ++count;
        }
    }
    System.out.println("1부터 100까지의 짝수 개수는 "+count+"개 입니다.");
```
3. 1부터 10까지 더한값 구하기.
```java
   int sum = 0;
   for(int i=1; i<=10; i++) {
       sum += i;
   }
    System.out.println("1부터 10까지 더한값은 "+sum+"입니다.");
```