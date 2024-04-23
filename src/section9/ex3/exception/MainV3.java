package section9.ex3.exception;

import section9.ex3.NetworkServiceV3_1;
import section9.ex3.NetworkServiceV3_2;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        NetworkServiceV3_1 service = new NetworkServiceV3_1();
        NetworkServiceV3_2 service2 = new NetworkServiceV3_2();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }

            service2.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램 정상 종료");
    }
}
