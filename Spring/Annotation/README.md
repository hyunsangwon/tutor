## 자주 사용하는 Spring @어노테이션 모음 :fire:

### 스프링 빈(Spring Bean)이란

    Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라고 함.

### @Controller

    클라이언트에 URL요청을 수행하는 클래스를 표시.

### @Service

    비즈니스 로직 실행, 계산 수행, 외부 API 호출과 같은 일부 서비스를 수행하는 클래스를 표시.
    서비스 계층에서 사용하도록 의도된 어노테이션.

### @Mapper

    interface를 SQL결과와 매핑.(연결)
    ORM이 매핑을 함.

### @Component

    개발자가 직접 작성한 Class 를 Bean 으로 만드는 것.
    이 어노테이션은 "이 클래스를 정의했으니 빈으로 등록하라" 는 뜻

### @Bean

    개발자가 직접 제어가 불가능한 외부 라이브러리등을 Bean으로 만들려할 때 사용.
    메소드 이름으로 Bean이름이 결정됨.

### @Configuration

    Bean 등록할 때 같이 사용.
    스프링 컨테이너는 @Configuration이 붙어있는 클래스를 자동으로 빈으로 등록해두고,
    @Bean이 있는 메소드를 찾아서 빈 생성.

### @PathVariable

    URL에 들어온 값을 파라미터에 대입하려고 할 때
    {}안에 들어온 값이 파라미터에 대입 됨.
    @GetMapping("/emp/no/{empNo}")
    @PathVariable("empNo") int empNo

### @Param

    Mybatis에 2개 이상 파라미터를 넘길 때는 @Param이용해서 이름 지정!
    @Param("job") String job
