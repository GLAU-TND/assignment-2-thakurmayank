/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "a", 4, 3));
        studentList.add(new Student(2, "b", 1, 1));
        studentList.add(new Student(3, "c", 0, 0));
        studentList.add(new Student(4, "d", 5, 2));
        studentList.add(new Student(5, "e", 0, 0));
        studentList.add(new Student(6, "f", 0, 0));
        studentList.add(new Student(7, "g", 2, 2));
        studentList.add(new Student(8, "h", 1, 1));
        studentList.add(new Student(9, "i", 6, 4));
        studentList.add(new Student(10, "j", 5, 1));
        studentList.add(new Student(11, "k", 3, 3));
        MyCircularQueue ob = new MyCircularQueue();
        ob.enqueue(studentList);
        ob.printQueue();
    }
}
