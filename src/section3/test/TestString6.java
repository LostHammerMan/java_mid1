package section3.test;

public class TestString6 {
    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;

//        for (int i = 0; i < str.length(); i++){
//            int index = str.indexOf(key, i);
//
//            if (index == i){
//                count++;
//            }
//
//        }
        int index = str.indexOf(key);
        while (index >= 0){
            index = str.indexOf(key, index + 1);
            count++;
            System.out.println("index = " + index);
        }

        System.out.println("count = " + count);

    }
}
