### INSERT

    데이터를 테이블에 저장

- 작성법

```sql
-- 작성법 a.
INSERT INTO emp(ename, sal)
VALUES('홍길동', 3000)

-- 작성법 b.
-- 해당 테이블에 데이터를 모두 넣으면, 테이블 뒤 괄호 생략
INSERT INTO emp
VALUES('홍길동', 3000, 'manager')
```

- 주의\*

1.  테이블에 job컬럼이 not null이면,
    insert 할때 무조건 데이터를 넣어야 함.

2.  테이블에 기본키 설정이 auto increment가
    아니라면, 기본키 데이터를 넣어야 함.

3.  commit; 명령어를 작성해야 테이블에 최종 insert가 됨.
    (디비버 같은 SQL 프로그램은 auto commit으로 설정.)
