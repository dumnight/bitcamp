//Box를 이용하여 여러개의 값을 보관하고 꺼내는 일을 한다
//값을 저장할 때 Box에 보관한다
//체인 처럼 Box와 Box 사이에 주소를 이용하여 연결을 관리한다
package bitcamp.java100.ch09.ex3;

//밖에 두면 패키지멤버 클래스가 된다
public class Linkedlist {
    //Inner class
    class Box {
        Object value;
        Box next;
    }
    
    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        //상자 준비
        Box box = new Box();
        //값을 담는다
        box.value = value;
        //목록의 끝에 상자 연결
        if(tail == null) {
            head = box;
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object get(int index) {
        if(index < 0 || index >= len)
            return null;
        
        Box box = head;
        for(int count = 1; count <= index; count++) {
            box = box.next;
        }
        return box.value;
    }
    
    public void insert(int index, Object value) {
        if(index < 0 || index >= len)
            return;
        
        Box box = new Box();
        box.value = value;
        
        len++;

        //index 가 0일경우
        if(index == 0) {
            box.next = head;
            head = box;
            return;
        }
        
        Box pre = head;
        
        //값을 삽입할 박스 위치의 바로 전 위치르 알아낸다
        for(int count = 1; count < index; count++) {
            pre = pre.next;
        }
        // 세 박스가 삽입할 위치의 박스를 가리키게 한다
        box.next= pre.next;
        // 바로 전 박스는 새 박스를 가리키게 된다
        pre.next = box;
        
    }
    
    public Object remove(int index) {
        if(index < 0 || index >= len)
            return null;
        
        len--;
        Box removedBox;
        
        if(index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }
        
        Box pre = head;
        
        //삭제할 박스 위치의 바로 전 위치를 알아낸다
        for(int count = 1; count < index; count++) {
            pre = pre.next;
        }
        
        removedBox = pre.next;
        pre.next = pre.next.next;
        
        //마지막 상자를 제거했다면 tail을 이전 상자로 이동한다
        if(index == len -1) {
            tail = pre;
        }
        return removedBox.value;
    }
}
