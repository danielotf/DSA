package DSA;

public class singlyLinkedList {

  //Represent the head and tail of the singly linked list
  public Node head;
  public Node tail;

  //  Just created a singlylinked list class with a node class inside it
  public class Node {

    //  In the node class I have initialised the constructors outside it, with the 'data' to give the value of the node,
    //  and the 'next' as a pointer.
    int data;
    //  above we are saying the data that is being held must be an integer
    //  below we are setting up a pointer with '.next'
    Node next;

    // The constructor method is now created below, and 'this.',
    // just represents the instance of a new object(in this case an instance of the class node).
    public Node(int data, Node next) {
      this.data = data;
      // below 'this.next ' is equal too null because for each instance of the node class that we create we
      //  want it to be pointing to something regardless, even if it is a new list
      this.next = null;
    }
  }

  public String appendNode(int data) {
    Node newNode = new Node(1, null);
    // check if list is empty i.e. is head =null / is head empty?
    if (head == null) {
      head = newNode;
      return (data + " has been added to list");
    } else {
      //newNode will now become new tail of the list
      tail = newNode;
      //newNode will be added after tail such that tail's next will point to newNode i.e. pointer is setup for newNode
      tail.next = null;

      return (data + " has been added to list");
    }
  }

  

  public String removeNode(singlyLinkedList list, int value) {
    Node current = list.head;
    Node prev = new Node(value, current);

    if (current.data != value) {
      prev = current;
      current = current.next;
    } else if (current.data == value) {
      prev.next = current.next;
    }
    return (value + " found and deleted");
  }
}
