package linked_list_exercises;

public class SLL_2 {
    int size;
    Node head;
    Node tail;

    public SLL_2() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null ");
        System.out.println("Head: " + head.value + " Tail: " + tail.value + " Size: " + size);
        System.out.println("");
    }

    public int findTotal(){
        String total = "";
        Node temp = head;
        while(temp != null){
            total = total + "" + temp.value;
            temp = temp.next;
        }
        return Integer.parseInt(total);
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

    public void insert(int value, int index){
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size){
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

    private Node insertRecursive(int value, int index, Node node){
        if(index == 0){
            size++;
            return new Node(value, node);
        }
        node.next = insertRecursive(value, index - 1, node.next);
        return node;
    }

    public void insertRecursive(int value, int index){
        head = insertRecursive(value, index, head);
    }

    public void deleteFirst(){
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        if(size > 1){
            head = head.next;
            size--;
            return;
        }
    }

    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < size; i++){
            if(i == size - 1){
                temp.next = null;
                tail = temp;
                size--;
                return;
            }
            else{
                temp = temp.next;
            }
        }
    }

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
        for(int i = 1; i < size; i++){
            if(i == index && temp.next != null){
                temp.next = temp.next.next;
                size--;
                return;
            }else{
                temp = temp.next;
            }
        }
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

    public void reverseRecursion(){
        reverseRecursion(head);
    }

    public void deleteFriends(int willDeleteFriendCount){
        Node temp = head;
        boolean deleteFriend = false;
        int deletedCounter = 0;
        for (int i = 0; i < size; i++){
            if(temp != null && deletedCounter != willDeleteFriendCount){
                if(temp.next != null && temp.value < temp.next.value){
                    delete(findIndexByValue(temp.value));
                    deleteFriend = true;
                    deletedCounter++;
                }
                temp = temp.next;
            }
        }
        if (!deleteFriend){
            deleteLast();
        }
        if(willDeleteFriendCount != deletedCounter){
            deleteFriends(willDeleteFriendCount - deletedCounter);
        }
        display();
    }

    private class Node{
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
