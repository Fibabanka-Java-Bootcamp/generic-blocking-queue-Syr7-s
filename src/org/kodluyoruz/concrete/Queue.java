package org.kodluyoruz.concrete;

public class Queue <T> implements org.kodluyoruz.abstrct.Queue<T> {
    public int length=0;
    T variable;
    Queue<T> queueHead=null;
    Queue<T> queueTail=null;
    Queue<T> queueNext=null;
    Queue<T> queuePrevious=null;
    Queue<T> temporaryVariable;
    Queue next;
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
            this.queueTail.next=queue;
            this.queueTail=this.queueTail.next;
            ++this.length;
        }
        System.out.println("queueHead "+this.queueHead.variable+" queueTail "+this.queueTail.variable);
    }

    @Override
    public T pool() {
        if (this.queueHead==null){
            System.out.println("No items queue");
            return null;
        }else{
            this.temporaryVariable=this.queueHead;
            this.queueHead=this.queueHead.next;
            return  this.temporaryVariable.variable;
        }

    }

    @Override
    public T peek() {
        return queueHead.variable;
    }
}
