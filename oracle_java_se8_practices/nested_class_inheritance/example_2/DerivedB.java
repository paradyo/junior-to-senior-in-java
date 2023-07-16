package oracle_java_se8_practices.nested_class_inheritance.example_2;

public class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3; //this is redundant. it takes DerivedB
        Base b4 = (DerivedA) b3; //this is redundant. it takes DerivedB
        b1.test(); //Output: DerivedB
        b4.test(); //Output: DerivedB
    }
}
