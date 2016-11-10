/*
 * PERSONALHANTERINGSSYSTEM
 * Tekniker-klass, �rver av Employee-klassen
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

	// konstruktor som tar namn, �lder och k�n
	public Technician(String name, int age, Gender gender) {
		super(name, age, gender);
	}
	
	// konstruktor som tar namn, �lder, k�n och l�n och anropar baskonstruktorn
	public Technician(String name, int age, Gender gender, int salary) {
		super(name, age, gender, salary);
	}

	// konstruktor som tar namn, �lder, k�n och l�n och anropar baskonstruktorn
	// telefonnummer s�tts h�r i klassen
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
	
	//bonus som anst�lld f�r
	public double bonus(int salary, double bonus) {
		return salary * bonus;
	}
	
	


}
