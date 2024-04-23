package section9.checked;

public class Service {

    Client client = new Client();

    // 예외 잡아서 처리
    public void callCatch(){
        try {
            client.call();
        }catch (MyCheckedException e){
            // ㅇ예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상흐름");
    }

    // 체크 예외를 밖으로 던지는 코드
    // 반드시 throws 예외를 메서드에 필수로 선언
    public void callThrow() throws MyCheckedException{
        client.call();
    }

    // Exception 상속 -> ckecked Exception 이 됨
    // RuntimeException 상속 -> unckeck exception
}
