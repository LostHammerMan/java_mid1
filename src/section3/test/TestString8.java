package section3.test;

public class TestString8 {
    public static void main(String[] args) {

        String input = "hello java spring jpa java";
        String raw = "java";
        String replaceWord = "jvm";

//        input.replace(raw, replaceWord);
        System.out.println("Input = " + input.replace(raw, replaceWord));
    }
}
