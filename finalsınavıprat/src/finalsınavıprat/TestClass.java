package finalsınavıprat;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Flight flight = new Flight("HHFHFJ","abc","ERCANSS","mehmet12",12,true);
		
		Passenger passenger = new Passenger("Mustafa","HGKJFKF","f12");
		Passenger passenger1 = new Passenger("Ahmet","AKKSKSKSK","g34");
		Passenger passenger2 =new Passenger("Ali","KSLSLSLSLLS","a12");
		
		
		System.out.println("Uçuş bilgileri:"+flight);
		
		System.out.println(" Passenger1 'in bilgileri " + passenger1);
		System.out.println(" Passenger2'nin bilgileri: " + passenger2);
		System.out.println(" Passenge3 bilgileri:  " + passenger2);

		
	}

}
