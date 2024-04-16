package section4;

import java.util.Random;

public class LottoGenerator {

    private final Random rd = new Random();

    private int[] numbers;
    private int count;

    public int[] generateNum(){
        numbers = new int[6];
        count = 0;

        while (count < 6){
            int num = rd.nextInt(45) + 1;
            if (isUnique(num)){
                numbers[count] = num;
                count++;
            }
        }
        return numbers;
    }

    public boolean isUnique(int num){
        for (int i=0; i<count; i++){
            if (numbers[i] == num){
                return false;
            }
        }

        return true;
    }

}
