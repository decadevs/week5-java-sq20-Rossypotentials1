package org.example.services;

public interface Queue <T>{
     void add(T e);
     T remove();
}
