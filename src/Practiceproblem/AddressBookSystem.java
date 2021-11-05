package Practiceproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	static ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();

	public static void main(String[] args) {
		Address rv = new Address();
		AddressBook addressBook = rv.GetAddressBook();
		contactList.add(addressBook);
		for (AddressBook value : contactList) {
			System.out.println("FirstName : " + value.FirstName);
			System.out.println("LastName : " + value.LastName);
			System.out.println("Address : " + value.Address);
			System.out.println("EmailId : " + value.EmailId);
			System.out.println("MobileNumber : " + value.MobileNumber);
			System.out.println("State : " + value.State);
			System.out.println("Zip : " + value.Zip);
		}
	}
}

// Address book for single person
class Address {
	AddressBook GetAddressBook() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = userInput.nextLine();
		System.out.println("Enter last name");
		String lastName = userInput.nextLine();
		System.out.println("Enter Address");
		String address = userInput.nextLine();
		System.out.println("Enter State");
		String state = userInput.nextLine();
		System.out.println("Enter Zip");
		String zip = userInput.nextLine();
		System.out.println("Enter Phone number");
		long Phone_number = userInput.nextLong();
		System.out.println("Enter email");
		String email = userInput.next();

		AddressBook addressBook = new AddressBook();
		addressBook.FirstName = firstName;
		addressBook.LastName = lastName;
		addressBook.Address = address;
		addressBook.State = state;
		addressBook.Zip = zip;
		addressBook.MobileNumber = String.valueOf(Phone_number);
		addressBook.EmailId = email;
		return addressBook;
	}
}

class contacts {
	public String MobileNumber;
	public String EmailId;
}

class AddressBook extends contacts {
	public String FirstName;
	public String LastName;
	public String Address;
	public String State;
	public String Zip;
}
