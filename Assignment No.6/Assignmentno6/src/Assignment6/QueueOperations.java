package Assignment6;


import java.util.Scanner;

public class QueueOperations {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    void enqueue(int element) {
        if (rear >= queue.length - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println("Element " + element + " is added to the queue");
        }
    }

    int dequeue() {
        int element;
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = queue[front];
            front++;
            System.out.println("Element " + element + " is removed from the queue");
            return element;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueOperations queue = new QueueOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Enter your choice again: ");
        }
    }
}

