### Lombok 이란?

    VO클래스를 더욱 간편하게 관리해줌.

### 사용 방법

1. Gradle에 추가
   compileOnly 'org.projectlombok:lombok:1.18.24'
   annotationProcessor 'org.projectlombok:lombok:1.18.24'
   testCompileOnly 'org.projectlombok:lombok:1.18.24'
   testAnnotationProcessor 'org.projectlombok:lombok:1.18.24'

2. 이클립스와 연동
   구글에 lombok.jar 다운로드

### 사용법

```java
@Data //getter,setter 함수를 자동으로 만들어 줌
@AllArgsConstructor //자동으로 생성자를 만들어 줌(*주의 디폴트 생성자 무시 됨)
public class UserVO {
	private String name;
	private int age;
	private String addr;
}

```
