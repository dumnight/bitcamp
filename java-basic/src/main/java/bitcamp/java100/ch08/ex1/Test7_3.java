//캡슐화의 존재 이유 - 필드와 프로퍼티 그리고 셋터/겟터
package bitcamp.java100.ch08.ex1;

// Gym 회원을 추상화 하기

class Member3 {
    //필드
    //클래스에 선언된 스태틱 변수 또는 인스턴스 변수를 필드라고 부른다
    private String name;
    private int age;
    private float weight;
    private float height;
    
    //셋터
    //필드의 값을 설정하는 setxxx 메서드를 셋터라 부른다
    public void setName(String name) {
        this.name = name;
    }
    
    //필드의 값을 꺼내는 getxxx 메서드를 겟터라 부른다
    public String getName() {
        return this.name;
    }
    
    // 셋터/겟터를 다른 말로 프로퍼티(property)라고 부른다
    // 셋터/겟터가 모두 있는 경우 read/write 프로퍼티
    // 셋터만 있는경우 write only 프로퍼티, 겟터만 있는경우 read only 프로퍼티이다.
    // 주의 : 필드는 프로퍼티가 아니다
    // 프로퍼티는 셋터/겟터 메서드이다

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

public class Test7_3 {
    
    public static void main(String[] args) {
        
        Member3 m = new Member3();
 /*       
        m.name = "홍길동";
        m.age = 20;
        m.weight = 602.2f;
        m.height = 12.7f;
   */     
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %f, %f,", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }

}
    