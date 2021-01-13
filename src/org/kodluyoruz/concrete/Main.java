package org.kodluyoruz.concrete;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue<Integer> integerQueue = new Queue<>();
        Queue<String> stringQueue = new Queue<>();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
                for (int i = 1; i < 5; i++) {
                    integerQueue.add.accept(i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running");
                for (int i = 1; i < 5; i++) {
                    integerQueue.add.accept(i * 5);
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running");
                for (int i = 1; i < 5; i++) {
                    integerQueue.add.accept(i * 10);
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4 is running");
                if (integerQueue.peek.get() == null)
                    System.out.println("Not value in Queue");
                else {
                    System.out.println("Process Thread 4");
                    System.out.println("The Peek method was executed: " + integerQueue.peek.get());
                    System.out.println("The Pool method was executed: ");
                    integerQueue.pool.get();
                }

            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 5 is running");
                if (integerQueue.peek.get() == null)
                    System.out.println("Not value in Queue");
                else {
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(i + " th process. (Thread 5)");
                        System.out.println("The Peek method was executed: " + integerQueue.peek.get());
                        System.out.println("The Pool method was executed: ");
                        integerQueue.pool.get();
                    }

                }
            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 6 is running");
                for (int i = 1; i <= 5; i++) {
                    String value = i + " nci deger.";
                    stringQueue.add.accept(value);
                }
            }
        });
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 7 is running");
                if (stringQueue.peek.get() == null) {
                    System.out.println("Not value in Queue");
                } else {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + " th process. (Thread 8)");
                        System.out.println("The Peek method was executed: " + stringQueue.peek.get());
                        System.out.println("The Pool method was executed: ");
                        stringQueue.pool.get();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is terminating.");

    }
}
