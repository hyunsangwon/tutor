### Spring 이란

    Java 애플리케이션 프레임워크
    Java로 다양한 어플리케이션을 만들기 위한 틀

### 프레임워크와 라이브러리 차이

    라이브러리는 완성된 기능을 가져다 개발하는 것.
    프레임워크는 완성된 기능에서 추가적으로 개발하는 것.

### 우리가 스프링을 공부하는 이유

    javascript는 node.js, python은 flask, java는 spring, C는 ASP
    수많은 언어와 프레임워크가 존재 그 중에 왜 spring일까?
    이유는 간단! 가장 사람들이 많이 사용했고, 그 만큼 검증이 되었다.
    검증이 되었으니 회사에서도 spring을 자주 사용.
    그렇다 보니 교육기관에서는 spring을 베이스로 진행한다.

### Spring 종류

- Spring legacy(레거시)
- Egov (전자정부 프레임워크)
- Spring Boot(경량 프레임워크)

### Spring 특징

- DI (Dependency Injection)
  - 의존적인 객체를 직접 생성 또는 제어하는 것이 아니라, 특정 객체가 필요하다면 객체를 Spring이 외부에서 가져다가 주입하는 방식이다. 이렇게 객체를 외부에서 가져다가 쓰기 때문에 new 연산자가 사라짐.
- IoC (Inversion of Control)
  - 객체의 생성부터 소멸까지 모든 생명주기를 Spring 컨테이너가 관리함.
- AOP (Aspect Oriented Programming)
  - 여러 메서드에서 공통적으로 해야하는 일의 코드가 중복된다면, 따로 모아서 재활용하는 것을 말함.

### Spring Boot 특징

- 복잡했던 설정을 단순화.
- 내장 톰캣 제공.

### Spring과 같이 사용하는 친구들 :)

    Spring만으로 어플리케이션을 개발하는데 한계가 있음.
    데이터베이스도 필요하고, 고객한테 보여 줄 화면도 필요하다.
    Spring과 같이 사용하는 소프트웨어를 하나 씩 알아보자.

1. 데이터베이스 연결과 데이터 생성,호출,저장,삭제를 담당하는 ORM!
   - MyBatis, JPA
2. 필요한 기능을 쉽게 다운로드받을 수 있게 도와주고 배포를 담당하는 빌드관리도구(Build Tool)!
   - Gradle, Maven
3. 화면을 담당하는 템플릿 엔진!
   - JSP, Thymeleaf
4. 속성 정의를 담당하는 속성 파일!
   - yaml, properties
5. 서버를 담당하는 Tomcat!
   - Spring boot를 한다면 설치할 필요없다.
6. 그 외 Docker, Graphql 등

### Spring boot 참고사이트

    https://start.spring.io
    https://spring.io/projects/spring-boot
