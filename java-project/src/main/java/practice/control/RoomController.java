package practice.control;

import java.util.Iterator;

import practice.domain.Room;
import practice.util.Prompts;

public class RoomController extends GenericController<Room> {
	
	
	public void execute() {
		loop:
		while(true) {
			System.out.print("강의실 관리> ");
		  	String input = keyScan.nextLine();
		          
		  		switch (input) {
		  		case "list": doList(); break;
				case "add": doAdd();break;
				case "delete": doDelete(); break;
				case "main": break loop;
				default: 
					System.out.println("해당 명령이 없습니다");
	  		}
		}
	}
	private void doDelete() {
    	System.out.println("강의실삭제");
        String roomName = Prompts.inputString("강의실 이름: ");
        Room room = find(roomName);
        if(room == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", roomName);
            return;
        } 
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(room);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        
	}
	}
	private void doList() {
    	System.out.println("강의실목록");
        Iterator<Room> iterator = list.iterator();
        while(iterator.hasNext()) {
        	Room room = iterator.next();
                System.out.printf("%s, %s, %d\n",  
                        room.getLocation(), 
                        room.getNo(), 
                        room.getCapacity());
        }
	}
	private void doAdd() {
    	System.out.println("성적 등록");
            Room room = new Room();
            
            room.setNo(Prompts.inputString("강의실 이름? "));
            
            if(find(room.getNo()) != null) {
            	System.out.println("이미 등록된 강의실입니다");
            	return;
            }
            room.setLocation(Prompts.inputString("지역"));
            room.setCapacity(Prompts.inputInt("수용인원"));
            list.add(room);
	}
	private Room find(String roomName) {
		Iterator<Room> iterator = list.iterator();
        while(iterator.hasNext()){
            Room room = iterator.next();
            if(room.getNo().equals(roomName)) {
                return room;
            }
        }
        return null;
	}
}
