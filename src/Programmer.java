/*
 * PERSONALHANTERINGSSYSTEM
 * Programmerar-klass, ärver av Employee-klassen
 * Lexicon Liljeholmen, Java4Women, 2016-10-27
 * Nina Eriksson 
 */

public class Programmer extends Employee{

	static int numberOfProgrammers; //totalt antal programmerare
	static double bonus = 0.05; // 5% bonus
	private String adress;


	
	/***************************************    KONSTRUKTORER    ***************************************************/

	// tom konstruktor
	public Programmer() {
		super();
	}
	
	// konstruktor som tar namn, ålder och kön
	public Programmer(String name, int age, Gender gender) {
		super(name, age, gender);
	}
		
	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	public Programmer(String name, int age, Gender gender, int salary) {
		super(name, age, gender, salary);
	}
	
	// konstruktor som tar namn, ålder, kön och lön och anropar baskonstruktorn
	// adress sätts här i klassen
	public Programmer(String name, int age, Gender gender, int salary, String adress) {
		super(name, age, gender, salary);
		this.adress = adress;
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
