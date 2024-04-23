package section8.ex3;

import section8.ex2.Process;

import java.util.Random;

public class ExRefMainV3 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Process dice = new Process() {
            @Override
            public void run() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomVal);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i=0; i<=3; i++){
                    System.out.println("i = " + i);
                }
            }
        };

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
