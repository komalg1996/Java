package tester;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class EventOrganizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity: ");
		// create suitable data structure to hold participant details
		Person[] participants = new Person[sc.nextInt()];
		boolean exit = false;
		int counter = 0; // counter shud not exced while workomh with arrays
		while (!exit) {
			System.out.println(
					"Menu :  1. Register Student 2.Register Faculty 3. Display participant details" + "10 Exit ");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:// register student
				if (counter < participants.length) {
					System.out.println("Enter Student Details : fn, ln, gradYear, courseName, fees, marks");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());
				} else
					System.out.println("Event Full...!!!");

				break;
			case 2:
				if (counter < participants.length) {
					System.out.println("Enter Faculty Details : fn, ln, expInYears, sme ");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full...!!!");
				break;
			case 3:// display all participant details
				for (Person p : participants)//p=participants[0]....
					if(p!=null)
						System.out.println(p);
					break;
			case 10:
				exit = true;
				break;

			}
		}

		sc.close();
		System.out.println("main over");
	}
}
