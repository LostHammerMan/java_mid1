package section9.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{

        NetworkService2_1 service = new NetworkService2_1();
        NetworkService2_2 service2 = new NetworkService2_2();
        NetworkServiceV2_3 service3 = new NetworkServiceV2_3();
        NetworkServiceV2_5 service5 = new NetworkServiceV2_5();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }

            service5.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료...");
    }
}
