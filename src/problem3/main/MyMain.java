/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj =new MyPriorityQueue();
        obj.enQueue(new Node(new Student(41, "Sarthak")));
        obj.enQueue(new Node(new Student(1, "Aditi")));
        obj.enQueue(new Node(new Student(6, "Arjun")));
        obj.enQueue(new Node(new Student(50, "yashitra")));
        obj.enQueue(new Node(new Student(24, "lokesh")));
        obj.printQueue();
    }
}
