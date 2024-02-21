package org.example.services;

import org.example.model.LibraryBook;
import org.example.model.LibraryUser;

public interface LibraryService {
   // public String BorrowBookRequest(LibraryUser libraryUser, LibraryBook libraryBook);
    public String  returnBook (LibraryUser libraryUser, LibraryBook libraryBook);

    //public  void addUsersToQueue(LibraryUser libraryUser);


}
