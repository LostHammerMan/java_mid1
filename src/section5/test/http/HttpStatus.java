package section5.test.http;

import java.util.Arrays;
import java.util.Optional;

public enum HttpStatus {
    
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final Integer code;
    private final String message;

    HttpStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

//    public static HttpStatus findByCode(int httpCodeInput) {
//        HttpStatus[] httpStatuses = HttpStatus.values();
//
//        HttpStatus first = Arrays.stream(httpStatuses).filter(httpStatus -> httpStatus.code.equals(httpCodeInput)).findFirst()
//                .orElseThrow(() -> new NullPointerException("정의 되지 않은 코드"));
//
//        return first;
//    }

    public static HttpStatus findByCode(int httpCodeInput){
        for (HttpStatus status : values()){
            if (status.getCode() == httpCodeInput){
                return status;
            }
        }
        return null;
    }

    public int getCode(){
        return code;
    }
    
    public String getMessage(){
        return message;
    }


    public boolean isSuccess() {
        return code >= 200 & code <= 299;
//        if (this.code.equals(200)){
//            return true;
//        }else {
//            return false;
//        }
    }
}
