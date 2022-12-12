

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Human oleg = new Human("Oleg", 30);
        Human kirill = new Human("Kirill", 13);
        Human natash = new Human("Natalia", 20);
        db.theDataBase.put(oleg,new PhoneList("+375295675775"));
        db.theDataBase.put(oleg,new PhoneList("+375448767899"));
        db.theDataBase.put(kirill,new PhoneList("+375448678756"));
        db.theDataBase.put(natash, new PhoneList("+375290098987"));
        System.out.println(db.toString());
        System.out.println();

    }
}