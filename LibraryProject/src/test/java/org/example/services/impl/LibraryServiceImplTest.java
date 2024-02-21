package org.example.services.impl;

import org.example.enums.Gender;
import org.example.model.LibraryBook;
import org.example.model.LibraryUser;
import org.example.services.Queue;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @Test
    void borrowBook() {

        //Mock Library user
        LibraryUser libraryUser = new LibraryUser("Peter Pual",12, Gender.MALE,false,false,true, 2);

        //Mock Library books
        LibraryBook libraryBook = new LibraryBook("Things fall apart", "Emmanuel John",2,2,true);

        //Create an instance of TeacherServiceImpl
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        //ByteArrayOutputStream actual = new ByteArrayOutputStream();
        //System.setOut(new PrintStream(actual));

        Queue<LibraryUser> userPriorityQueue = new LibUserPriorityQueue();

        //Act
        libraryService.borrowBook(12,userPriorityQueue);
        String actual = libraryService.borrowBook(12,userPriorityQueue);
        //String expected = String.format( "%s You have been successfully assigned a book titled %s",libraryUser.getName(), libraryBook.getBookTitle());
        String expected = "Emmanuel John You have been successfully assigned a book titled Things fall apart";

        assertEquals(expected,actual);
    }

    @Test
    void returnBook() {
    }

    @Test
    void fcfc() {
    }
}