/*
 * PERSONALHANTERINGSSYSTEM
 * Receptionist-klass, �rver av Employee-klassen
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
	
	// konstruktor som tar namn, �lder och k�n
	public Receptionist(String name, int age, Gender gender) {
		super(name, age, gender);
	}
	
	// konstruktor som tar namn, �lder, k�n och l�n och anropar baskonstruktorn
	public Receptionist(String name, int age, Gender gender, int salary) {
		super(name, age, gender, salary);
	}
	
	// konstruktor som tar namn, �lder, k�n och l�n och anropar baskonstruktorn
	// stad s�tts h�r i klassen
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
	
	//bonus som anst�lld f�r
	public double bonus(int salary, double bonus) {
		return salary * bonus;
	}


}
