package com.app.hotelalura.components.statusConnection;


public class StatusBox {
    
    private StatusConnection statusConnection;
    private static final StatusBox instance=new  StatusBox();
    
    private StatusBox(){}
    
    public static StatusBox getInstance(){
        return instance;
    }

    public void setStConnInst(StatusConnection st){
        statusConnection=st;
    }
    public StatusConnection geSubj(){
        return statusConnection;
    }
    
}
