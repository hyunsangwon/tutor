### 기초 다지기 step 2.
 - 1번 부터 4번까지는 이클립스 사용하지 말 것.
1. 최종 출력 값은?
```java
    int x = 20;
    for(int i=0; i<3; i++){
        x = x + i;
    }
    if(x >= 21){
        ++x;
    }
    System.out.println(x);
    정답)
```

2. 최종 출력 값은?
```java
    int array[] = {0, 10, 13};
    int max = 0;
    for(int i=0; i<3; i++){
        int temp = array[i];
        if(temp < max ){
            max = temp;
        }
    }
    System.out.println(max);
```

3. 최종 출력 값은?
```java
    int array[] = {15, 10, 13};
    if(array[0] > array[1]){
        int temp = array[1];
        array[1] = array[0];
        array[0] = temp;
    }
    System.out.println(array[0]);
```

4. 최종 출력 값은?
```java
    int array[] = {15, 10, 13};
    for(int i=0; i<3; i++){
        int temp = array[i]; 
        int remainder = temp % 5;
        if(remainder == 0){
            System.out.println(temp);
        }
    }
```

5. 100넘는 숫자 개수 찾기
### 문제설명
    배열을 선언하고 100이 넘는 개수가 몇개인지 찾으시오.

### 제한사항
- 변수는 아래와 같이 선언.
- 개수가 3개 이하면 count에 5를 대입하시오.

```java
   int count = 0;
   int array[] = {101, 110, 120, 130, 88, 30};
```

### 입출력 예
    4

6. 거스름돈 문제
### 문제설명
    철수의 계좌잔고는 현재 157000이 있다.  
    은행가서 5만원, 만원, 5천원 으로 교환을 하고 싶다.  
    157000은 5만원 3장, 만원 0장, 5천원 1장으로 교환이 가능할 것 이다.  

### 제한사항
- 변수는 아래와 같이 선언.
- 잔고에 20만원이 넘으면 money에 0을 대입하시오.

```java
    int money = 157000;
    final int OMAN = 50000;
    final int MAN = 10000;
    final int OCHEON = 5000;
```

### 입출력 예
    오만원 3장
    만원 0장
    오천원 1장