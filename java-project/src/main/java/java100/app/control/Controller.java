package java100.app.control;

public interface Controller {
	/*public abstract*/ void execute();
	
	//객체를 사용하기 전에 준비시키는 메서드 
	default void init() {
		
	}
	default void destroy() {
		
	}
	
	
}
