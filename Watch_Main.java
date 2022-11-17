package Lab_11;

public class Watch_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tissot tissot = new Tissot();
		tissot.property();
		tissot.display();
		
		Carson carson = new Carson();
		carson.type();
		carson.display();
		
		Seiko seiko = new Seiko();
		seiko.design();
		seiko.display();
		
		Quartz quartz = new Quartz();
		quartz.type();
		quartz.display();
		
	}

}
