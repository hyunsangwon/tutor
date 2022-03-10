### JSON(JavaScript Object Notation)

    데이터를 저장하거나 전송할 때 많이 사용되는 경량의 DATA 교환 형식

### 사용하는 이유

    서버(Java, node.js, python 등등)에 데이터를 묶어 한번에 전송하기 위해서!

### 특징

1. 키와 값으로 구성.
2. 특정 언어에 종속되지 않으며, 대부분의 프로그래밍 언어에서 JSON 사용.
   (자바스크립트 문법과 굉장히 유사하지만 텍스트 형식 임)
3. 서버와 클라이언트 간의 교류에서 일반적으로 많이 사용.

### 문법

```json
// JSON 형식에서는 null, number, string, array, object, boolean을 사용할 수 있음.
{
  "empno": 7369,
  "ename": "SMITH",
  "job": "CLERK",
  "mgr": [7902, 7369],
  "sal": 1200,
  "dname": "SALES"
}
```
