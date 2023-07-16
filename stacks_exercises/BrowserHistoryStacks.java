package stacks_exercises;

import java.util.Stack;

public class BrowserHistoryStacks {
    Stack<String> historyPrev = new Stack<>();
    Stack<String> historyForw = new Stack<>();

    public BrowserHistoryStacks(String homepage) {
        historyPrev.push(homepage);
    }

    public void visit(String url) {
        historyPrev.push(url);
        while(!historyForw.isEmpty()){
            historyForw.pop();
        }
    }

    public String back(int steps) {
        int counter = steps;
        while(counter != 0){
            if(historyPrev.size() > 1){
                String forw = historyPrev.pop();
                historyForw.push(forw);
            }
            counter--;
        }
        return historyPrev.peek();
    }

    public String forward(int steps) {
        int counter = steps;
        while(counter != 0){
            if(!historyForw.isEmpty()){
                String prev = historyForw.pop();
                historyPrev.push(prev);
            }
            counter--;
        }
        return historyPrev.peek();
    }
    public static void main(String[] args) {
        BrowserHistoryStacks bh = new BrowserHistoryStacks("leetcode.com");
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
