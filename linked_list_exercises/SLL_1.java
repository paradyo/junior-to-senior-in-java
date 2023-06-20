package linked_list_exercises;

public class SLL_1 {
    int size;
    Node head;
    Node tail;
    public SLL_1() {
        this.size = 0;
    }
    public void display(){
        Node temp = head;
        if (size == 0){
            System.out.println("SLL is null.");
            return;
        }
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.print("\tSize: " + size);
        System.out.print("\tHead: " + head.value);
        System.out.print("\tTail: " + tail.value);
        System.out.println("");
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        if(size == 0){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(size == 0){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    //important
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
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        size++;
    }

    //important
    private Node insertRecursive(Node node, int value, int index){
        if(index == 0){
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }
        node.next = insertRecursive(node.next, value, index - 1);
        return node;
    }
    //important
    public void insertRecursive(int value, int index){
        head = insertRecursive(head, value, index);
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
        for (int i = 1; i < size; i++){
            if(temp.next.next == null){
                break;
            }else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    //important
    public void delete(int index){
        if(index == -1){
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < size; i++){
            if(i == index && temp.next != null){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        size--;
    }

    public Node findByValue(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public int findIndexByValue(int value){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if(temp.value == value){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    //important
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

    private void reverseRecursion(Node node){
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //important
    public void reverseRecursion(){
        reverseRecursion(head);
    }

    private static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
