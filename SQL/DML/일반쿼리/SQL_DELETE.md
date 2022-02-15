### INSERT

    데이터를 테이블에 삭제

- 작성법

```sql
-- WHERE 조건이 없으면 해당 테이블에 모든 데이터 삭제.
DELETE FROM dept

-- 원하는 데이터 삭제.
DELETE FROM dept
WHERE deptno = 70
```

- 주의\*

1. 해당 컬럼이 ON DELETE CASCADE 로 설정되어 있으면,
   연관된 컬럼 모두 삭제됨.
2. commit; 해야 최종 delete가 됨.

- tip

  실제로는 데이터 삭제 x (데이터는 자산!)  
  삭제여부 컬럼을 만듦  
  ex) 컬럼이름 : 회원탈퇴여부
  데이터 : 'y' or 'n'
