/*
 * PERSONALHANTERINGSSYSTEM
 * Receptionist-klass, ärver av Employee-klassen
 * Lexicon Liljeholmen, Java4Women, 2016-10-27
 * Nina Eriksson 
 */

public class Receptionist extends Employee{

	static int numberOfReceptionist; //totalt antal receptionister
	static double bonus = 0.04; // 4% bonus
	private String city;
	

	
	/***************************************    KONSTRUKTORER    ***************************************************/

	// tom konstruktor
	public Receptionist() {
		super();
	}
	
	// konstruktor som tar namn, ålder och kön
	public Receptionist(String name, int age, Gender gender) {
		super(name, age, gender);
	}
	
	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	public Receptionist(String name, int age, Gender gender, int salary) {
		super(name, age, gender, salary);
	}
	
	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	// stad sätts här i klassen
	public Receptionist(String name, int age, Gender gender, int salary, int phoneNumber, String city) {
		super(name, age, gender, salary);
		this.city = city;
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
