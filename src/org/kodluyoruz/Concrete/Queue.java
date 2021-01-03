package org.kodluyoruz.Concrete;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Queue<T> {
    public int length = 0;
    private T variable;
    private Queue<T> queueHead = null;
    private Queue<T> queueTail = null;
    private Queue<T> temporaryVariable;
    private Queue<T> queueNext;
    private Object lock = new Object();

    public Queue() {
    }

    public Queue(T t) {
        this.variable = t;
    }

    public Queue<T> getQueueHead() {
        return queueHead;
    }

    private void setQueueHead(Queue<T> queueHead) {
        this.queueHead = queueHead;
    }

    public Queue<T> getQueueTail() {
        return queueTail;
    }

    private void setQueueTail(Queue<T> queueTail) {
        this.queueTail = queueTail;
    }

    public Queue<T> getTemporaryVariable() {
        return temporaryVariable;
    }

    private void setTemporaryVariable(Queue<T> temporaryVariable) {
        this.temporaryVariable = temporaryVariable;
    }

    public Queue getQueueNext() {
        return queueNext;
    }

    private void setQueueNext(Queue queueNext) {
        this.queueNext = queueNext;
    }

    Consumer<T> add = (t) -> {
        synchronized (lock) {
            Queue queue = new Queue(t);
            if (this.queueHead == null) {
                this.queueHead = queue;
                this.queueTail = queue;
                this.length = 1;
            } else {
                this.queueTail.queueNext = queue;
                this.queueTail = this.queueTail.queueNext;
                ++this.length;
            }
            System.out.println("queueHead " + this.queueHead.variable + " queueTail " + this.queueTail.variable+" Queue Length : "+this.length);
        }
    };
    Supplier<T> pool = () -> {
        synchronized (lock) {
            if (this.queueHead == null) {
                System.out.println("No items queue");
                return null;
            } else {
                this.temporaryVariable = this.queueHead;
                this.queueHead = this.queueHead.queueNext;
                return this.temporaryVariable.variable;
            }
        }
    };
    Supplier<T> peek = () -> {
        synchronized (lock) {
            return this.queueHead !=null ? this.queueHead.variable : null;
        }
    };


}
