package linked_list_exercises;

class TextEditor {
    class Node {
        Node prev;
        Node next;
        Character c;
        public Node(Character c) {
            this.c = c;
        }
    }

    Node cursor;

    public TextEditor() {
        cursor = new Node('|');
    }

    public void addText(String text) {
        Node prev = cursor.prev;
        for (int i=0; i<text.length(); i++) {
            Character c = text.charAt(i);
            Node node = new Node(c);
            node.prev = prev;
            if (prev != null) prev.next = node;
            prev = node;
        }
        prev.next = cursor;
        cursor.prev = prev;
    }

    public int deleteText(int k) {
        int count = 0;
        while (k>0 && cursor.prev !=null) {
            cursor.prev = cursor.prev.prev;
            count++;
            k--;
        }
        if (cursor.prev != null) cursor.prev.next = cursor;
        return count;
    }

    public String cursorLeft(int k) {
        while (k>0 && cursor.prev !=null) {
            Node prev = cursor.prev;
            Node next = cursor.next;

            cursor.next = prev;
            cursor.prev = prev.prev;
            prev.next = next;
            prev.prev = cursor;
            if (next != null) next.prev = prev;
            k--;
        }

        if (cursor.prev != null) cursor.prev.next = cursor;

        return getLeftText();
    }

    public String cursorRight(int k) {
        while (k>0 && cursor.next !=null) {
            Node prev = cursor.prev;
            Node next = cursor.next;

            cursor.next = next.next;
            cursor.prev = next;
            next.next = cursor;
            next.prev = prev;
            if (prev != null) prev.next = next;
            k--;
        }

        if (cursor.next != null) cursor.next.prev = cursor;

        return getLeftText();
    }

    private String getLeftText() {
        StringBuilder sb = new StringBuilder();

        Node node = cursor.prev;

        for (int i=0; i<10; i++) {
            if (node == null) break;
            sb.append(node.c);
            node = node.prev;
        }

        return sb.reverse().toString();
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */