package section9.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {

        NetworkService0 service0 = new NetworkService0();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }
            service0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상종료함..");
    }
}
