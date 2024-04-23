package section9.unchecked;

import section9.unchecked.Client;
public class Service {

    /*
    * unchecked 예외
    *  - 예외를 잡거나, 던지지 않아도 됨
    *  - 잡지 않으면 자동으로 밖으로 던짐
    *
    * */

    Client client = new Client();

    /*필요한 경우에만 예외를 잡아서 처리
    * */

    public void callCatch(){
        try {
            client.call();
        }catch (MyUncheckedException e){
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 로직");
    }

    /*
    * 예외를 잡지 않으면 자연스럽게 상위로 넘아감
    * throws 예외 선언 하지 않아도 됨
    * */

    public void callThrow(){
        client.call();
    }
}
