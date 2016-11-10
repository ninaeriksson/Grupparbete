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
		System.out.println("\nV�lkommen till Personalhanteringssystemet\n");
		System.out.println("\nV�lj fr�n meny");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. Personalhantering (registrera, uppdatera, radera)");
		System.out.println("2. Statistik");
		System.out.println("0. Avsluta");
		System.out.println("V�lj: ");
	}

	private void staffMenu() {
		System.out.println("\nV�lj fr�n meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Registera anst�lld");
		System.out.println("2. Radera anst�lld");
		System.out.println("3. Uppdatera anst�lld");
		System.out.println("4. Visa information om anst�lld");
		System.out.println("5. Lista samtliga anst�llda");
		System.out.println("6. Lista samtliga tekniker");
		System.out.println("7. Lista samtliga receptionister");
		System.out.println("8. Lista samtliga programmerare");
		System.out.println("9. �terg� till huvudmeny\n");
		System.out.println("0. Avsluta");
		System.out.println("V�lj: ");
	}

	private void statisticMenu() {
		System.out.println("\nV�lj fr�n meny");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Medell�n p� f�retaget");
		System.out.println("2. H�gsta l�n p� f�retaget");
		System.out.println("3. L�gsta l�n p� f�retaget");
		System.out.println("4. Total bonus p� f�retaget");
		System.out.println("5. Kvinnor i procent p� f�retaget");
		System.out.println("6. M�n i procent i de olika arbetsrollerna");
		System.out.println("7. �terg� till huvudmeny\n");
		System.out.println("0. Avsluta");
		System.out.println("V�lj: ");
	}

	private void updateStaff() {
		System.out.println("\nVilka uppgifter vill du uppdatera");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Namn");
		System.out.println("2. �lder");
		System.out.println("3. L�n");
		System.out.println("4. �terg� till meny\n");
		System.out.println("0. Avsluta");
		System.out.println("V�lj: ");
	}

	
	//skapar flera objekt av typen anst�llda
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


