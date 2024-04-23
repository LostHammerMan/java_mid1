package section9.ex0;

public class NetworkService0 {

    public void sendMessage(String data){
        String address = "http://exam.com";
        NetworkClientV0 clientV0 = new NetworkClientV0(address);

        clientV0.connect();
        clientV0.send(data);
        clientV0.disconnect();
    }
}
