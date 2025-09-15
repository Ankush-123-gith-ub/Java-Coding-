
import java.util.*;
public class Q11 {
    public static void main(String[] args){
        int[][] data=new int[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=10000+(int)(Math.random()*90000);
            data[i][1]=1+(int)(Math.random()*10);
        }
        int[][] bonus=new int[10][2];
        int sumOld=0,sumNew=0,totalBonus=0;
        for(int i=0;i<10;i++){
            int b=data[i][1]>5 ? (int)(data[i][0]*0.05):(int)(data[i][0]*0.02);
            bonus[i][0]=data[i][0]+b;
            bonus[i][1]=b;
            sumOld+=data[i][0]; sumNew+=bonus[i][0]; totalBonus+=b;
        }
        System.out.println("Old Salary	Years	New Salary	Bonus");
        for(int i=0;i<10;i++) System.out.println(data[i][0]+"	"+data[i][1]+"	"+bonus[i][0]+"	"+bonus[i][1]);
        System.out.println("Sum Old: "+sumOld+" Sum New: "+sumNew+" Total Bonus: "+totalBonus);
    }
}
