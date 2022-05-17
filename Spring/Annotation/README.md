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

## 고급 Spring @어노테이션 모음 :star:

### @EnableWebSecurity

    Spring Security 프레임워크를 사용을 위한 어노테이션.

### @EnableCaching

    Spring Cache를 사용하겠다.

### @Cacheable

    해당 메소드를 캐시하겠다.

```java
	//ehcache.xml에 있는 cache name="ListCacheData"과 매핑
	@Cacheable(cacheNames="ListCacheData")
	public List<Object> getList(){
		List<Object> list = mapper();
		return list;
	}
```

### @Transactional

    해당 메소드에 비즈니스로직 에러가 발생한다면 트랜잭션을 롤백하겠다.

```java
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	public int setUser(VO){
		//로직 구현...
	}
```

### @ConfigurationProperties

    자바 클래스 필드변수에 property 값을 바인딩.

```gradle
	annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
```

```yaml
url:
	naver: www.naver.com
	google: google.com
```

```java
	@Data
	@Component //ConfigurationProperties를 사용하려면 bean 등록.
	@ConfigurationProperties(prefix = "url")
	public class VO{
		private String naver;
		private String google
	}
```
