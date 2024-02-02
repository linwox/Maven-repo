package se.yrgo.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddBook() {
		Book book2 = new Book(2,"Learning Java 2","","","",0);
		bc.addBook(book2);
		assertEquals(2, bc.getNumberOfBooks());
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertEquals(book1,
				bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("LEARNING JAVA"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertEquals(book1,
				bc.findBook(" Learning Java "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class, () ->
				bc.findBook("Learning Java 3"));
	}

}
