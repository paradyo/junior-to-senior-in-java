package linked_list_exercises;

public class SingleLinkedList {
    private int size;
    private Node head;
    private Node tail;
    public SingleLinkedList() {
        this.size = 0;
    }
    public void display(){
        Node node = head;
        System.out.print("START ");
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END" + " | HEAD: " + head.value + " | TAIL: " + tail.value + " | SIZE: " + size);
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    private Node insertRecursive(int value, int index, Node node){
        if(index == 0){
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }
        node.next = insertRecursive(value, index-1, node.next);
        return node;
    }
    public void insertRecursive(int value, int index){
        head = insertRecursive(value, index, head);
    }
    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < size; i++) {
            if(temp.next.next == null){
                break;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            if(i == index - 1 && temp.next != null){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        size--;
    }
    public Node findByValue(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node findByIndex(int index){
        Node node = head;
        int counter = 1;
        while (counter != size){
            if(node != null && index == counter - 1){
                return node;
            }
            counter++;
        }
        return null;
    }
    public void reverse(){
        if(size < 2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        tail = present;
        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }
    private void reverseRecursive(Node node){
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRecursive(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseRecursive(){
        reverseRecursive(head);
    }
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
