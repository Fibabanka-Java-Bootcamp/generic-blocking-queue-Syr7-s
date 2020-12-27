package org.kodluyoruz;

import org.kodluyoruz.abstrct.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Merhaba Dunya");
        Queue<Integer> integerQueue=new org.kodluyoruz.concrete.Queue<>();
        Queue<String> stringQueue=new org.kodluyoruz.concrete.Queue<>();
        integerQueue.add(5);
        stringQueue.add("Isa");
    }
}
