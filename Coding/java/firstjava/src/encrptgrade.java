import java.util.Scanner;
public class encrptgrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        a += 8;
        System.out.println("Encrypted grade: " + a);
        a -= 8;
        System.out.println("Decrypted grade: " + a);
    }

}
