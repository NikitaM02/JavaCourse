import java.util.Scanner;

public class Switchpractice {
    public static void main(String[] args) {
        Scanner shinumama = new Scanner(System.in);
        System.out.println("Enter the  day 1 to 7");
        int day= shinumama.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
                case 4:
                    System.out.println("Thur");
                    case 5:
                        System.out.println("Fri");
                        break;
            default:
                System.out.println("Not allowed");

        }

    }
}
