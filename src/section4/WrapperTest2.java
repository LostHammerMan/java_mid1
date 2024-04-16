package section4;

public class WrapperTest2 {
    public static void main(String[] args) {

        String[] arr = {"1.5", "2.5", "3.5"};
        double sum = 0.0;
        for (String result : arr){
            sum += Double.parseDouble(result);

        }

        System.out.println("sum = " + sum);
    }
}
