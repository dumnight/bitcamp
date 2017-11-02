package bitcamp.java100.practice.ee3;

public class Queue {
    
    // non-static nested class => inner class
    public class Box {
        Object value;
        Box next;
        public Box() {}
        public Box(Object value) {
            this.value = value;
        }
    }
    
    // 꼭대기 상자 주소를 보관
    Box head;
    Box tail;
    // 전체 상자 개수
    int len;
    
        // 입력
    public void add(Object value) {
        // 새 상자를 만들어 값을 저장한다.
        Box box = new Box(value);
        // 기존의 꼬리상자가 새 상자를 가리키게 한다
        if(tail != null)
            tail.next = box;
        // 새 상자가 꼬리가 되게 한다
        tail = box;
        // 상자 개수를 증가시킨다
        len++;
        //처음 추가한 상자라면 head가 되게한다
        if(head == null)
            head = box;
    }
        // 상자의 사이즈 
    public int size() {
        return len;
    }
        //출력
    public Object poll() {
        if(len == 0)
            return null;
        // 리턴할 값을 담은 Box의 주소를 보관한다.
        Box box = head;
        // Head를 다음 상자로 이동한다
        head = head.next;
        // 상자의 개수를 줄인다.
        len--;
        return box.value;
    }
}
