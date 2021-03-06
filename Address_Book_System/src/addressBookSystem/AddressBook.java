package addressBookSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface{
	public static ArrayList<ContactPerson> personData = new ArrayList<ContactPerson>();
// Add person details
 	public void addPerson() {
 		
	    Scanner data = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = data.nextLine();
		System.out.println("Enter Last Name");
		String lastName = data.nextLine();
		System.out.println("Enter Phone Number");
		String phone = data.nextLine();
		System.out.println("Enter City Name");
		String city = data.nextLine();
		System.out.println("Enter State ");
		String state = data.nextLine();
		System.out.println("Enter Zip Code");
		String zip = data.nextLine();
		System.out.println("Enter Email Id");
		String email = data.nextLine();
		ContactPerson person = new ContactPerson(firstName, lastName, phone, city, state, zip, email);
		personData.add(person);
		System.out.println("Array of Person : "+personData);

	}
// Edit Person details
 	public void editPerson() {

		System.out.println("Enter person First Name to Edit person details");
		Scanner edit = new Scanner(System.in);
		String firstName = edit.nextLine();
		boolean exists = false;
		
		  for (ContactPerson person:personData) {
			 
				  if (firstName.equals(person.firstName)) {
					  exists = true;
					  while (exists == true) {
					  System.out.println("Select an option to edit\n" 
							     +"1] Phone Number\n"
							     +"2] City\n"
							     +"3] State\n"
							     +"4] ZipCode\n"
							     +"5] Email\n"
							     +"6] quit");

					  		Scanner option = new Scanner(System.in);
					  		int num = option.nextInt();
					  		Scanner input = new Scanner(System.in);
					  				switch (num) {
										case 1:
					  						System.out.println("Enter New Phone Number");
					  						String phone = input.nextLine();
					  						person.setPhone(phone);
					  						System.out.println(person.toString());
											System.out.println("*****Phone number Edited Successfully*****");
											       break;
					  					case 2:
					  						System.out.println("Enter New City Name");
					  						String city = input.nextLine();
					  						person.setCity(city);
					  						System.out.println(person.toString());
											System.out.println("*****City Name Edited Successfully*****");
												break;
					  					case 3:
					  						System.out.println("Enter New State Name");
					  						String state = input.nextLine();
					  						person.setState(state);
					  						System.out.println(person.toString());
											System.out.println("*****State Name Edited Successfully*****");
												break;
					  					case 4:
					  						System.out.println("Enter New Zip Code");
					  						String zip = input.nextLine();
					  						person.setZip(zip);
					  						System.out.println(person.toString());
											System.out.println("*****Zip Code Edited Successfully*****");
					  							break;
					  					case 5:
					  						System.out.println("Enter New Email Address");
					  						String email = input.nextLine();
					  						person.setEmail(email);
					  						System.out.println(person.toString());
											System.out.println("*****Email  Edited Successfully*****");
												break;
					  					case 6:
					  						exists = false;
					  							break;
					  					default :
				  						System.out.println("Invalid input");
					  							break;
					  				}
					  		  }
				  		}

				  else {
					  			System.out.println("Record Not Found");

				  	}
		      }
 	  	}
 // Delete Person Details	
 	public void deletePerson() {

		System.out.println("Enter person First Name to delete details");
		Scanner remove = new Scanner(System.in);
		boolean delete = false;
		String firstName = remove.nextLine();

				for (int i=0; i<personData.size(); i++) {
					String name = personData.get(i).firstName;
						if (firstName.equals(name)) {
							delete = true;	
								while (delete == true) {
									System.out.println("**Warning: Are you sure you want to delete** \n"
											   			+"Enter 1 for yes\n"
											   			+ "Enter 2 for Quit");
									int entry = remove.nextInt();	
											switch (entry) {
												case 1:
													personData.remove(i);
													System.out.println("Person details deleted");
												 	break;
												case 2:
													delete = false;
													break;
												default:
													System.out.println("Invalid Entry");
													break;
											}
											break;
								    }
								
							}		
					   else {		
						   System.out.println("Record Not Found");		
					   }		
				   }
 			}
}
