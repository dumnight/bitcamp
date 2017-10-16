package bitcamp.java100;

public class TestHB{
    
    public static void main(String[] args) {
        int i = 10;
        Integer obj = new Integer(10);
        
      int x = obj.intValue();
      String str = obj.toString();
      
      byte b = obj.byteValue();
      short s = obj.shortValue();
      long l = obj.longValue();
      float f = obj.floatValue();
      double d = obj.doubleValue();
      
      System.out.println(obj.compareTo(new Integer(5)));;
      System.out.println(obj.compareTo(new Integer(10)));;
      System.out.println(obj.compareTo(new Integer(20)));;
      
    }
    
}   