package com.step.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {
    @Test
    public void shouldBorrowABook() {
        Reader ram = new Reader("Ram");
        ram.borrowBook(new Book("C"));
        assertEquals(1, ram.getBooks().size());
    }

    @Test
    public void shouldReturnABook() {
        Reader ram = new Reader("Ram");
        Book c = new Book("C");
        ram.borrowBook(c);
        assertEquals(1, ram.getBooks().size());

        ram.returnBook(c);
        assertEquals(0, ram.getBooks().size());
    }

}