
import java.util.*;
public class ExamResults {
    public static void main(String[] args){
        Map<String,Map<String,Integer>> data=new HashMap<>();

        Map<String,Integer> maths=new HashMap<>();
        maths.put("A",95); maths.put("B",80); maths.put("C",88);

        Map<String,Integer> sci=new HashMap<>();
        sci.put("A",70); sci.put("B",92); sci.put("C",85);

        data.put("Maths",maths);
        data.put("Science",sci);

        for(String sub:data.keySet()){
            Map<String,Integer> m=data.get(sub);
            int max=-1; String topper="";
            int sum=0;
            for(String s:m.keySet()){
                sum+=m.get(s);
                if(m.get(s)>max){
                    max=m.get(s); topper=s;
                }
            }
            System.out.println(sub+" topper: "+topper);
            System.out.println("Average: "+ sum/m.size());
            for(String s:m.keySet()){
                if(m.get(s)>90){
                    System.out.println(sub+" has >=90 scorer");
                    break;
                }
            }
        }
    }
}
