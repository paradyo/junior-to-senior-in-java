package oracle_java_se8_practices;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        // Compilation fails. ':' expected.
        /*
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b)
                ? (a < c)
                    ? a
                    : (b < c) ? b : c;
         */

        // Output will be [Robb, Rick, Bran]
        /*
        List names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names);
         */

        // Infinite loop.
        /*
        ArrayList myList = new ArrayList<>();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }
        catch (RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e){
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
         */

        //NullPointerException
        /*
        String[] strs = new String[2];
        int idx = 0;
        for(String s : strs){
            strs[idx].concat("element" + idx);
            idx++;
        }
        for(idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
         */

        //System.out.println("Hello " + new StringBuilder("JAVA SE8")); -> Hello JAVA SE8

        //Cast Error check
        /*
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        iVar = fVar; // cast error
        fVar = iVar;
        dVar = fVar;
        fVar = dVar; // cast error
        dVar = iVar;
        iVar = dVar; // cast error
          */

        // Invalid Name omas null null
        /*
        String names[] = {"Thomas", "PEter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
        }
        for(String p : pwd){
            System.out.println(p);
        }
         */
        //Cast error
        /*
        double y1 = 203.22;
        float f1 = y1;
         */

        //Unreachable statement
        /*
        int[] data = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for(int e : data){
            if(e != key){
                continue;
                count++; // unreachable statement.
            }
        }
        System.out.println(count);
         */
    }
}
