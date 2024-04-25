package section9.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data){
        String address = "https://exm.com";

        // try with resource
        // try (..) 안에 사용할 자원 명시 --> AutoCloseable.close() 호출해 자원해제
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);

        // catch 블럭이 없어도 close() 호출됨
        }catch (Exception e){
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
    }
}
