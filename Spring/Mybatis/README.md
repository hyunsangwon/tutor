## MyBatis 란

    마이바티스(MyBatis)는 자바 퍼시스턴스 프레임워크(ORM)의 하나로 XML, 애너테이션(annotation)을 사용하여 SQL 문으로 객체(Interface, Class)들을 연결.

### MyBatis 사용법

1. step 1) Gradle에 Mybatis와 데이터베이스를 입력한다. (입력 후 gradle 새로고침)

```gradle
    dependencies {
        //ORM
	    implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.0'
	    //MYSQL
	    runtimeOnly 'mysql:mysql-connector-java'
    }
```

2. step 2) Yaml파일에 데이터베이스 접속 정보와, Mybatis Sql파일 경로를 적는다.

```yaml
# 문서 참고 https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
# MyBatis 설정
mybatis:
  mapper-locations: classpath:/sqlmap/sqlmapper_*.xml #sql 파일 위치
  type-aliases-package: com.example.first_spring.vo #vo 패키지 위치

# MySQL 접속정보 설정
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/dw?useUnicode=true&charaterEncoding=utf-8&serverTimezone=UTC
    username: root
    password: tkddnjs0823
```

3. step 3) java폴더 안에 mapper 패키지 생성 후 interface 생성

```java
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.first_spring.vo.EmpVO;

// @Mapper : 해당 interface를 SQL결과와 매핑(연결)하겠다. (Mybatis가 매핑을 함)
@Mapper
public interface MainMapper {

	public List<EmpVO> getEmpList();
}

```

4. step 4) resources폴더 안에 sqlmap 이라는 패키지(폴더)를 생성 후 sqlmapper\_테이블이름.xml 파일 생성

```xml
<!-- 여기서 select, insert, delete, update를 함. -->
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!-- namespace에 MainMapper위치를 지정함 -->
<mapper namespace="com.example.first_spring.mapper.MainMapper">
    <!-- id는 interface에 있는 메소드이름과 동일해야 함 -->
    <!-- resultType은 SQL결과를 받을 데이터 타입 -->
    <!-- resultType="List<EmpVO>" 이런 문법은 없음! List는 자바 인터페이스에서 정의 -->
    <!-- Mybatis가 VO클래스에 있는 setter함수를 스캔하여 자동으로 파리미터에 값을 대입함. -->
    <select id="getEmpList" resultType="EmpVO">
		SELECT
			empno,
			ename,
			job
		FROM emp
	</select>
</mapper>
```

### MyBatis 결론

    MyBatis와 같은 ORM 프레임워크 덕분에 백엔드와 데이터베이스 연결과 컨트롤(select, update, insert, delete)이 쉬움.
    MyBatis없이 자바소스로 데이터베이스를 연동하려고 하면 소스가 길어지고 로직이 복잡해짐.(성능도 떨어지고 유지보수도 힘들어짐)
