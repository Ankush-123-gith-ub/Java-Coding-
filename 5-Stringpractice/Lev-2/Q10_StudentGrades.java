
import java.util.Random;

public class Q10_StudentGrades {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i=0;i<n;i++) {
            scores[i][0] = rand.nextInt(41)+60; // Physics 60-100
            scores[i][1] = rand.nextInt(41)+60; // Chemistry
            scores[i][2] = rand.nextInt(41)+60; // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] res = new double[scores.length][3];
        for (int i=0;i<scores.length;i++) {
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double avg = total/3.0;
            double pct = (total/300.0)*100;
            res[i][0]= total;
            res[i][1]= Math.round(avg*100.0)/100.0;
            res[i][2]= Math.round(pct*100.0)/100.0;
        }
        return res;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i=0;i<results.length;i++) {
            double pct = results[i][2];
            if (pct>=90) grades[i]="A";
            else if (pct>=75) grades[i]="B";
            else if (pct>=60) grades[i]="C";
            else if (pct>=40) grades[i]="D";
            else grades[i]="F";
        }
        return grades;
    }

    public static void displayReport(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        for (int i=0;i<scores.length;i++) {
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+
                               (int)results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]+"\t"+grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayReport(scores, results, grades);
    }
}
