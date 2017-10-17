package bitcamp.java100.Test17_17.step6;


public class Rect {
       int width;
       int height;
       
       
       //인스턴스 메서드로 만들기
       // 1)static  키워드를 제거
       // 2)인스턴스를 다룰 때 파라미터 대신 내장 변수 this를 사용
       // - 인스턴스 전용 메서드를 호출하려면 인스턴스 주소를 사용해야 한다
       // - 그 주소는 저장된 내장 변수 this에 자동 저장된다.
       
       // 평방미터를 구하는 메서드
       float area(){
           return(this.width * this.height) / 10000f; 
       }
       // 평을 구하는 메서드
       float pyeong() {
           return(this.width * this.height) / 10000f / 3.3f;
       }
    

    
}
