import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneList {
    private ArrayList<String> phonesList= new ArrayList<>();
     public PhoneList(String phoneNumber){
         this.phonesList.add(phoneNumber);
     }

     public String toString(){
         String temp="";
        for (int i=0;i<this.phonesList.size();i++){
            temp+=this.phonesList.get(i)+"\t";
        }
        return temp;
     }
     public void addPhoneNumber(String phoneNumber){
         this.phonesList.add(phoneNumber);
     }
    public ArrayList<String> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(ArrayList<String> phonesList) {
        this.phonesList = phonesList;
    }
}
