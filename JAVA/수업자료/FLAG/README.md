### Flag?
    상태를 기록하고 처리 흐름을 *제어하기 위한
    boolean형 변수

### 규칙
1. 플래그변수를 남발하지 말자.
2. boolean타입의 변수이름에는 is+명사로 사용.  
ex) isResult? isTrue?  
3. 변수이름은 길면 길수록 좋다.

### 목적
    flag값이 true or false 따라
    다른 코드를 실행시키는 것
    ex) 회원가입할 때 양식 맞게 잘쓰면 true 아니면 false
    플래그값이 true 회원 저장!

### 기타 설명
1. boolean형이 없는 프로그래밍 언어가 있음. ex) C언어 true == 1, false == 0  
2. 프로그래밍에서 ! 부정을 의미.

### 예제 코드
```java
    public static void 로봇팔을동작하다(){
		System.out.println("팔을 동작하다.");
	}
	public static void 로봇다리를동작하다(){
		System.out.println("다리를 동작하다.");
	}
    public static void main(String[] args) {
        boolean isFlag = true; //true or false만 온다.
        if(3 > 0){ //어떠한 로직에 의해 isFlag값이 변경됨.
			isFlag = false;
		}
		if(!isFlag){ //flag값에 따라 서로 다른 메소드가 호출 됨.
			로봇다리를동작하다();
		}
		if(isFlag){
			로봇팔을동작하다();
		}
    }
```