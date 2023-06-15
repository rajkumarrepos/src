package com.example.hospitalRecords.Exception;

public enum ErrorCodes {

    CODE_602("ERROR MESSAGE"),CODE_603("Record Not found");

    public String message;

    public String getMessage() {
        return message;
    }

    private ErrorCodes(String message){
        this.message = message;
    }
}
