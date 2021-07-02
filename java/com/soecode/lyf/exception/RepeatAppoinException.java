package com.soecode.lyf.exception;
/*
    重复预约异常
 */
public class RepeatAppoinException extends RuntimeException{
    public RepeatAppoinException(String message){
        super(message);
    }

    public RepeatAppoinException(String message, Throwable cause){
        super(message, cause);
    }
}
