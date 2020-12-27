package org.kodluyoruz.concrete;

public class Queue <T> implements org.kodluyoruz.abstrct.Queue<T> {
    int length=0;
    T variable;
    Queue<T> queueHead=null;
    Queue<T> queueTail=null;
    Queue<T> queueNext=null;
    Queue<T> queuePrevious=null;
    T head=null;
    public Queue(){}
    public Queue(T t){
        this.variable=  t;
    }
    @Override
    public void add(T t) {
        Queue queue=new Queue(t);
        if (this.queueHead==null){
            this.queueHead=queue;
            this.queueTail=queue;
            this.length=1;
        }else{
            //queue.queueNext=this.queueHead;
            queue.queueNext=this.queueTail;
            this.queuePrevious=queue;
            this.queueTail=queue;
            ++this.length;
        }
        System.out.println("queueHead "+queueHead.variable+" queueTail "+queueTail.variable);
    }

    @Override
    public T pool() {
        if (queueHead==null){
            System.out.println("No items queue");
        }else{
            System.out.println("********************");
            head= queueHead.variable;
            queueHead=queueTail.queueNext;
            System.out.println("Head: "+head+" queue Head: "+queueHead.variable+" queue Tail: "+queueTail.variable);
        }
        return head;
    }

    @Override
    public T peek() {

        return queueHead.variable;
    }
}
