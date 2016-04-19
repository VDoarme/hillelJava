package exceptions;

/**
 * Created by Valiage on 19.04.2016.
 */
public class MyOwnOutOfIndexException extends RuntimeException{
    public MyOwnOutOfIndexException(String message){
        super(message);
    }
}
