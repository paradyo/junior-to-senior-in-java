package oracle_java_se8_practices.nested_class_inheritance.example_1;

public class C extends B{
    public C(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();
        //The output is A B C
    }
}
