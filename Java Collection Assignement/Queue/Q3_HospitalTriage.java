
import java.util.*;
public class Q3_HospitalTriage {
    static class Patient{ String name; int sev; Patient(String n,int s){name=n;sev=s;} public String toString(){return name+"("+sev+")";} }
    public static void main(String[] args){
        PriorityQueue<Patient> pqBasic=new PriorityQueue<>((a,b)->Integer.compare(b.sev,a.sev));
        pqBasic.add(new Patient("John",3)); pqBasic.add(new Patient("Alice",5)); pqBasic.add(new Patient("Bob",2));
        System.out.print("basic: ");
        while(!pqBasic.isEmpty()) System.out.print(pqBasic.remove()+" ");
        System.out.println();
        PriorityQueue<Patient> pqAdv=new PriorityQueue<>((a,b)->Integer.compare(b.sev,a.sev));
        pqAdv.add(new Patient("John",3)); pqAdv.add(new Patient("Alice",5)); pqAdv.add(new Patient("Bob",2));
        System.out.print("advanced: ");
        while(!pqAdv.isEmpty()) System.out.print(pqAdv.poll()+" ");
        System.out.println();
    }
}
