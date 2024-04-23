package section9.checked;

public class Client {

    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");

        // throw 예외 : 새로운 예외 발생시킬 수 있음, 예외도 객체
         // --> new 로 생성 후 예외 발생시켜야 함

        // throws 예외 : 발생시킨 예외를 메서드 밖으로 던질때 사용
    }
}
