package org.kodluyoruz.Abstract;

public interface Queue <T>{
    void add(T t);
    T pool();
    T peek();
}
