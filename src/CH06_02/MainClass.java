package CH06_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Hyundai", "sonata");  // 인스턴스(객체) 생성
		System.out.println(car1.maxspeed);  //200
//		car1.company = "Hyundai";
		car1.drive();  // 50
		Car car2 = new Car("kia", "K5");  // 인스턴스(객체) 생성
//		car2.company = "Kia";
		

	}

}
