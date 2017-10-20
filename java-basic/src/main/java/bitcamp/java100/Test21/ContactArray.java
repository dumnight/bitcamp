package bitcamp.java100.Test21;

import bitcamp.java100.Test21.step10.Contact;

    public class ContactArray {
        static Contact[] contacts = new Contact[100];  // 분리 2번째 순서
        //값이 저장될 위치
        static int cursor = 0;
        
        public static void add(Contact contact) {              //분리 5번째 순서
            if (cursor >= contacts.length)               //10번째 1 예외처리
                throw new RuntimeException("최대 저장 개수 초과");
            contacts[cursor] = contact;
            cursor++; //증가시킬 값은 입력후에 위치하게 한다 
        }
        
        public static Contact get(int index) {                    //6번째 순서
            if(index < 0 || index >= cursor)              //번째
                throw new RuntimeException("유효 하지 않은 인덱스");
            return contacts[index];
        }
        
        public static int size() {                                //7번째 순서
            return cursor;
        }
}
