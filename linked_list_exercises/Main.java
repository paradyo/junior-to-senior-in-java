package linked_list_exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String args[] ) throws Exception {
        /*
        SLL_2 sll = new SLL_2();
        sll.insertFirst(3);
        sll.display();
        sll.insertLast(5);
        sll.display();
        sll.insertLast(7);
        sll.display();
        sll.insertFirst(1);
        sll.display();
        sll.insert(6, 3);
        sll.display();
        sll.insertRecursive(2, 3);
        sll.display();
        sll.deleteLast();
        sll.display();
        //sll.delete(2);
        //sll.display();
        System.out.println("Data: " + sll.findIndexByValue(6));


        sll.insertLast(7);
        sll.display();
        sll.insert(6,2);
        sll.display();
        sll.insert(2,0);
        sll.display();
        sll.insertRecursive(4,2);
        sll.display();
        sll.deleteFirst();
        sll.display();
        sll.deleteLast();
        sll.display();
        sll.delete(2);
        sll.display();
        sll.delete(sll.findIndexByValue(4));
        sll.display();
        sll.reverse();
        sll.display();


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

        SLL_2 l1 = new SLL_2();
        l1.insertFirst(2);
        l1.insertLast(4);
        l1.insertLast(9);
        SLL_2 l2 = new SLL_2();
        l2.insertFirst(5);
        l2.insertLast(6);
        l2.insertLast(4);
        l2.insertLast(9);
        l1.reverse();
        l2.reverse();
        int generalTotal = l1.findTotal() + l2.findTotal();
        System.out.println(generalTotal);
        SLL_2 result = new SLL_2();
        int digit;
        while(generalTotal > 0){
            digit = generalTotal % 10;
            result.insertLast(digit);
            generalTotal /= 10;
        }
        result.display();

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        //System.out.println("testCaseCount: " + testCaseCount);
        int testCounter = 0;
        while(testCounter < testCaseCount){
            String friendsAndWillDeleteCount = br.readLine();
            int friendsCount = Integer.parseInt(friendsAndWillDeleteCount.split(" ")[0]);
            //System.out.println("friendsCount: " + testCaseCount);
            int willDeleteFriendsCount = Integer.parseInt(friendsAndWillDeleteCount.split(" ")[1]);
            //System.out.println("willDeleteFriendsCount: " + willDeleteFriendsCount);
            String[] popularities = br.readLine().split(" ");
            SLL_2 sll = new SLL_2();
            for(int i = 0; i < friendsCount; i++){
                sll.insertLast(Integer.parseInt(popularities[i]));
            }
            sll.deleteFriends(willDeleteFriendsCount);
            testCounter++;

            ListNode[] lists = {list1, list2, list3};
            ListNode res = mergeKLists(lists);
            display(res);

            display(swapNodes(list1, 1));
            display(removeNthFromEnd(list1, 2));
            display(deleteMiddle(list1));
        }
        ListNode list1 = new ListNode(1);
        list1 = insertFirst(list1, 2);
        insertLast(list1, 5);
        int[] list = nextLargerNodes(list1);
        for(int i = 0; i< list.length; i++){
            System.out.println(list[i]);
        }

         DLL_1 dll_1 = new DLL_1();
        dll_1.insertFirst(3);
        dll_1.insertFirst(2);
        dll_1.insertFirst(1);
        dll_1.insertLast(4);
        dll_1.insertLast(5);
        dll_1.insert(3,10);
        dll_1.display();
        TextEditor textEditor = new TextEditor(); // The current text is "|". (The '|' character represents the cursor)
        textEditor.addText("leetcode"); // The current text is "leetcode|".
        System.out.println(textEditor.deleteText(4)); // return 4
        // The current text is "leet|".
        // 4 characters were deleted.
        System.out.println();
        textEditor.addText("practice"); // The current text is "leetpractice|".
        System.out.println();
        System.out.println(textEditor.cursorRight(3)); // return "etpractice"
        // The current text is "leetpractice|".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "etpractice" is the last 10 characters to the left of the cursor.
        System.out.println(textEditor.cursorLeft(8)); // return "leet"
        // The current text is "leet|practice".
        // "leet" is the last min(10, 4) = 4 characters to the left of the cursor.
        System.out.println(textEditor.deleteText(10)); // return 4
        // The current text is "|practice".
        // Only 4 characters were deleted.
        System.out.println(textEditor.cursorLeft(2)); // return ""
        // The current text is "|practice".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "" is the last min(10, 0) = 0 characters to the left of the cursor.
        textEditor.cursorRight(6); // return "practi"
        // The current text is "practi|ce".
        // "practi" is the last min(10, 6) = 6 characters to the left of the cursor.
        ListNode list1 = new ListNode(2);
        list1 = insertFirst(list1, 5);
        insertLast(list1, 13);
        insertLast(list1, 3);
        insertLast(list1, 8);
        display(removeNodes(list1));
         */
        Twitter obj = new Twitter();
        obj.postTweet(1,5);
        obj.follow(1,2);
        obj.follow(2,1);
        obj.getNewsFeed(2);
        obj.postTweet(2,6);
        obj.getNewsFeed(1);
        obj.getNewsFeed(2);
    }
    public static ListNode insertFirst(ListNode head, int val){
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }
    public static ListNode insertLast(ListNode head, int val){
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        return head;
    }
    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void displayCircular(ListNode head) {
        ListNode node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }
    public static ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head1, ListNode head2) {
        /*

       ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
         */
        while(head2 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
    public static ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode list = new ListNode();
        while(list1 != null){
            if(list2 == null){
                insertLast(list, list1.val);
                list1 = list1.next;
            }
            else{
                if(list1.val < list2.val){
                    insertLast(list, list1.val);
                    list1 = list1.next;
                }
                else if(list1.val == list2.val){
                    insertLast(list, list1.val);
                    insertLast(list, list2.val);
                    list1 = list1.next;
                    list2 = list2.next;
                }
                else{
                    insertLast(list, list2.val);
                    list2 = list2.next;
                }
            }
        }
        if(list2 != null){
            while(list2 != null){
                insertLast(list, list2.val);
                list2 = list2.next;
            }
        }
        return list.next;
    }
    public static ListNode mergeTwoListRecursive(ListNode list1, ListNode list2){
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoListRecursive(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoListRecursive(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
    public static ListNode mergeTwoListDummyNode(ListNode list1, ListNode list2)
    {
        /* Takes two lists sorted in increasing order, and splices their nodes together to make
    one big sorted list which is returned. */

        /* a dummy first node to
           hang the result on */
        ListNode dummyNode = new ListNode(0);

        /* tail points to the
        last result node */
        ListNode tail = dummyNode;
        while (true) {

            /* if either list runs out,
            use the other list */
            if (list1 == null) {
                tail.next = list2;
                break;
            }
            if (list2 == null) {
                tail.next = list1;
                break;
            }

            /* Compare the data of the two
            lists whichever lists' data is
            smaller, append it into tail and
            advance the head to the next Node
            */
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (ListNode list : lists) {
            ans = mergeTwoListRecursive(ans, list);
        }
        return ans;
    }
    public static int findSize(ListNode head){
        if(head == null){
            return 0;
        }
        int counter = 0;
        while(head != null){
            head = head.next;
            counter++;
        }
        return counter;
    }
    public static ListNode swapNodes(ListNode head, int k) {
        // find the size. and store the kth node from beginning and end.
        int sizeOfList = findSize(head);
        ListNode a = null, b = null, ptr = head;
        for (var i=1; i<=sizeOfList; i++, ptr = ptr.next) {
            if (i == k) a = ptr;
            if (i == sizeOfList + 1 - k ) b = ptr;
        }
        var tmp = a.val;
        a.val = b.val;
        b.val = tmp;
        return head;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int sizeOfList = findSize(head);
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        for (int i = 1; i <= sizeOfList; i++){
            if(i == sizeOfList - n + 1){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }
    public static ListNode deleteMiddle(ListNode head) {
        //find middle
        ListNode middle = findMiddle(head);
        //delete it
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        while(curr != null){
            if(curr.next == middle){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        // delete
        return dummy.next;
    }
    public static ListNode deleteMiddleShort(ListNode head){
        ListNode fh = new ListNode(-1, head), fast;

        for(fast = head = fh; fast.next != null && (fast = fast.next.next) != null; ) head = head.next;
        head.next = head.next.next;

        return fh.next;
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode evens = new ListNode();
        ListNode evenCurr = evens;
        ListNode odds = new ListNode();
        ListNode oddCurr = odds;
        int counter = 0;
        while(head != null){
            if(counter % 2 == 0){
                evenCurr.next = new ListNode(head.val);
                evenCurr = evenCurr.next;
            }
            else{
                oddCurr.next = new ListNode(head.val);
                oddCurr = oddCurr.next;
            }
            counter++;
            if(head.next == null){
                evenCurr.next = odds.next;
            }
            head = head.next;
        }
        return evens.next;
    }
    public static ListNode oddEvenListFaster(ListNode head) {
        if(head == null)
            return head;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = even;
        ListNode oddHead = odd;

        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return oddHead;
    }
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] resList = new ListNode[k];
        int sizeOFList = findSize(head);
        int counter = 0;
        int modulo = sizeOFList % k;
        if (sizeOFList < k) {
            //split every part by 1 item in it.
            while (counter != k) {
                if (head != null) {
                    resList[counter] = new ListNode(head.val);
                    head = head.next;
                } else {
                    resList[counter] = null;
                }
                counter++;
            }
        }
        else{
            while(counter != k){
                if(head != null){
                    int divide = sizeOFList / k;
                    ListNode temp = new ListNode();
                    ListNode curr = temp;
                    while(divide != 0){
                        curr.next = new ListNode(head.val);
                        curr = curr.next;
                        head = head.next;
                        divide--;
                    }
                    if(modulo != 0){
                        curr.next = new ListNode(head.val);
                        head = head.next;
                        modulo--;
                    }
                    resList[counter] = temp.next;
                }
                else{
                    resList[counter] = null;
                }
                counter++;
            }
        }
        return resList;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int length = 1;
        ListNode ln = head;
        while (ln.next!=null){
            ln=ln.next;
            length++;
        }
        ln.next=head;
        k =k%length;
        length-=k+1;
        while(length>0){
            head= head.next;
            length--;
        }
        ListNode rt = head.next;
        head.next=null;
        return rt;
    }
    public static int[] nextLargerNodesOwn(ListNode head) {
        ArrayList<Integer> result = new ArrayList<>();
        int biggest = Integer.MIN_VALUE;
        int counter = 0;
        while(head != null){
            if(head.val == biggest){
                biggest = Integer.MIN_VALUE;
                result.add(0);
                head = head.next;
            }
            else{
                if(head.next == null && head.val > biggest){
                    result.add(0);
                }else{
                    if(head.val < biggest){
                        result.add(biggest);
                    }
                    else{
                        biggest = head.val;
                        ListNode dummy = new ListNode();
                        dummy.next = head;
                        ListNode curr = dummy;
                        while(curr.next != null){
                            if(curr.next.val > biggest){
                                biggest = curr.next.val;
                                result.add(curr.next.val);
                                break;
                            }else{
                                curr = curr.next;
                            }
                        }
                    }
                }
                head = head.next;
            }
            counter++;
        }
        int[] resultArr = new int[counter];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
    public static int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            int data = nextGreaterNode(curr);
            list.add(data);
            curr=curr.next;
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    public static int nextGreaterNode(ListNode curr){
        ListNode temp=curr;
        while(temp!=null){
            if(temp.val>curr.val){
                return temp.val;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static ListNode removeNodesRecursion(ListNode head) {
        if(head.next == null) return head;
        head.next = removeNodesRecursion(head.next);
        if(head.next.val > head.val) return head.next;
        return head;
    }
    public static ListNode removeNodes(ListNode head) {
        //Step 1) Reverse the Linked list first
        if(head == null || head.next==null){
            return head;
        }
        //ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode prev = null;
        ListNode next1 = null;

        while(curr!=null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }

        ListNode head2 = prev;

        //Step 2) Traverse the LinkedList and remove the elements smaller than the previous node
        //element or elements. So, converted from checking right side elements to checking left side
        //elements which is possible.
        int maxVal = prev.val;
        ListNode curr2 = prev.next;

        while(prev.next!=null){
            if(curr2.val<maxVal){
                prev.next = curr2.next;
                curr2 = prev.next;
            }
            else if(curr2.val == maxVal){
                prev = curr2;
                curr2 = curr2.next;
            }
            else{
                maxVal = curr2.val;
                prev = curr2;
                curr2 = curr2.next;
            }
        }


        //Step 3) Reverse the remaining Linked List

        ListNode curr3 = head2;
        ListNode prev3 = null;
        ListNode next3 = null;

        while(curr3!=null){
            next3 = curr3.next;
            curr3.next = prev3;
            prev3 = curr3;
            curr3 = next3;
        }

        return prev3;
    }
}
