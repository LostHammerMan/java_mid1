package section4;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lg = new LottoGenerator();

        System.out.print("로또 번호 : ");

        for (int result : lg.generateNum()){
            System.out.print(result + " ");
        }

    }
}
