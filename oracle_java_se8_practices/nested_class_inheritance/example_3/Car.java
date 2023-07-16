package oracle_java_se8_practices.nested_class_inheritance.example_3;

public class Car extends Vehicle{
    int y;
    Car(){
        super();
        //this(20); // We can not use super() and this() in the same constructor.
    }
    Car(int y){
        this.y = y;
    }
    public String toString(){
        return super.x + ":" + this.y;
    }
}
