package lixb.com.number;

public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Throwable e){
        super(e);
    }
}
