package section9.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data){
        String address = "http://cc.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }
    }

}
