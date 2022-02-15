### 자바 IF/ELSE 문제

1. 짝수 판단
```java
    int num = 40;
    if((num%2) == 0){
        System.out.println(num+"은 짝수 입니다.")
    }else{
        System.out.println(num+"은 홀수 입니다.")
    }
```

2. 입력한 숫자가 100이 넘지 않고, 2의 배수인지 3의 배수인지 출력
```java
    Scanner scan = new Scanner(System.in);//crtl + shift + o
    System.out.print("숫자를 입력하세요 ==>");
    int value = scan.nextInt();
    if(value <= 100) {
        if((value%2) == 0) {
            System.out.println("2의 배수입니다.");
        }
        if((value%3) == 0) {
            System.out.println("3의 배수입니다.");
        }
    }else{
        System.out.println("100을 넘었습니다!!");
    }

```

3. 학점 계산 (90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하는 F) 

```java
    int score = 88;
    if(score > 90) {
		System.out.println("당신의 학점은 !!!! A!!!");
	}else if(score <= 90 && score > 80) {
		System.out.println("당신의 학점은 !!!! B!!!");
	}else if(score <= 80 && score > 70) {
		System.out.println("당신의 학점은 !!!! C!!!");
	}else {
		System.out.println("F당첨!!");
	}
```