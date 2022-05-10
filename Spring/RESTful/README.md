### RESTful(REpresentational State Transfer)

    RESTful은 쉽게 생각해서 클라이언트와 서버간의 URL 규칙 스타일 중 하나.
    REST에는 기본 원칙이 있고, 이 가이드를 준수한 API는 RESTful하다고 표현.

### RESTful 규칙

1. 슬래시(/) 구분자는 계층 관계를 나타내는 데 사용
   ex) /whales/animals/mammals (x) 고래 -> 동물 -> 포유류
   ex) /animals/mammals/whales (o) 동물 -> 포유류 -> 고래

2. URL 마지막 문자로 슬래시(/)를 포함하지 않는다.
   ex) /houses/apartments/ (X)
   ex) /houses/apartments (0)

3. 밑줄(\_)은 URL에 사용하지 않는다. 대신 하이픈(-)을 사용하여 URL 가독성을 높이자!
   ex) /users/game_list (X)
   ex) /users/game-list (0)

4. URL 경로에는 소문자가 적합하다.
   ex) /users/FOOD (x)
   ex) /users/food (o)

5. 행위(method)는 URL에 포함하지 않는다.
   ex) /users/update/info (X)
   ex) /users/info (0)

6. 동사보다는 명사를 사용한다.
   ex) /users/delete (x)
   ex) /users (o) (\*http method를 delete로)

7. 단수(Singular) 보다는 복수(Plural)형 명사를 사용한다.
   ex) /sports/soccer/player/13 (x)
   ex) /sports/soccer/players/13 (o)
