//캡슐화의 존재 이유 - 멤버의 접근을 제한하기
//변수의 경우 멤버의 접근을 제한하는 대신 외부에서 변수의 값을 넣고 뺄 수 있도록 그 방법(method)를 제공
package bitcamp.java100.ch08.ex1;

// Gym 회원을 추상화 하기

class Member2 {
    //필드는 오직 내부에서만 접근할 수 있도록 제한한다
    private String name;
    private int age;
    private float weight;
    private float height;
    
    //필드의 값을 설정하는 메서드를 선언
    //외부에서 사용하기때문에 public을 붙인다
    //필드의 값을 설정하는 메서드는 보통 set으로 시작한다. 단 set 다음 첫 문자는 보통 대문자로 시작한다
    //필드명과 반드시 같을 필요는 없다
    //파라미터 이름도 필드명과 같게 하면 일관성이 있어 이해하기 편하다
    public void setName(String name) {
        this.name = name;
    }
    
    //필드의 값을 꺼내는 메서드 선언
    //보통 get으로 시작한다
    //나머지는 set으로 시작하는 메서드와 같다
    public String getName() {
        return this.name;
    }
    
    public void getAge(int age) {
        if(age <= 0 || age > 150)
            return;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setWeight(float weight) {
        if(weight <= 0 || weight > 200)
            return;
        this.weight = weight;
    }
    public float getWeight() {
        return this.weight;
    }
    
    public void setHeight(float Height) {
        if(height <= 0 || height > 250)
            return;
        this.height = height;
    }
    public float getHeight() {
        return this.height;
    }
}

public class Test7_2 {
    
    
    
    public static void main(String[] args) {
        
        Member2 m = new Member2();
 /*       
        m.name = "홍길동";
        m.age = 20;
        m.weight = 602.2f;
        m.height = 12.7f;
   */     
        m.setName("홍길동");
        m.getAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %f, %f,", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }

}
    