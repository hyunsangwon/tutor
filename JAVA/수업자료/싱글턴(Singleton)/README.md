### 싱근턴 패턴(Singleton pattern)?

    싱글턴 패턴(Singleton pattern)은 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다. 주로 공통된 객체를 여러개 생성해서 사용하는 상황에서 많이 사용.

```java
public class Chef {

    private static Chef chef = null;

    public static Chef getInstance() {
    	if(chef == null) {
    		chef = new Chef();
    	}
    	return chef;
    }
}
```
