package com.AddressBook_Workshop;

import java.util.ArrayList;
import java.util.List;

/*
 * @Purpose : List And AddContact function
 * @Param: Contacts
 * @return : ContactList
 */
public class AddressBookMain {
	List<Contacts> contactList = new ArrayList<Contacts>();

	public void addContact(Contacts contacts) {
		contactList.add(contacts);
	}

	public List<Contacts> getcontactList() {
		return contactList;
	}

}
