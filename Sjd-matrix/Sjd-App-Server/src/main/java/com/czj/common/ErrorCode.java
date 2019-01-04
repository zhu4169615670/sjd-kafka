package com.czj.common;

/**
 * Created by Congean on 2016/8/30.
 */
public enum ErrorCode {
    Ok(1),Error(0),NotLogin(110),Authorized(120),NotOpenid(130),NotBoundPhone(140),Notfind(404),Success(200);
    
    private final int value;
    
    public int getValue(){
        return value;
    }
    ErrorCode(int value){
        this.value=value;
    }
}
