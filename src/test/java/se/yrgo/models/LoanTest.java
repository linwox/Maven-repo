package se.yrgo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testGetDueDate() {
		Book book1 = new Book(1,"Learning Java","","","",0);
		Customer customer1 = new Customer("Mrs", "Clarissa", "Dalloway", "", "", "", 1, GenderType.FEMALE);
		Loan loan1 = new Loan(1, customer1, book1);
		assertEquals(LocalDate.now().plusDays(14), loan1.getDueDate());
   }
}