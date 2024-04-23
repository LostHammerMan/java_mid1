package section9.ex1;

public class NetworkService1_2 {

    public void sendMessage(String data){
        NetworkClientV1 clientV1 = new NetworkClientV1("http:ex.com");

        clientV1.initError(data);

        String connectResult = clientV1.connect();

        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = clientV1.send(data);
        if (isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }

        clientV1.disconnect();

    }

    public static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}
