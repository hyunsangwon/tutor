## 오버로딩(overloading), 오버라이딩(overriding)

    객체지향언어에서 자주 사용하는 개념이다.
    기술면접 단골 문제이니 숙지하자.

### 오버로딩(overloading)

    같은 클래스나 상속관계에서 동일한 이름의 메소드 중복 작성
    메소드의 이름은 반드시 동일, 파라미터 개수, 타입은 달라야 성립

```java
    public void setData(){

    }
    // 오버로딩의 핵심은 메소드이름은 같고 파라미터 개수, 타입만 다르면 된다.
    public void setData(int x){

    }
```

```java
    class 부모{
        public void 일을하다(){

        }
    }
    // 오버로딩은 상속관계에도 적용된다.
    // 자식클래스는 부모클래스를 상속했기 때문에 부모 클래스의 메소드를 사용할 수 있다.
    class 자식 extends 부모{
        public void 일을하다(String task){ //일을하다 메소드는 부모에도 있고 자식에도 있다. 이 경우 오버로딩으로 해결해야한다.
            //오버로딩으로 해결하지 않으면 부모 클래스의 일을하다는 무시된다.
        }
        public void 음악을듣다(){

        }
    }
```

### 오버라이딩(overriding)

    자식 클래스(서브클래스)에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
    메소드의 이름은 반드시 동일, 파라미터 개수, 타입, 리턴 타입은 무조건 같아야 성립.

```java
    class 부모{
        public void 일을하다(){
            System.out.println("열심히 일을 하다! ");
        }
    }
    class 자식 extends 부모{
        @override
        public void 일을하다(){ //부모클래스의 일을하다 메소드를 자식클래스에서 재정의함.
            System.out.println("백수가 좋아 ~~! ");
        }
    }
```
