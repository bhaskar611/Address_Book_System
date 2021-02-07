package addressBookSystem;
import java.util.Scanner;
public class AddressBookMainClass {
	public static void main(String[] args) {	
		AddressBook addressBook = new AddressBook();
	System.out.println("*******WELCOME TO ADDRESS BOOK PROGRAM*******");
	int openAb=0;
	while (openAb == 0) {
		System.out.println("");
		System.out.println("1]Add Person\n" 
							+ "2]Edit Person\n" 
							+ "3]Delete Person\n" 
							+ "4]Quit");
		System.out.println("Select from above Options");
		Scanner num = new Scanner(System.in);
		int selectedValue = num.nextInt();

             switch (selectedValue) {
		case 1:			      
		      System.out.println("");
		      addressBook.addPerson();
			break;
		case 2:
		      System.out.println("");
		      addressBook.editPerson();
		      break;
		case 3:
		      System.out.println("");
		      addressBook.deletePerson();
		      break;
		case 4:
			openAb=1;
			break;
		default:
			System.out.println("Invalid Option");
			break;
              }
		}
  }
}

