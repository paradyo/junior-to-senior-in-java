package oracle_java_se8_practices;

public class Vowel {
    private char var;

    public static void main(String[] args) {
        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(obj1.var + ", " + obj2.var);
    }
}
