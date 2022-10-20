import java.util.*;

public class test{
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("C++");
    queue.add("Java");
    queue.add("C");
    queue.add("Python");
    queue.remove();
    System.out.println(queue.element()); // Question 1
    queue.offer("Java");
    queue.offer("C++");
    queue.remove();
    System.out.println(queue.peek()); // Question 2
    queue.poll();
    System.out.println(queue.peek()); // Question 3
    queue.offer("Fortran");
    queue.offer("C");
    System.out.println(queue); // Question 4
}
}