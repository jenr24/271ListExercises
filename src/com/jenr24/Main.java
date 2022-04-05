package com.jenr24;

import static com.jenr24.LUCLinkedList.insert;
import static com.jenr24.LUCLinkedList.printList;

public class Main {

    public static void main(String[] args)
    {
        LUCLinkedList list = new LUCLinkedList();/* Start with the empty list. */
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        printList(list); // Print the LinkedList
        System.out.print('\n');
        System.out.println(list.sum());
    }

