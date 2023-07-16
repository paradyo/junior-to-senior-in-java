package stacks_exercises;

public class MyCustomStackException extends Exception{
    public MyCustomStackException(String message) {
        System.out.println(message);
    }
}
