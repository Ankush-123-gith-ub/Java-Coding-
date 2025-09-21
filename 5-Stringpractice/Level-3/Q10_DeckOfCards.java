
import java.util.Random;
import java.util.Scanner;

public class Q10_DeckOfCards {

    public static String[] initDeck() {
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int index=0;
        for (String s: suits) {
            for (String r: ranks) {
                deck[index++]=r+" of "+s;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        Random rand=new Random();
        for (int i=0;i<deck.length;i++) {
            int j=i+rand.nextInt(deck.length-i);
            String temp=deck[i]; deck[i]=deck[j]; deck[j]=temp;
        }
    }

    public static String[][] distribute(String[] deck,int n,int players) {
        if (n%players!=0) {
            System.out.println("Cannot distribute evenly!");
            return new String[0][0];
        }
        String[][] res=new String[players][n/players];
        int index=0;
        for (int i=0;i<players;i++) {
            for (int j=0;j<n/players;j++) {
                res[i][j]=deck[index++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] deck=initDeck();
        shuffle(deck);
        System.out.print("Enter number of cards to distribute: ");
        int n=sc.nextInt();
        System.out.print("Enter number of players: ");
        int p=sc.nextInt();
        String[][] res=distribute(deck,n,p);
        for (int i=0;i<res.length;i++) {
            System.out.println("Player "+(i+1)+":");
            for (String card: res[i]) System.out.println(card);
        }
        sc.close();
    }
}
