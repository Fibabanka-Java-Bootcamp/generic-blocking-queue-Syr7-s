package org.kodluyoruz;

import org.kodluyoruz.concrete.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Merhaba Dunya");
        Queue<Integer> integerQueue = new org.kodluyoruz.concrete.Queue<Integer>();
        //Queue<String> stringQueue=new org.kodluyoruz.concrete.Queue<>();

        integerQueue.add(5);
        integerQueue.add(6);
        System.out.println(integerQueue.length);
        integerQueue.add(7);
        System.out.println(integerQueue.length);
        Queue<String> stringQueue=new org.kodluyoruz.concrete.Queue<String>();
        stringQueue.add("Isa");

        stringQueue.add("Musa");
        stringQueue.add("Tugba");
        stringQueue.add("Fatih");
        stringQueue.add("Fatma");
       /* if (stringQueue.pool()==null){
            System.out.println("Queue empty");
        }else{
            System.out.println("Head removed in the queue.");
        }*/
        System.out.println(stringQueue.peek());
        stringQueue.pool();
        System.out.println(stringQueue.peek());
        stringQueue.pool();
        System.out.println(stringQueue.peek());
        stringQueue.pool();
        System.out.println(stringQueue.peek());
        System.out.println(integerQueue.peek());


    }
}
