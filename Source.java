class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    /*
     * This method takes in the head of a linked list 
     * with integers and returns the total sum of all values
     * in the linked list.
     */
    int sum = 0;                        // to hold sum of linked list
    Node<Integer> current_node = head;  // to hold current node

    while (current_node != null){       // loop while current node is not null
      sum += current_node.val;          // add value of current node to sum
      current_node = current_node.next; // traverse to next node
    }

    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7
    
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a)); // 19

    Node<Integer> f = new Node<>(-10);
    System.out.println("Sum of lonely list: " + Source.sumList(f)); // -10
    System.out.println("Did you know? 10 is the lonliest number because it's next to 1.");

    
    Node<Integer> g = new Node<>(-1);
    Node<Integer> h = new Node<>(-12);
    Node<Integer> i = new Node<>(-9823);

    f.next = g;
    g.next = h;
    h.next = i;
    i.next = a;

    // -10 -> -1 -> -12 -> -9823 -> 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of negative list: " + Source.sumList(f));   // -9827
    
  }
}
