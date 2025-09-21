
import java.util.Random;
import java.util.Scanner;

public class Q9_RockPaperScissors {

    public static String computerChoice() {
        String[] options = {"rock","paper","scissors"};
        return options[new Random().nextInt(3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        int userWins=0, compWins=0, draws=0;
        for (int i=1;i<=n;i++) {
            System.out.print("Game "+i+" - Enter choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
            System.out.println("Computer chose: "+comp+" => Winner: "+winner);
        }
        System.out.println("Results:");
        System.out.println("User Wins: "+userWins);
        System.out.println("Computer Wins: "+compWins);
        System.out.println("Draws: "+draws);
        double userPct = (userWins*100.0)/n;
        double compPct = (compWins*100.0)/n;
        System.out.printf("User Win %%: %.2f, Computer Win %%: %.2f%n", userPct, compPct);
        sc.close();
    }
}
