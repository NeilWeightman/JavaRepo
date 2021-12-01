package com.sparta.exceptions;

public class SpartaException extends Exception {
    private int problemId;
    public SpartaException(Throwable cause, int probId) {
        super(cause);
        problemId = probId;
    }
    public void logException(){
        //store the exception in a log file
    }
}
