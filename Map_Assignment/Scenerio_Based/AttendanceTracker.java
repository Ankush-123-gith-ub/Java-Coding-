
import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args){
        String[] studs={"A","B","C","D","E"};
        Map<String,Integer> att=new HashMap<>();
        for(String s:studs) att.put(s,0);

        Random r=new Random();
        for(int day=1;day<=15;day++){
            for(String s:studs){
                if(r.nextBoolean()) att.put(s,att.get(s)+1);
            }
        }

        for(String s:att.keySet()){
            if(att.get(s)<10) System.out.println("Low: "+s);
        }
    }
}
