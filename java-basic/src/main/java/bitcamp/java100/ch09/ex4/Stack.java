//Stack 방식으로 데이터 목록 관리 
package bitcamp.java100.ch09.ex4;

//밖에 두면 패키지멤버 클래스가 된다
public class Stack {
    //Inner class
    private class Box {
        Object value;
        Box next;
        
        public Box(Object value) {
            this.value = value;
        }
    }
    //꼭대기 상자 주소를 리턴
    Box top;
    
    int len;
    
    public void push(Object value) {
        // 새 상자를 만들어 값을 저장한다 
        Box box = new Box(value);

        //새 상자가 이전의 꼭대기 상자를 가리키게 한다
        box.next = top;
        
        //꼭대기를 새 상자로 바꾼다
        top = box;
        
        //상자 개수를 증가시킨다
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object pop() {
        if(len == 0)
            return null;
        
        //리턴할 값을 담은 Box의 주소를 보관한다
        Box box = top;
        
        //꼭대기 상자를 이전 상자로 바꾼다
        top = top.next;
        
        len--; // 상자의 개수를 줄인다
        return box.value; // 처음 탑이 가리켰던 박스의 값을 리턴한다
    }
}
