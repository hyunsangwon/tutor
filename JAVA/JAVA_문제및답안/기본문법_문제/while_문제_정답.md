1. 1부터 10까지 짝수, 홀수 판단.(카운트가 30번 break)
```java
    int num = 0;
	int cnt = 0;
	final int MAX = 30;//30번 사람까지 받겠음.
	while(true) {
		++num;
		if(num%2 == 0) {
			++cnt;
		}
		if(count == MAX) {
			break;
		}
	}
```
2. 1~10까지 합을 구하고 합이 55면 break
```java
    int i =0;
	int sum =0;
	final int MAX_VALUE = 55;
	while(true) {
		++i;
		sum = sum + i;
		if(sum == MAX_VALUE) {
			break;
		}
	}
```