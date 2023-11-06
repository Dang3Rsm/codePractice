import java.util.Scanner;
public class prcntgcalc {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter marks1");
        float m1 = x.nextFloat();
        System.out.println("Enter marks2");
        float m2 = x.nextFloat();
        System.out.println("Enter marks3");
        float m3 = x.nextFloat();
        System.out.println("Enter marks4");
        float m4 = x.nextFloat();
        System.out.println("Enter marks5");
        float m5 = x.nextFloat();
        float avg = (m1 + m2 + m3 + m4 + m5) / 5;
        System.out.println("Avg is " + avg);
    }
}
