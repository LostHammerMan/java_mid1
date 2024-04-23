package section9.ex2;

public class NetworkService2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2{

        String address = "http://exam.com";

        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
