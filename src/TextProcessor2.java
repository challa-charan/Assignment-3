import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        for (String str : strings) {
            System.out.println(str);
            System.out.println(new StringBuilder(str).reverse());
            System.out.println(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()));
            int vowels = 0, consonants = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if ("aeiou".indexOf(c) >= 0) vowels++;
                    else consonants++;
                }
            }
            System.out.println(vowels + " " + consonants);
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
        }
    }
}