package oracle_java_se8_practices.nested_class_inheritance.example_6;

class EBook extends Book{
    @Override
    public void readBook(){
        System.out.println("Read E-Book");
    }

    //This function is needed. Even nested interface inheritance exists.
    @Override
    public void download() {

    }
}
