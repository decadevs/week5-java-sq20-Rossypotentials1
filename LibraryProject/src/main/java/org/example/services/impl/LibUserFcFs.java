package org.example.services.impl;

import org.example.enums.Gender;
import org.example.model.LibraryUser;
import org.example.services.Queue;

import java.util.ArrayList;
import java.util.List;

public class LibUserFcFs implements Queue <LibraryUser> {
    List <LibraryUser> userList;

    public LibUserFcFs() {
        userList = new ArrayList<>();
        LibraryUser libraryUser1 = new LibraryUser("Peter Pual",12, Gender.MALE,true,false,false, 10);
        LibraryUser libraryUser2 = new LibraryUser("Chidalu Ken",2,Gender.FEMALE,true,false,false,2);
        LibraryUser libraryUser4 = new LibraryUser("Sani usman",2,Gender.FEMALE,true,false,false,10);
        LibraryUser libraryUser5 = new LibraryUser("Mercy water",2,Gender.FEMALE,true,false,false,9);
        userList.add(libraryUser1);
        userList.add(libraryUser2);
        userList.add(libraryUser5);
        userList.add(libraryUser4);




    }

    @Override
    public void add(LibraryUser e) {
        userList = new ArrayList<>();
    }

    @Override
    public LibraryUser remove() {
        return  userList.removeFirst();
    }
}
