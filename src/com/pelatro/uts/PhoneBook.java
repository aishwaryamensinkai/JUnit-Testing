package com.pelatro.uts;

import java.util.HashMap;

public class PhoneBook {
	HashMap<String, Contact> contactsMap = new HashMap<String, Contact>();
	public boolean addContact(Contact contact) {
		if(contact == null)
			return false;
		contactsMap.put(contact.name, contact);
		return true;
	}
	public boolean removeContact(Contact contact) {
		if(contact == null)
			return false;
		contactsMap.remove(contact.name);
		return true;
	}
	public boolean updateContact(Contact contact) {
		if(removeContact(contact))
			return false;
		return addContact(contact);
	}
	public Integer countOfContacts() {
		return contactsMap.size();
	}
}
