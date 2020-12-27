package org.kodluyoruz.concrete;

public class Queue <T> implements org.kodluyoruz.abstrct.Queue<T> {
    @Override
    public void add(T t) {
        System.out.println("add " +t);
    }

    @Override
    public T pool() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
