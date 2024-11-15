package CH06_02;

public class Car {
	
	
	
	String company; // 자동차 제조회사
	String model; // 자동차 모델
	String color="black"; // 자동차 색깔
	int maxspeed; // 최고 속력
	
	int speed; // 현재 스피드
	int rpm;  // 현재 rpm

	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	
	void drive(int rpm) {
		speed = 50;
		this.rpm = rpm;
		System.out.println(speed);
		System.out.println(this.rpm);
	}
	
	
}
