import java.util.Scanner;
public class Personalinfo {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your name:");
                String name = sc.nextLine();

                System.out.print("Enter your age:");
                int age = sc.nextint();
                sc.nextLine();

                System.out.print("Enter your city:");
                String city = sc.nextLine();

                System.out.println("Name:"+ name);
                System.out.println("Age:"+ age);
                System.out.println("City:"+ city);

                sc.close();
    }
}