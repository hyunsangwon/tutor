## SQL

---

DDL(Data Definition Language) 데이터 정의 언어

- CREATE TABLE <table_name> : table 생성
- DROP TABLE <table_name> : table 삭제
- ALTER TABLE <table_name> : table 수정 (테이블 이름 변경할때 씀)

---

DML(Data Manipulation Language) 데이터 조작 언어

- SELECT : 데이터 조회
- DELETE : 데이터 삭제
- UPDATE : 데이터 수정
- INSERT : 데이터 생성

---

DCL (Data Control Language) 데이터 제어 언어

- GRANT : 특정 사용자에게 권한 부여
- REVOKE : 특정 사용자 권한 회수

### 데이터베이스 구성도

- Database -> Table -> Data  
  => 여러 데이터베이스가 존재, 데이터베이스에 여러 테이블이 존재, 테이블에 데이터가 존재!

### 테이블 구성도

![](../../images/table.PNG)

- PK(Primary Key)는 고유 컬럼으로 고유한 데이터만 올 수 있다.
  ex) 사원 번호, 주민
- 컬럼 : 테이블을 구성하는 각각의 열에 위치한 정보.
- 데이터 : 테이블에 최종으로 저장된 데이터들. (commit해야 데이터가 쌓임)
