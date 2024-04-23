package section9.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {

        NetworkServiceV1_1 service = new NetworkServiceV1_1();
        NetworkService1_2 service2 = new NetworkService1_2();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();

            if (input.toUpperCase().equals("EXIT")){
                break;
            }

            service2.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램 정상 종료");
    }
}
