package stacks_exercises;

import java.util.*;

public class Main {
    public static void main(String[] args) throws MyCustomStackException {
        String ransomNote = "aa";
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        Set<Integer> set = new TreeSet<>();
        for(int num: nums){
            set.add(num);
        }
        Integer[] setArray = set.toArray(new Integer[set.size()]);
        int result = 1;
        int increaser = 1;
        for (int i = 1; i < setArray.length; i++) {
            int diff = setArray[i] - setArray[i-1];
            if(increaser != diff){
                result = 1;
            }
            else{
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean isValidParenthesis(String s) {
        if(s.toCharArray().length % 2 != 0){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> parenthesis = new Stack<>();
        for (char prnt : chars){
            if(prnt == '('){
                parenthesis.push(prnt);
            } else if(prnt == '['){
                parenthesis.push(prnt);
            } else if(prnt == '{'){
                parenthesis.push(prnt);
            }
            if(prnt == ')'){
                if(parenthesis.pop() != '('){
                    return false;
                }
            } else if(prnt == ']'){
                if(parenthesis.pop() != '['){
                    return false;
                }
            } else if(prnt == '}'){
                if(parenthesis.pop() != '{'){
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }
    public static void longestValidParenthesis(String s){
        int maxans=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxans=Math.max(maxans,i-stack.peek());
                }
            }
        }
        System.out.println(maxans);
    }
    public static void evalRPN(){
        String[] tokens = new String[]{
                "4","13","5","/","+"
        };
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String str : tokens){
            if(Objects.equals(str, "+")){
                result = stack.pop() + stack.pop();
                stack.push(result);
            }
            else if(Objects.equals(str, "/")){
                int lastAdded = stack.pop();
                int prevAdded = stack.pop();
                result = prevAdded / lastAdded;
                stack.push(result);
            }
            else if(Objects.equals(str, "-")){
                result = stack.pop() - stack.pop();
                stack.push(result);
            }
            else if(Objects.equals(str, "*")){
                result = stack.pop() * stack.pop();
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        System.out.println(result);
    }
    public static String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32){
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }
        char[] charArr=new char[stack.size()];
        int lastIndex=stack.size()-1;

        while(!stack.isEmpty()){
            charArr[lastIndex--]=stack.pop();
        }
        return new String(charArr);
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '#'){
                stack1.pop();
            }
            else{
                stack1.push(s.charAt(i));
            }
        }
        for(int i = 0; i < t.length() - 1; i++){
            if(t.charAt(i) == '#'){
                stack2.pop();
            }
            else{
                stack2.push(t.charAt(i));
            }
        }
        if(stack1.size() != stack2.size()){
            return false;
        }
        if(stack1.size() == 0){
            return true;
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.pop() != stack2.pop()){
                return false;
            }
        }
        return true;
    }
}
