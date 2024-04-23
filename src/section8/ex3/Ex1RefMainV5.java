package section8.ex3;

import section8.ex2.Process;

public class Ex1RefMainV5 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> {

        });
    }
}
