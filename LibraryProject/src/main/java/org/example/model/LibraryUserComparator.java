package org.example.model;

import java.util.Comparator;

public class LibraryUserComparator implements Comparator<LibraryUser> {
    @Override
    public int compare(LibraryUser p1, LibraryUser p2) {
        if (p1.getPriority() < p2.getPriority()) {
            return 1;
        }  else {
            return -1;
        }
    }
}
