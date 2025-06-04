package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<>();

    public void setDefaultPIN(){
        this.pinCode = "0000";
    }
    public Safe(String pinCode){
        this.pinCode = pinCode;
    }
    public ArrayList<String> getlist(String code){
        String pin = hommaaPIN();
        ArrayList<String> safeFolderr =  safeFolder;
        if(code.equals(pin)){
        }else {
           safeFolderr = null;
        }
        return safeFolderr;
    }    
    
    public String hommaaPIN(){
        return pinCode;
    }
    public void setPIN(String tempCode){
        this.pinCode = tempCode;
    }
    public void addToSafe(String info){
        safeFolder.add(info);
    }
    
}
    
    
