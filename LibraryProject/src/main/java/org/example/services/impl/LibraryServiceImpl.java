package org.example.services.impl;

import org.example.enums.Gender;
import org.example.model.LibraryBook;
import org.example.model.LibraryUser;
import org.example.services.LibraryService;
import org.example.services.Queue;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService {
     Map<Integer, LibraryBook> books;

    public LibraryServiceImpl() {
        library();

    }

    public String borrowBook(int requestedBookId, Queue<LibraryUser> users){
       LibraryUser libraryUser = users.remove();
       if(!books.containsKey(requestedBookId)){
           return String.format("%s requested book %d that does not exist",libraryUser.getName(),requestedBookId);
       }
       LibraryBook libraryBook = books.get(requestedBookId);
       if(libraryBook.getNumberOfCopies() < 1){
           return "Book have been taken";
       }
       libraryBook.setNumberOfCopies(libraryBook.getNumberOfCopies()-1);
       return String.format("%s You have been successfully assigned a book titled %s",libraryUser.getName(), libraryBook.getBookTitle());
    }

    @Override
    public String returnBook(LibraryUser libraryUser, LibraryBook libraryBook) {
        if (!books.containsValue(libraryBook)) {
            return "Not a library book";
        } else {
            libraryBook.setNumberOfCopies(libraryBook.getNumberOfCopies() + 1);
            return String.format("%s , thank you for Returning the library book titled %s", libraryUser.getName(), libraryBook.getBookTitle());
        }
    }

    private void library(){
        LibraryBook book1 = new LibraryBook("Things fall apart", "Emmanuel John",2,2,true);
        LibraryBook book2 = new LibraryBook("Juniour School Maths", "Dango Jang",2,3,true);
        LibraryBook book3 = new LibraryBook("Economics", "Peter Parker",4,4,true);
        LibraryBook book4 = new LibraryBook("Oxford Dictionary", "Harry Mango",1,5,true);
        LibraryBook book5 = new LibraryBook("Intro Technology", "Yewul Fishma",7,6,true);
        LibraryBook book6 = new LibraryBook("Joys of Motherhood", "Eavas Thankgod",2,7,true);
        LibraryBook book7 = new LibraryBook("Home Economics", "Abubakar Praise",6,8,true);

        List<LibraryBook> libraryBookList = Arrays.asList(book1, book2, book3, book4, book5, book6, book7);
        books = libraryBookList.stream().collect(Collectors.toMap(LibraryBook::getId, Function.identity()));

//        for (LibraryBook book : libraryBookList) {
//            books.put(book.getId(), book1);
//            books.put(book.getId(), book2);
//            books.put(book.getId(), book3);
//            books.put(book.getId(), book4);
//            books.put(book.getId(), book5);
//        }

    }

    //Second  implementation based on First come, first Served basis
    ArrayList <LibraryUser> firstComeList = new ArrayList<>();
  public ArrayList<LibraryUser> fcfc () {
        LibraryUser user1 = new LibraryUser("Peter Pual",12, Gender.MALE,false,false,true, 2);
        LibraryUser user2 = new LibraryUser("Patience Amal",11, Gender.FEMALE,false,true,true, 5);
        LibraryUser user3 = new LibraryUser("Nnene daberechi",13, Gender.MALE,true,false,true, 10);
        LibraryUser user4 = new LibraryUser("Ogene Fejiro",14, Gender.MALE,false,false,true, 2);
        LibraryUser user5 = new LibraryUser("Onaivi Nonso",16, Gender.MALE,true,false,false, 10);
        firstComeList.add(user1);
        firstComeList.add(user2);
        firstComeList.add(user3);
        firstComeList.add(user4);
        firstComeList.add(user5);
      System.out.println("Attending to Library Users based on first come First Serve basis");
        for (LibraryUser users : firstComeList){
            System.out.println(users);
        }
        return firstComeList;
  }

}


























//
//    @Override
//    public void addUsersToQueue(LibraryUser libraryUser) {
//    }


//    @Override
//    public String BorrowBookRequest(LibraryUser libraryUser, LibraryBook libraryBooks) {
//        if (libraryBooks.equals(libraryBooks.getBookTitle())) {
//            libraryBooks.setNumberOfCopies(libraryBooks.getNumberOfCopies() - 1);
//
//            return "Book Successfully Borrowed by You " + libraryUser.getName() + ", " + libraryBooks.getBookTitle();
//        } else {
//            return libraryBooks + " Book Taken";
//        }
//    }

//    @Override
//    public String returnBook(LibraryUser libraryUser, LibraryBook libraryBooks) {
//
//        if (libraryBooks.equals(libraryBooks.getBookTitle())) {
//            libraryBooks.setNumberOfCopies(libraryBooks.getNumberOfCopies() + 1);
//            return libraryUser.getName() + " Thanks for returning  the Library book titled" + libraryBooks.getBookTitle();
//        } else {
//            return libraryBooks + " Not from our Library";
//        }
//    }