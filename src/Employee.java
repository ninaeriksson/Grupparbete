/*
 * PERSONALHANTERINGSSYSTEM
 * Personal-klass, har n�gra subklasser
 * Lexicon Liljeholmen, Java4Women, 2016-10-27
 * Nina Eriksson 
 */

public class Employee {

	static int numberOfStaff; //totalt antal anst�llda
	private String name;
	private int age;
	private Gender gender;
	private int salary;

	

	/***************************************    KONSTRUKTORER    ***************************************************/
	
	// tom konstruktor
	public Employee() { }

	// konstruktor som tar namn, �lder och k�n
	public Employee (String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// konstruktor som tar namn, �lder, k�n och l�n
	public Employee (String name, int age, Gender gender, int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}


	/*****************************************    GET() AND SET()    ********************************************/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	/***************************************    METODER    ***************************************************/


	@Override
	public String toString() {
		return name + " �r " + age + " �r gammal och tj�nar " + salary + " kronor i m�naden.";
	}


}
