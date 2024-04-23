package section9.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data){
        String address = "http://exm.com";

        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect(); // 예외 발생시 무시됨
        }catch (NetworkClientExceptionV2 ex){
            System.out.println("[오류 코드] : " + ex.getErrorCode() + ", 메시지: " + ex.getMessage());
        }

    }
}
