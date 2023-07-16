package oracle_java_se8_practices;

public class StaticCounter {
    static int count = 0;
    int i = 0;
    public void changeCount(){
        while(i < 5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        StaticCounter check1 = new StaticCounter();
        StaticCounter check2 = new StaticCounter();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + ":" + check2.count);
    }
}
