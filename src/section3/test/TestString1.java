package section3.test;

public class TestString1 {
    public static void main(String[] args) {

        String url = "https://www.example.com";
        String url2 = "httpsss://www.example.com";

        System.out.println(isHttps(url2));


    }

    public static boolean isHttps(String url){
        if (url.startsWith("https://")){
            return true;
        }else {
            return false;
        }


    }
}
