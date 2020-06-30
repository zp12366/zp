package ryan.day1;

import java.util.Scanner;

public class PracticeSwitchAndSystemIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your want know: ");
        String v = scanner.nextLine();

        switch (v){
            case "name":
                System.out.println("zp");
                break;
            case "age":
                System.out.println(20);
                break;
            default:
                System.out.println("I don't know.");
        }
    }
}
