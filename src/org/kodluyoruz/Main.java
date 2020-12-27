package org.kodluyoruz;

import org.kodluyoruz.Concrete.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Integer Data Type.");
        Queue<Integer> integerQueue = new org.kodluyoruz.Concrete.Queue<>();
        System.out.println("Add Method");
        integerQueue.add(5);
        System.out.println(integerQueue.length);
        integerQueue.add(6);
        System.out.println(integerQueue.length);
        integerQueue.add(7);
        System.out.println(integerQueue.length);

        System.out.println("Pool Method And Peek");
        System.out.println("Peek method is running: "+integerQueue.peek());
        integerQueue.pool();
        System.out.println("Peek method is running: "+integerQueue.peek());

        System.out.println("String Data Type");
        Queue<String> stringQueue=new org.kodluyoruz.Concrete.Queue<>();

        System.out.println("Add Method");

        stringQueue.add("Ali");
        System.out.println("Queue length: "+stringQueue.length);
        stringQueue.add("Veli");
        System.out.println("Queue length: "+stringQueue.length);
        stringQueue.add("Ayse");
        System.out.println("Queue length: "+stringQueue.length);
        stringQueue.add("Ahmet");
        System.out.println("Queue length: "+stringQueue.length);
        stringQueue.add("Mehmet");

        System.out.println("Pool And Peek Methods");
        System.out.println("Peek method is running: "+stringQueue.peek());
        stringQueue.pool();
        System.out.println("Peek method is running: "+stringQueue.peek());
        stringQueue.pool();
        System.out.println("Peek method is running: "+stringQueue.peek());
        stringQueue.pool();
        System.out.println("Peek method is running: "+stringQueue.peek());



    }
}
