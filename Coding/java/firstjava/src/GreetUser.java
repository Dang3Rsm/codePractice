import java.util.Scanner;
public class GreetUser {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Hey " + name + " nice to meet you!");

    }
}
