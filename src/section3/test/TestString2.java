package section3.test;

public class TestString2 {
    public static void main(String[] args) {

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;

        for (String result : arr){
            System.out.println(result + ": " + result.length());
            sum += result.length();
        }

        System.out.println("sum = " + sum);
    }
}
