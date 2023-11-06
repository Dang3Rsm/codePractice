import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        double km, miles;
        Scanner x = new Scanner(System.in);
        miles = 0.621371;
        System.out.print("Enter KM: ");
        km = x.nextDouble();
        miles *= km;
        System.out.println("In miles: " + miles);
    }
}
