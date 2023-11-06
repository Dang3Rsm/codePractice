import java.util.Scanner;

public class test {
    public static void main(String[] args){
        boolean run = true;
        int i = 0;
        while (run){
            System.out.println(i++);
            run = getYN();
        }
    }

    public static boolean getYN(){
        Scanner scw = new Scanner(System.in);
        System.out.print("Do you want to continue (1 to yes / else for exit): ");
        int y = scw.nextInt();
        return y == 1;
    }
}
