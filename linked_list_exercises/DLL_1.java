package linked_list_exercises;

public class DLL_1 {
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }
    public void insertLast(int val){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val, null,temp);
    }
    public void insert(int index, int val){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node node = head;
        Node last = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            if(node.next == null){
                break;
            }
            last = last.next;
            node = node.next;
        }
        System.out.print("END");
        System.out.println("");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
