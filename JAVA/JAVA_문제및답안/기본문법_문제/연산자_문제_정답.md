### 자바 기본 연산자 문제 

1. 거스름돈 문제
```java
    // 조건 1. 변수 선언 x
	// 조건 2. 사칙 연산을 이용해서 풀 것
	int money = 57000;
	int man = 0; // 만원
	int ocheon = 0; // 오천원
	int temp = 0; //최종 거스름돈
		
	man = money / 10000;
	temp = money % 10000;
	ocheon = temp / 5000;
	temp = temp % 5000;

	System.out.println("거스름돈 이전 금액 : "+money);
	System.out.println("만원 몇 장 ? :" + man);
	System.out.println("오천원 몇 장 ? :" + ocheon);
	System.out.println("최종 남은 금액은 ? :" + temp);
```
2. 국어,영어,수학,과학 총점, 평균내기
```java
    int 국어 = 100;
	int 수학 = 50;
	int 영어 = 88;
	int 과학 = 38;
	final int 과목수 = 4; //상수 의미
	int sum = 0; //총합
	double avg = 0; //평균
	sum = 국어 + 수학 + 영어 + 과학;
	avg = sum / 과목수;
	System.out.println("총점은 ? " +sum);
	System.out.println("평균 점수는 ? "+avg);   
```