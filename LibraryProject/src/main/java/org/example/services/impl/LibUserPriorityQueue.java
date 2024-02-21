package org.example.services.impl;

import org.example.enums.Gender;
import org.example.model.LibraryUser;
import org.example.model.LibraryUserComparator;
import org.example.services.Queue;

import java.util.PriorityQueue;


//First Implementation based on User Priority
public class LibUserPriorityQueue implements Queue <LibraryUser> {
    PriorityQueue <LibraryUser>priorityQueue = new PriorityQueue<>(new LibraryUserComparator());
    public LibUserPriorityQueue() {
        LibraryUser libraryUser1 = new LibraryUser("Peter Pual",12, Gender.MALE,false,false,true, 2);
        LibraryUser libraryUser2 = new LibraryUser("Nonso Faith",2,Gender.FEMALE,true,false,false,10);
        LibraryUser libraryUser4 = new LibraryUser("Ijeuwa Dalu",2,Gender.FEMALE,false,true,false,5);
        LibraryUser libraryUser6 = new LibraryUser("Peter Pual",12, Gender.MALE,true,false,false, 10);
        LibraryUser libraryUser3 = new LibraryUser("Ijeuwa Dalu",2,Gender.FEMALE,false,true,false,5);
        LibraryUser libraryUser5 = new LibraryUser("ThankGod Chukwu",2,Gender.FEMALE,false,false,true,2);
        priorityQueue.add(libraryUser1);
        priorityQueue.add(libraryUser2);
        priorityQueue.add(libraryUser6);
        priorityQueue.add(libraryUser3);
        priorityQueue.add(libraryUser4);
        priorityQueue.add(libraryUser5);
    }

    @Override
    public void add(LibraryUser e) {
        priorityQueue.add(e);
    }

    @Override
    public LibraryUser remove() {
        return priorityQueue.poll();
    }
}
