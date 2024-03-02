public class LinkedList {
// this is the main LinkedList class
    private Node head;
    private Node tail;
    int size =0;
    public LinkedList(){
        this.size =0;
    }

//this is the Node object representing each individual element
    private class Node{
        private int value;// inserting data
        private Node next;// pointer which is pointing to next

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);// we will create Node
       // node.value = value;
        node.next = head;// first we will point the head to next pointer
        head = node; // will then make head as first This effectively makes the newly created node the first node in the linked list, and now head points to it.

        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value + "->");
            temp = temp.next;
        }
       // temp = temp.next;

    }

    public void addLast(int value){
        if(tail==null){
            addFirst(value);

        }
        else {
            Node node= new Node(value);
            tail.next = node;
            tail= node;
        }
    }

    public void addatPos(int val, int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            addFirst(val);
        } else if (index == size) {
            addLast(val);
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }

    public void deleteFirst(){
        head = head.next;
        if(head==null)
            tail=null;
    }

    public void deleteLast(){
        if(head==null)
            return;

        else if(head.next==null) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node current = head;
        while (current.next.next != null){// checking upto second last element
            current = current.next; // moving current one by one
            // now current is at second last


        }
        tail = current; // now second last points to tail
        tail.next= null; // tail always points null
        size--;
    }

}
