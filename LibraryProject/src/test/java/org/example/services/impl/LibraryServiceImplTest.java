package org.example.services.impl;

import org.example.enums.Gender;
import org.example.model.LibraryBook;
import org.example.model.LibraryUser;
import org.example.services.Queue;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @Test
    void borrowBook() {

        //Mock Library user
        LibraryUser libraryUser = new LibraryUser("Peter Pual",12, Gender.MALE,false,false,true, 2);

        //Mock Library books
        LibraryBook libraryBook = new LibraryBook("Things fall apart", "Emmanuel John",2,2,true);

        //Create an instance of LibraryServiceImpl
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        Queue<LibraryUser> userPriorityQueue = new LibUserPriorityQueue();

        //Act
        libraryService.borrowBook(12,userPriorityQueue);
        String actual = String.format("%s You have been successfully assigned a book titled %s",libraryUser.getName(), libraryBook.getBookTitle());

        //String expected = String.format( "%s You have been successfully assigned a book titled %s",libraryUser.getName(), libraryBook.getBookTitle());
        String expected = "Peter Pual You have been successfully assigned a book titled Things fall apart";

        assertEquals(expected,actual);
    }

    @Test
    void returnBook() {


        //Mock Library user
        LibraryUser libraryUser = new LibraryUser("ThankGod Chukwu",2,Gender.FEMALE,false,false,true,2);

        //Mock Library books
        LibraryBook libraryBook = new LibraryBook("Oxford Dictionary", "Harry Mango",1,5,true);;

        //Create an instance of LibraryServiceImpl
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        Queue<LibraryUser> userPriorityQueue = new LibUserPriorityQueue();

        //Act
        libraryService.borrowBook(12,userPriorityQueue);
        String actual = String.format("%s , thank you for Returning the library book titled %s", libraryUser.getName(), libraryBook.getBookTitle());

        //String expected = String.format( "%s You have been successfully assigned a book titled %s",libraryUser.getName(), libraryBook.getBookTitle());
        String expected = "ThankGod Chukwu , thank you for Returning the library book titled  Oxford Dictionary";
    }



    }
