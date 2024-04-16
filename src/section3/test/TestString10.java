package section3.test;

public class TestString10 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] result = fruits.split(",");

        String result1 = result[0];
        String result2 = result[1];
        String result3 = result[2];

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        String joinedString = String.join("->", result);

        System.out.println("joinedString = " + joinedString);
    }
}
