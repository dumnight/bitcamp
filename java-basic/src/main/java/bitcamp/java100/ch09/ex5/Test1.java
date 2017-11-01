//컬렉션 API - Queue 활용 
package bitcamp.java100.ch09.ex5;

public class Test1 {
    
    public static void main(String[] args) {
        Queue queqe = new Queue();
        
        queqe.add("홍길동");
        queqe.add("임꺽정");
        queqe.add("유관순");
        queqe.add("안중근");
        queqe.add("윤봉길");
        
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        
        queqe.add("홍길동");
        queqe.add("임꺽정");
        
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
        System.out.println(queqe.poll());
    }
}
