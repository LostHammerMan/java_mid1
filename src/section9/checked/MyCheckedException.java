package section9.checked;

public class MyCheckedException extends Exception{

    // Exception 상속 -> checked Exception(Runtime Exception 제외)
    public MyCheckedException(String message) {
        super(message);
    }
}
