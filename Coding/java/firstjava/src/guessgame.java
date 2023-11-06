import java.util.Scanner;
public class guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = 4;
        boolean loop = true;
        while (loop) {
            System.out.println("Enter (0 to 9) to guess: ");
            b = sc.nextInt();
            if (b < a) {
                System.out.println("Number is greater!");
            } else if (b > a) {
                System.out.println("Number is smaller!");
            } else {
                System.out.println("Correct!");
                loop = false;
            }
        }

    }
}
