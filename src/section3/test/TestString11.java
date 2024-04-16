package section3.test;

public class TestString11 {
    public static void main(String[] args) {

        String str = "hello java";

//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        StringBuilder reverseStr = sb.reverse();
//        String reverseStrToString = reverseStr.toString();

        String reverseStr = new StringBuilder(str).reverse().toString();

        System.out.println("reverseStr = " + reverseStr);


    }
}
