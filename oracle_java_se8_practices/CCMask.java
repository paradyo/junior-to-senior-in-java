package oracle_java_se8_practices;

public class CCMask {
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        return x + creditCard.substring(15,19);
        /*
        StringBuilder sb = new StringBuilder(creditCard);
        StringBuilder s = sb.insert(0, x);
        return s.toString();
         */
        /*
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15,19);
        return sb.toString();
         */
    }
    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}
