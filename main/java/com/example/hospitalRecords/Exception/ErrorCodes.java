package com.example.hospitalRecords.Exception;

public enum ErrorCodes {

    CODE_602("ERROR MESSAGE"),CODE_603("Record Not found"),CODE_604("WHILE SAVING MOMENT ERROR"),
    CODE_605("WRONG PARAMETER");


    private ErrorCodes(String message){
        this.message = message;
    }
    public String message;

    public String getMessage() {
        return message;
    }


}
