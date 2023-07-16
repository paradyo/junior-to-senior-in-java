package stacks_exercises;

import java.util.Arrays;

public class CustomStack {
    private static int[] data;
    private static int pointer = 0;

    public CustomStack() {
        data = new int[5];
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public int pop() throws MyCustomStackException{
        if (pointer == 0){
            throw new MyCustomStackException("its already empty");
        }
        return data[pointer--];
    }

    public boolean push(int item){
        if(data.length == pointer){
            int[] temp;
            temp = Arrays.copyOfRange(data,0, pointer);
            data = temp;
        }
        data[++pointer] = item;
        return true;
    }

    public int peek(){
        return data[pointer];
    }

    public boolean isEmpty(){
        return pointer == 0;
    }
}
