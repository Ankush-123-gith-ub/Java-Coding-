import java.util.Scanner;
import java.util.Random;
public class Q12 {
    public static int[] generate4DigitRandomArray(int size){
        Random r = new Random();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i]=1000+r.nextInt(9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr){
        double sum=0; int min=arr[0],max=arr[0];
        for(int n:arr){ sum+=n; min=Math.min(min,n); max=Math.max(max,n); }
        return new double[]{sum/arr.length,min,max};
    }
    public static void main(String[] args){
        int[] arr=generate4DigitRandomArray(5);
        for(int n:arr) System.out.print(n+" ");
        System.out.println();
        double[] res=findAverageMinMax(arr);
        for(double d:res) System.out.println(d);
    }
}