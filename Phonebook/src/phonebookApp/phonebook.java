package phonebookApp;
import java.util.Scanner;
public class phonebook {
	public static void main(String[] args) {
		System.out.println("Please choose an option:\r\n"
				+ "1. Add a contact\r\n"
				+ "2. Search for a contact\r\n"
				+ "3. Delete a contact\r\n"
				+ "4. Schedule an event\r\n"
				+ "5. Print event details\r\n"
				+ "6. Print contacts by first name\r\n"
				+ "7. Print all events alphabetically\r\n"
				+ "8. Exit");
		Scanner input = new Scanner(System.in);
		boolean y = true;
		int x;
do{
	x=input.nextInt();
	
	switch(x) {
	case 1:
		//add cotact
		break;
	case 2:
		//search contact
		break;
	case 3:
		//delete
		break;
	case 4:
		//schedule
		break;
	case 5:
		//print event
		break;
	case 6:
		//print contact by first name
	case 7:
		break;
		//print all by alpha
	case 8:
		y=false;
		break;
	default:
			
	System.out.println("Re-enter a correct number from 1-8");
		break;
	}
    }while(y);
		

}
}