package bitcamp.java100;

    public class Test14_2{
        public static void main(String args[]){
            
            class Book {
                String book,name,pub;
                int page;
                float price;

            }
            
            Book b1;
            b1 = new Book();

            b1.book = "Java Programming";
            b1.name = "JavaMan";
            b1.pub = "USA";
            b1.page = 367;
            b1.price = 76.5f;

            System.out.printf(" 도서명: %s\n 저자: %s\n 출판사: %s\n 페이지수 :%d\n 가격 :%.1f$\n", b1.book, b1.name, b1.pub, b1.page, b1.price);


        }
    }                                                                                   
    
    
 
                          