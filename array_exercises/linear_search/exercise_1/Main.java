package array_exercises.linear_search.exercise_1;

public class Main {
    public static void main(String[] args) {
        /*
            int[] arr = {1,2,3,4};
            int target = 3;
            System.out.println(linearSearch(arr, target));
         */
        /*
            When to use?
                *Small datasets,
                *searching a dataset stored in contiguous memory, 0x00000 to 0x00FF
                *want to implement a simple algorithm.
         */
        /*
            String str = "John";
            char targetStr = 'h';
            System.out.println(linearSearchStrings(str, targetStr));

            int[] recArr = {10,20,40,50,60};
            int targetRec = 50;
            System.out.println(linearSearchRecursive(recArr, recArr.length, targetRec));
         */
        /*
            //O(1) better than O(n)
            int[] arr = {1,2,3,4};
            int target = 3;
            for(int key : arr){
                System.out.print(key);
            }
            int whereAt = linearSearchTranspositon(arr, target);
            System.out.println("");
            System.out.println("Where?: " + whereAt);
            for(int key : arr){
                System.out.print(key);
            }
            int whereAt2 = linearSearchTranspositon(arr, target);
            System.out.println("");
            System.out.println("Where?: " + whereAt2);
            for(int key : arr){
                System.out.print(key);
            }
            int whereAt3 = linearSearchTranspositon(arr, target);
            System.out.println("");
            System.out.println("Where?: " + whereAt3);
            for(int key : arr){
                System.out.print(key);
            }
         */
        /*
            int[] arr = {1,2,3,4};
            int target = 3;
            for(int key : arr){
                System.out.print(key);
            }
            int whereAt = linearSearchMoveToFront(arr, target);
            System.out.println("");
            System.out.println("Where?: " + whereAt);
            for(int key : arr){
                System.out.print(key);
            }
            int whereAt2 = linearSearchMoveToFront(arr, target);
            System.out.println("");
            System.out.println("Where?: " + whereAt2);
            for(int key : arr){
                System.out.print(key);
            }
         */
        int[] arr = {1,2,3,4};
        int target = 3;
        System.out.println(linearSearchSentinel(arr, target));
    }
    static int linearSearchSentinel(int[] arr, int target){
        // O(n) -> where the n is array length
        int i = 0;
        int last = arr[arr.length - 1];
        arr[arr.length - 1] = target;
        while (arr[i] != target){
            i++;
        }
        arr[arr.length - 1] = last;
        if((i < arr.length - 1) || (arr[arr.length - 1] == target)){
            return i;
        }
        else{
            return -1;
        }
    }
    static int linearSearchMoveToFront(int[] arr, int target){
        // O(n) -> where the n is array length
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                // 4th to index 0.
                if(i == 0){
                    return i;
                }
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                return i;
            }
        }
        return -1;
    }
    static int linearSearchTranspositon(int[] arr, int target){
        // O(n) -> where the n is array length
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                // 4th to 3rd
                if(i == 0){
                    return i;
                }
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                return i;
            }
        }
        return -1;
    }
    static int linearSearchRecursive(int[] recArr, int sizeOfArray, int targetRec){
        if(sizeOfArray == 0){
            return -1;
        }
        else if(recArr[sizeOfArray - 1] == targetRec){
            return sizeOfArray - 1;
        }
        else{
            return linearSearchRecursive(recArr, sizeOfArray - 1, targetRec);
        }

    }
    static int linearSearch(int[] arr, int target){
        // O(n) -> where the n is array length
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static boolean linearSearchKey(int[] arr, int target){
        for (int element : arr) {
            if(element == target){
                return true;
            }
        }
        return false;
    }
    static int linearSearchStrings(String str, char targetStr){
        // O(n) -> where the n is array length
        if(str.length() == 0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == targetStr){
                return i;
            }
        }
        return -1;
    }
}
