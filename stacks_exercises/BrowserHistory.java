package stacks_exercises;

class BrowserHistory {
    ListNode head;
    private class ListNode{
        String value;
        ListNode next;
        ListNode prev;
        public ListNode(String value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
        public ListNode(String value, ListNode next, ListNode prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
    }

    public void visit(String url) {
        head.next = new ListNode(url, null, head);
        head = head.next;
    }

    public String back(int steps) {
        int counter = steps;
        ListNode dumb = head;
        while(counter != 0){
            if(dumb.prev != null){
                dumb = dumb.prev;
            }
            counter--;
        }
        head = dumb;
        return dumb.value;
    }

    public String forward(int steps) {
        int counter = steps;
        ListNode dumb = head;
        while(counter != 0){
            if(dumb.next != null){
                dumb = dumb.next;
            }
            counter--;
        }
        head = dumb;
        return dumb.value;
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("leetcode.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println(bh.back(1));
        System.out.println(bh.back(1));
        System.out.println(bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println(bh.forward(2));
        System.out.println(bh.back(2));
        System.out.println(bh.back(7));
        System.out.println("Test");
    }
}
