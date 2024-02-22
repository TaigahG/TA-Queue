import java.util.NoSuchElementException;

class Node{
    Object data;
    Node next;

    public Node(Object data){
        this.data = data;
        this.next = null;
    }
}

public class Queue {

    private Node front, rear;
    private int size;

    public Queue(){
        this.front = this.rear = null;

        size = 0;
    }

    public void enqueue(Object data){
        Node newNode = new Node(data);

        if(this.rear == null){
            this.front = this.rear = newNode;
            size++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;

        size++;
    }

    public Object dequeue(){
        if(this.front == null){
            throw new NoSuchElementException("Queue is empty");
        }

        Object data = this.front.data;
        this.front = this.front.next; // moves the front pointer to the next node in the queue


        if (this.front == null) {
            this.rear = null;
        }

        size--;
        return data;
    }

    public Object peek(){
        if(this.front == null){
            throw new NoSuchElementException("Queue is empty");
        }

        return this.front.data;
    }

    public boolean isEmpty(){
        return this.front == null; //returns true if front is null
    }

    public int size(){
        return size;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        Node current = front;

        sb.append("[");

        while(current != null){
            sb.append(current.data);

            if(current.next != null){
                sb.append(", ");
            }
            current = current.next; //moves to the next node
        }
        sb.append("]"); //close the string representation

        return sb.toString();
    }



}
