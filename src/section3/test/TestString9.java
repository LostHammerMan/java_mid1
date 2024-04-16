package section3.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] spiltStr = email.split("@");

        String id = spiltStr[0];
        String domain = spiltStr[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);

//        System.out.println("id = " + id);
    }
}
