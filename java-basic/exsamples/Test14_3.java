package bitcamp.java100;

    public class Test14_3{
        public static void main(String args[]){
            //비트캠프의 수강생 정보를 저장할 데이터 타입.
            //이름, 거주지, 나이, 번호, 학점
            class Student{
                String name,city,tel,createdDate;
                int age;
                boolean gender;
                double aver;
                

            }
            
            Student c1;
            c1 = new Student();

            c1.name = "김코딩";
            c1.city = "수원시";
            c1.age = 999;
            c1.tel = "010-111-1111";
            c1.aver = 4.55945745748;

            System.out.printf(" 이름 : %s\n 거주지: %s\n 나이: %d세\n 번호: %s\n 학점: %.5f\n", c1.name, c1.city, c1.age, c1.tel, c1.aver );


        }
    }                                                                                   
    
    
 
                          