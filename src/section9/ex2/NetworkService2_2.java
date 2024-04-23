package section9.ex2;

public class NetworkService2_2 {

    public void sendMessage(String data)  {
        String address = "http://exam.com";

        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
        }catch (NetworkClientExceptionV2 ex){
            System.out.println("[오류 코드] : " + ex.getErrorCode() + ", 메시지 : " +
                    ex.getMessage());
            return;
        }

        try {
            client.send(data);
        }catch (NetworkClientExceptionV2 ex){
            System.out.println("[오류 코드] : " + ex.getErrorCode() + ", 메시지 : " +
                    ex.getMessage());
            return;
        }


        client.disconnect();
    }
}
