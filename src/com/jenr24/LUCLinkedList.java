package com.jenr24;

public class LUCLinkedList {// a Singly Linked List
  Node head; // head of list
  public static LUCLinkedList insert(LUCLinkedList list, int data) // Method to insert a new node
  {
    Node new_node = new Node(data); // Create a new node with given data
    new_node.next = null;
    if (list.head == null) { // If the Linked List is empty, then make the new node as head
      list.head = new_node;
    }
    else {// Else traverse till the last node and insert the new_node there
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = new_node; // Insert the new_node at last node
    }
    return list;
  }

  public static void printList(LUCLinkedList list) // Method to print the LinkedList.
  {
    Node currNode = list.head;
    System.out.print("LinkedList: ");
    while (currNode != null) { // Traverse through the LinkedList
      System.out.print(currNode.data + " "); // Print the data at current node
      currNode = currNode.next; // Go to next node
    }
  }

  public Integer sum() {
    int runningTotal = 0;
    for (Node pointer = head; pointer != null; pointer = pointer.next)
      runningTotal += pointer.data;
    return runningTotal;
  }


}