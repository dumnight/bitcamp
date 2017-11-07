package bitcamp.java100.ch11.ex2;

public class Test1 {
	public static void main(String[] args) {
		Sedan car = new Sedan();
		car.model = "소나타";
		car.cc = 1980;
		
		car.openSunloof();
		car.run();
		car.closeSunloof();
		car.run();
		car.stop();
	}
}
