package section4;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";

        Integer strToInteger = Integer.parseInt(str);

        // int 변환
        int int1 = strToInteger.intValue();

        Integer integer = Integer.valueOf(int1);

    }
}
