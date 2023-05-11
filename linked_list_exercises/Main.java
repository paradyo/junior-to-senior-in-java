package linked_list_exercises;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertLast(3);
        sll.insertLast(5);
        sll.insertLast(7);
        sll.insertLast(9);
        sll.insertLast(11);
        sll.display();
        sll.insert(8,3);
        sll.display();
        sll.insertRecursive(10,5);
        sll.display();
        sll.deleteFirst();
        sll.display();
        sll.deleteLast();
        sll.display();
        sll.delete(3);
        sll.display();
        System.out.println(sll.findByValue(10));
        System.out.println(sll.findByIndex(2));
        sll.reverse();
        sll.display();
        sll.reverseRecursive();
        sll.display();
    }
}
