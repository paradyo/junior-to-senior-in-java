import java.util.Arrays;

public class Methods {
    static int x = 10;
    public static void main(String[] args) {
        /*

        access_modifier return_type name (parameters){
            body
        }

        String greetings = sayHiToJohn();
        System.out.println(greetings);

        byte number2 = 126;
        byte number = giveMeANumber(number2, 12);
        System.out.println(number);

        byte a = 10;
        byte b = 20;


        byte temp = a;
        a = b;
        b = temp;

        a -> 10
        b -> 20

        swap(a, b);

        System.out.println(a);
        System.out.println(b);

        int[] numbers = {1,2,3,4};
        modifyArray(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(varArgs(45,46,1,2,3,4));


        byte num1 = 1;
        System.out.println(giveMeANumber(num1));
        String str1 = "abc";
        System.out.println(giveMeANumber(str1));

        sum everynumber from 1 to 10
        byte total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }

        int result = sum(1, 10);
        System.out.println(result);Ï

         */



    }

    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }



    static String sayHiToJohn(){
        int a = 1;
        char b = 'a';
        //do stuff
        //do stuff
        //do stuff
        return "Hi";
    }

    static byte giveMeANumber(byte wantedNumber){
        return wantedNumber;
    }

    static byte giveMeANumber(byte wantedNumber, int anotherNumber){
        return wantedNumber;
    }

    static void swap(byte a, byte b){
        byte temp = a;
        a = b;
        b = temp;

        /*
        a -> 20
        b -> 10

         */
    }

    static void modifyArray(int[] array){
        array[0] = 10;
    }

    static String varArgs(int num1, int num2, int ...v){
        return Arrays.toString(v) + num2 + num1;
    }

}
