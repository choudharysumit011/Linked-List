public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(12);
        list.addFirst(78);
        list.addLast(59);
        list.deleteAtPos(1);
        list.display();
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.addFirst(22);
        list2.addFirst(88);
        list2.addFirst(83);
        list2.addLast(12);
        list2.display();
    }
}