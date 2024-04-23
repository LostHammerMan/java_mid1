package section9.ex4;

import section9.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        NetworkServiceV4 service = new NetworkServiceV4();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")){
                break;
            }

            try {
                service.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }

    // 공통 예외 처리
    public static void exceptionHandler(Exception e){
        // 공통 처리
        System.out.println("사용자 메시지 : 죄송, 알수 없는 문제 발생");
        System.out.println("==== 디버그용 메시지 ======");
        e.printStackTrace();

        // 필요시 예외 별로 별도 추가 처리 가능
        if (e instanceof SendExceptionV4 sendExceptionV4){
            System.out.println("[전송 오류] : " + sendExceptionV4.getSendData());
        }
    }
}
