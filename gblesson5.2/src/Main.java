import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> workers = new HashMap<Integer, String>();
        workers.put(111,"Ivan");
        workers.put(112,"Dima");
        workers.put(113,"Petr");
        workers.put(114,"Anton");
        workers.put(115,"Ivan");
        workers.put(116,"Dima");
        workers.put(117,"Petr");
        workers.put(118,"Anton");
        workers.put(119,"Ivan");
        workers.put(120,"Dima");

        for (Integer entry: workers.keySet()){
            int count=0;
            for (Integer temp: workers.keySet()){
                if (workers.get(entry).equals(workers.get(temp))){
                    count++;
                }
            }
            System.out.println("Name count: "+workers.get(entry)+" : "+count);
        }

    }
}