package com.AddressBook_Workshop;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
	@Test
	public void givenContactCheckifItIsCorrect() {
		try {
			Contacts contacts = new Contacts("Priyanka", "Dombale", "Kamothe, New Panvel", "Mumbai", "Maharashtra",
					"400088", "987654321", "abc@gmail.com");
			AddressBookMain addressBook = new AddressBookMain();
			addressBook.addContact(contacts);
			List<Contacts> contactList = addressBook.getcontactList();
			Assert.assertTrue(contactList.contains(contacts));
			System.out.println(contactList);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
