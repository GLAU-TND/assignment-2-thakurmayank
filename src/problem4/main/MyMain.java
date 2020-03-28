/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */

package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree MyBinarySearchTree =new MyBinarySearchTree();
        MyBinarySearchTree.add(503);
        MyBinarySearchTree.add(396);
        MyBinarySearchTree.add(47);
        MyBinarySearchTree.add(55);
        MyBinarySearchTree.add(922);
        MyBinarySearchTree.add(423);
        MyBinarySearchTree.add(201);
        MyBinarySearchTree.add(76);
        MyBinarySearchTree.add(196);
        MyBinarySearchTree.add(23);
        MyBinarySearchTree.add(76);
        MyBinarySearchTree.add(57);
        MyBinarySearchTree.add(78);
        MyBinarySearchTree.add(70);
        MyBinarySearchTree.add(12);
        MyQueue queue = new MyQueue();
        queue.enqueue(MyBinarySearchTree.root);
        queue.printQueue();
    }
}
