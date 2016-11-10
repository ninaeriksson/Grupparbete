/*
 * PERSONALHANTERINGSSYSTEM
 * Tekniker-klass, ärver av Employee-klassen
 * Lexicon Liljeholmen, Java4Women, 2016-10-27
 * Nina Eriksson 
 */

public class Technician extends Employee{

	static int numberOfTechnicians; //totalt antal tekniker
	static double bonus = 0.03; // 3% bonus
	private int phoneNumber;
	


	
	/***************************************    KONSTRUKTORER    ***************************************************/

	// tom konstruktor
	public Technician() {
		super();
	}

	// konstruktor som tar namn, ålder och kön
	public Technician(String name, int age, Gender gender) {
		super(name, age, gender);
	}
	
	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	public Technician(String name, int age, Gender gender, int salary) {
		super(name, age, gender, salary);
	}

	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	// telefonnummer sätts här i klassen
	public Technician(String name, int age, Gender gender, int salary, int phoneNumber) {
		super(name, age, gender, salary);
		this.phoneNumber = phoneNumber;
	}


	/*****************************************    GET() AND SET()    ********************************************/




	/***************************************    METODER    ***************************************************/

	@Override
	public String toString() {
		return "xxxxxxxxxxxxxxxxxxxxxxxx";
	}
	
	//bonus som anställd får
	public double bonus(int salary, double bonus) {
		return salary * bonus;
	}
	
	


}
