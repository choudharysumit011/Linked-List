public class DoublyLinkedList {
    private Node head;
    private Node tail;
    int size;
    public DoublyLinkedList(){
        this.size =0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next= head;
        node.prev = null;
        head = node;
        if(head.next != null){
            head.prev = node;

        }
        if(tail == null){
            tail = head;
        }
    }

    void display(){
        Node temp = head;
        System.out.print("Head->");
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp= temp.next;
        }
        System.out.print("Tail");
    }

    public void addLast(int value){
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }
}
