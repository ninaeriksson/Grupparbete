/*
 * PERSONALHANTERINGSSYSTEM
 * Main-klass
 * Lexicon Liljeholmen, Java4Women, 2016-10-27
 * Nina Eriksson 
 */

import java.util.ArrayList;


public class Company {

	public static void main(String[] args) {

		Company myCompany = new Company();
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		myCompany.seedEmployees(myEmployees);
		//myEmployees.mainMenu();
	}




	private void mainMenu() {
		System.out.println("\nVälkommen till Personalhanteringssystemet\n");
		System.out.println("\nVälj från meny");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. Personalhantering (registrera, uppdatera, radera)");
		System.out.println("2. Statistik");
		System.out.println("0. Avsluta");
		System.out.println("Välj: ");
	}

	private void staffMenu() {
		System.out.println("\nVälj från meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Registera anställd");
		System.out.println("2. Radera anställd");
		System.out.println("3. Uppdatera anställd");
		System.out.println("4. Visa information om anställd");
		System.out.println("5. Lista samtliga anställda");
		System.out.println("6. Lista samtliga tekniker");
		System.out.println("7. Lista samtliga receptionister");
		System.out.println("8. Lista samtliga programmerare");
		System.out.println("9. Återgå till huvudmeny\n");
		System.out.println("0. Avsluta");
		System.out.println("Välj: ");
	}

	private void statisticMenu() {
		System.out.println("\nVälj från meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Medellön på företaget");
		System.out.println("2. Högsta lön på företaget");
		System.out.println("3. Lägsta lön på företaget");
		System.out.println("4. Total bonus på företaget");
		System.out.println("5. Kvinnor i procent på företaget");
		System.out.println("6. Män i procent i de olika arbetsrollerna");
		System.out.println("7. Återgå till huvudmeny\n");
		System.out.println("0. Avsluta");
		System.out.println("Välj: ");
	}

	private void updateStaff() {
		System.out.println("\nVilka uppgifter vill du uppdatera");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Namn");
		System.out.println("2. Ålder");
		System.out.println("3. Lön");
		System.out.println("4. Återgå till meny\n");
		System.out.println("0. Avsluta");
		System.out.println("Välj: ");
	}

	
	//skapar flera objekt av typen anställda
	private void seedEmployees(ArrayList<Employee> employees) {
		employees.add(new Technician());
		employees.add(new Technician());
		employees.add(new Technician());
		employees.add(new Technician());
		employees.add(new Receptionist());
		employees.add(new Receptionist());
		employees.add(new Receptionist());
		employees.add(new Receptionist());
		employees.add(new Programmer());
		employees.add(new Programmer());
		employees.add(new Programmer());
		employees.add(new Programmer());
	}

}	


