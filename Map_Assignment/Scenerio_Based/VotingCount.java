
import java.util.*;
public class VotingCount {
    public static void main(String[] args) {
        Map<String,Integer> votes=new HashMap<>();
        String[] cast={"A","B","C","A","B","A","C","A","B","A"};
        for(String v: cast){
            votes.put(v, votes.getOrDefault(v,0)+1);
        }
        String winner=null; int max=-1;
        for(String c:votes.keySet()){
            if(votes.get(c)>max){
                max=votes.get(c); winner=c;
            }
        }
        System.out.println("Winner: "+winner);
        System.out.println(votes);
    }
}
