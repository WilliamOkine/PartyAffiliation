import java.util.Scanner;
public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you Democrat, Republican, or Independent?");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        System.out.println("Enter your choice: ");
        String party = scan.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Person");
        } else {
            System.out.println("Other choice made");
        }
    }
}

