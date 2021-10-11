package tests.com.pelatro.uts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

import com.pelatro.uts.Contact;
import com.pelatro.uts.PhoneBook;
public class PhoneBookTesting {
	private PhoneBook pb = new PhoneBook();
	@Test
	public void addContactCase() {
		assertTrue(pb.addContact(new Contact("Aishwarya", "9108036148")));
		assertFalse(pb.addContact(null));
	}
	@Test
	public void removeContactCase() {
		pb.addContact(new Contact("Apoorva", "1234567890"));
		assertTrue(pb.removeContact(new Contact("Apoorva", "1234567890")));
		assertFalse(pb.removeContact(null));
	}
	@Test
	public void countOfContactsCase() {
		pb.addContact(new Contact("Apoorva", "1234567890"));
		pb.addContact(new Contact("Apoorva1", "1234557890"));
		assertEquals(2,pb.countOfContacts());
		assertNotEquals(3, pb.countOfContacts());
	}
}
