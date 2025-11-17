
import java.util.*;
public class SalaryDirectory {
    public static void main(String[] args){
        Map<String,Double> sal=new HashMap<>();
        sal.put("Amit",50000.0);
        sal.put("Rita",60000.0);
        sal.put("Sam",55000.0);
        sal.put("Neha",65000.0);
        sal.put("Pooja",70000.0);
        sal.put("Vijay",62000.0);

        sal.put("Amit", sal.get("Amit")*1.10);

        double total=0;
        for(double s:sal.values()) total+=s;
        System.out.println("Average: "+ total/sal.size());

        double max=-1;
        for(double s:sal.values()) if(s>max) max=s;
        for(String n:sal.keySet()) if(sal.get(n)==max) System.out.println("Top: "+n);
    }
}
