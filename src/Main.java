import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many strings do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); //

        TextProcessor tp = new TextProcessor(n, sc);
        tp.processStrings();

        sc.close();
    }
}
