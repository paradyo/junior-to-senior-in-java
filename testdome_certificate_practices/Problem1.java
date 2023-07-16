package testdome_certificate_practices;

public class Problem1 {
    public static class TextInput {
        String character;
        public TextInput(){
            character = "";
        }
        public void add(char c){
            character += Character.toString(c);
        }
        public String getValue(){
            return character;
        }
    }

    public static class NumericInput extends TextInput {
        public void add(char c){
            if(Character.isDigit(c)){
                character += Character.toString(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
