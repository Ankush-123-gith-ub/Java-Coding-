
import java.util.*;
public class CourseRegistration {
    public static void main(String[] args){
        Map<String,Integer> reg=new HashMap<>();
        reg.put("CS101",48);
        reg.put("CS102",3);
        reg.put("CS103",55);
        reg.put("MA101",10);
        reg.put("PH101",2);

        reg.put("CS102", reg.get("CS102")+5);
        reg.put("PH101", Math.max(0, reg.get("PH101")-1));

        System.out.println("Near full:");
        for(String c:reg.keySet()){
            if(reg.get(c)>=50) System.out.println(c);
        }
        System.out.println("Under:");
        for(String c:reg.keySet()){
            if(reg.get(c)<5) System.out.println(c);
        }
    }
}
