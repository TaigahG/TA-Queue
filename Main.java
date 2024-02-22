import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue("Hello");
        queue.enqueue(50);

        System.out.println(queue);
    }
}