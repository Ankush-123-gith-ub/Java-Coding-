
import java.util.*;
public class BankingSystem {
    public static void main(String[] args){
        Map<String,Double> bal=new HashMap<>();
        bal.put("ACC1",10000.0);
        bal.put("ACC2",25000.0);
        bal.put("ACC3",5000.0);

        bal.put("ACC1", bal.get("ACC1")+5000);
        double w=30000;
        if(bal.get("ACC2")>=w) bal.put("ACC2", bal.get("ACC2")-w);

        List<Map.Entry<String,Double>> list=new ArrayList<>(bal.entrySet());
        list.sort((a,b)->Double.compare(b.getValue(),a.getValue()));
        for(var e:list) System.out.println(e.getKey()+" => "+e.getValue());

        System.out.println("Top:");
        for(int i=0;i<Math.min(3,list.size());i++)
            System.out.println(list.get(i).getKey());
    }
}
