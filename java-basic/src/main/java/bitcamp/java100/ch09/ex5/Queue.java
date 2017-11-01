//Queue 방식으로 데이터 목록 관리 
package bitcamp.java100.ch09.ex5;

//밖에 두면 패키지멤버 클래스가 된다
public class Queue {
    //Inner class
    private class Box {
        Object value;
        Box next;
        
        public Box(Object value) {
            this.value = value;
        }
    }
    //시작과 끝 위치의 상자 주소 보관
    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        // 새 상자를 만들어 값을 저장한다 
        Box box = new Box(value);

        //기존의 상자가 새 상자를 가리키게 한다
        if(tail != null)
            tail.next = box;
        
        //새 상자가 꼬리가 되게한다 가리킨다
        tail = box;
        
        //상자 개수를 증가시킨다
        len++;
        
        if(head == null) // 처음 추가한 상자라면 head가 되게 한다
            head = box;
    }
    
    public int size() {
        return len;
    }
    
    public Object poll() {
        if(len == 0)
            return null;
        
        //리턴할 값을 담은 Box의 주소를 보관한다
        Box box = head;
        
        //head를 다음 상자로 이동한다
        head = head.next;
        
        len--; // 상자의 개수를 줄인다
        return box.value; // 처음 탑이 가리켰던 박스의 값을 리턴한다
    }
}
