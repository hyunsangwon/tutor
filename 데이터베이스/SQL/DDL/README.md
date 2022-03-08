### DDL(Data Definition Language) 데이터 정의 언어

### CREATE

    테이블 생성

```sql
-- PK가 없는 table 생성
    CREATE TABLE student
    (
        id INT(11) NOT NULL,
        name VARCHAR(20) NOT NULL,
        height INT(5),
        age INT(5) DEFAULT 0,
        create_at DATETIME DEFAULT CURRENT_TIMESTAMP
    );
-- PK가 있는 table 생성
-- AUTO_INCREMENT을 이용하여 INSERT할 때마다 자동 증가
    CREATE TABLE student
    (
        id INT(11) NOT NULL AUTO_INCREMENT,
        name VARCHAR(20) NOT NULL,
        height INT(5),
        age INT(5) DEFAULT 0,
        create_at DATETIME DEFAULT CURRENT_TIMESTAMP,
        CONSTRAINT student_id_pk PRIMARY KEY(id)
    );
-- PK
```

```sql
-- primary key 간단하게 사용하는 방법
-- foreign key 사용하는 방법
    create table employee
    (
  	id int auto_increment primary key,
	name varchar(20) not null,
	code char(13) not null unique key,
	dept_id int,
	foreign key (dept_id) references department(id)
    );
```

```sql
    -- 외래키 옵션
    on delete : 부모 데이터에 삭제 이벤트가 발생하면 자식 데이터에 이벤트 발생
    on update : 부모 데이터에 수정 이벤트가 발생하면 자식 데이터에 이벤트 발생
    -- 이벤트 종류
    -- cascade : 자식 데이터 삭제or 수정
    -- set null : 자식 데이터 null로 업데이트
    -- set default : 자식 데이터 참조 컬럼을 Default 값으로 업데이트
    -- restrict(default) : 자식 테이블이 참조하고 있을 경우, 데이터 삭제or 수정 불가
    -- no action : 자식 테이블의 데이터는 변경되지 않습니다.
```

### primary key, unique key, foreign key 특징

```sql
    primary key : 기본 키(PK)
    -- what : PK는 고유 데이터를 중복 방지 해주고 NOT NULL과 INDEX(unique index) 속성도 가지고 있다.
    -- why : 고유한 데이터는 중복될 수 없으므로, 테이블에 엄격한 규정을 정하기 위해.
    -- when : 고유한 데이터를 가진 컬럼이 있다면 ( ex) 주민, 핸드폰번호, 학생번호, 사원번호 등등...)
    -- where : 컬럼에
    -- how : 아래 2가지 방법을 많이 사용.
    -- 1. id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY (관리 힘듬..)
    -- 2. CONSTRAINT student_id_pk PRIMARY KEY(id)  (테이블이 많아질 때 관리할 수 있음)

    foreign key : 외래 키(FK)
    -- what : 외래키는 테이블간 관계를 엄격하게 다룬다. NULL이 올 수 있고, INDEX 기능은 없다.
    -- why : 관계형 데이터베이스 이므로, 관계가 엄격함.
    -- when : 교집합을 할 수 있는 컬럼에 외래키 설정.
    -- where : 컬럼에
    -- how : 아래 2가지 방법을 많이 사용.
    -- 1. FOREIGN KEY (dept_id) REFERENCES  department(id) (관리 힘듬..)
    -- 2. CONSTRAINT student_id_fk FOREIGN KEY (dept_id) REFERENCES  department(id) (테이블이 많아질 때 관리할 수 있음)
    -- * 외래 키를 기본 키처럼 사용하고 싶으면 외래 키 컬럼에 unique key 적용하면 된다.
    unique key : 유니크 키
    -- PK 와 마찬가지로 중복성이 허용되지 않지만 NULL 허용.
    -- 여러컬럼에 사용하는 방법
    CREATE TABLE emp(deptno int,mgr int, UNIQUE KEY emp(deptno, mgr));
    -- 단일컬럼에 사용하는 방법
    CREATE TABLE emp(deptno int UNIQUE KEY);
```

### DROP

    테이블 삭제

```sql
    drop table sangwon ;
```

### ALTER

    테이블에 컬럼이름을 수정하거나, 삭제 혹은 컬럼을 추가할 때

```sql
    ALTER TABLE table_name ADD COLUMN ex_column varchar(32) NOT NULL;
```
