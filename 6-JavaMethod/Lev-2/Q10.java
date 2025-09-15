import java.util.Scanner;
public class Q10 {
    public static double bmi(double w,double h){ h=h/100; return w/(h*h); }
    public static String status(double b){
        if(b<18.5) return "Underweight";
        if(b<25) return "Normal";
        if(b<30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
            data[i][2]=bmi(data[i][0],data[i][1]);
            System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+status(data[i][2]));
        }
    }
}