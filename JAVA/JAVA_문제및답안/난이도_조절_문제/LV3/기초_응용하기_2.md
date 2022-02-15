## 1번 문제
### 문제설명
    상원이는 깜빡하고 고객 핸드폰 번호를 암호화 하지 않고 저장 했다.  
    핸드폰 번호 가운데와 뒷자리를 x로 변경하자.

### 제한사항
- 앞자리가 010이 아니라면 "핸드폰 번호를 변경해야 합니다." 출력.
- 핸드폰 번호 중간자리와 끝자리가 4개이면 x4개, 3개면 x3개
- ex) 010-333-0000 -> 010-xxx-xxxx
```java
    public static void main(String[] args) {
        String phone = "017-404-1234";
        //... 코드 작성 ...
		for(String str : array){
			System.out.print(str);
		}
    }
```
### 입출력 예
    핸드폰 번호를 변경해야 합니다.
    010-xxx-xxxx

### 최종 코드
```java 
    String phone = "017-404-1234";
	String array[] = phone.split("-");//배열은 for문으로 해결해야한다.
	    for(int i=0; i<array.length; i++){
			int len = array[i].length();
			if(i == 0 && !array[i].equals("010")){
				System.out.println("핸드폰 번호를 변경해야 합니다.");
			}
			if(i > 0){
			    if(len == 3){
					array[i] = "-***";
				}
				if(len == 4){
					array[i] = "-****";
				}
			}
		}
		for(String str : array){
			System.out.print(str);
		}
```
## 2번 문제
### 문제설명
    문자열 평균구하기

### 제한사항
- 점수중에 100점이 있다면 "100점 만점에 100점!" 출력.
- 평균 소수점 무시. (int형으로 받을 것)
```java
    public static void main(String[] args) {
        String scores = "80, 70, 100, 31";
        int len = 0; //과목 수
        //... 코드 작성 ...
        System.out.print("총점 : "+scores);
        System.out.print("평균 : "+scores/len);
    }
```
### 입출력 예
    100점 만점에 100점!
    281
    70
### 최종 코드
```java
    String scores = "80, 70, 100, 31";
	String[] array = scores.split(",");
	int len = array.length; //과목 수
	int sum = 0;
	for(int i=0; i<len; i++){
	    String temp = array[i].trim();//앞,뒤만 공백제거
	    int num = Integer.parseInt(temp);//문자에서 숫자로 변환
	    if(num == 100){
	    	System.out.println("100점 만점에 100점!");
	    }
	    sum += num;
	}
	System.out.println("총점 : "+sum);
	System.out.println("평균 : "+sum/len);
```
## 3번 문제
### 문제설명 
    이름,주소,나이 알아내기

### 제한사항
```java
    public static void main(String[] args) {
        String query = "name=brian&addr=daejeon&age=30";
        String name = "";
        String addr = "";
        int age = 0;
        //... 코드 작성 ...
        System.out.print("name : "+name);
        System.out.print("addr : "+addr);
        System.out.print("age : "+age);
    }
```
### 입출력 예
    name : brian
    addr : daejeon
    age : 30

### 최종 코드
```java
    String query = "name=brian&addr=daejeon&age=30";
	String name = "";
	String addr = "";
	int age = 0;
	String array[] = query.split("&");
	    for(int i=0; i<array.length; i++){
	        String temp[] = array[i].split("=");
	        if(i == 0){
	        	name = temp[i+1];	        		
	        }
	        if(i == 1){
	        	addr = temp[i];	
	        }
	        if(i == 2){
	        	age = Integer.parseInt(temp[i-1]);	
	        }
	    }
	    System.out.println("name : "+name);
	    System.out.println("addr : "+addr);
	    System.out.println("age : "+age);
```