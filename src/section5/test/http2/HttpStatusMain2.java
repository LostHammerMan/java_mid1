package section5.test.http2;

import java.util.Scanner;

public class HttpStatusMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int isContinue = 0;
        while (isContinue <= 3){
            System.out.print("Http Code : " );
            int httpCodeInput = sc.nextInt();

            HttpStatus status = HttpStatus.findByCode(httpCodeInput);

            if (status == null){
                System.out.println("정의 되지 않은 코드");
                isContinue++;
            }else {
                System.out.println(status.getCode() + " " + status.getMessage());
                System.out.println("isSuccess = " + status.isSuccess());
                isContinue++;
            }
        }

    }
}
