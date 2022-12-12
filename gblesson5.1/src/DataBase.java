import java.util.HashMap;
import java.util.Map;

public class DataBase {
    public Map<Human, PhoneList> theDataBase = new HashMap<>();

    public DataBase(){

    }

    public String toString(){
        String temp="";
        for (Map.Entry<Human,PhoneList> entry:this.theDataBase.entrySet()){
            temp+=this.theDataBase.get(entry).toString()+"\n";
        }
        return temp;
    }
    public void addPhoneList(Human theHuman,String thePhoneNumber){
        theDataBase.get(theHuman);
        if (this.theDataBase.containsKey(theHuman)){
            this.theDataBase.get(theHuman).addPhoneNumber(thePhoneNumber);
        }
        this.theDataBase.put(theHuman,new PhoneList(thePhoneNumber));
    }
    public Map<Human, PhoneList> getTheDataBase() {
        return theDataBase;
    }

    public void setTheDataBase(Map<Human, PhoneList> theDataBase) {
        this.theDataBase = theDataBase;
    }
}
