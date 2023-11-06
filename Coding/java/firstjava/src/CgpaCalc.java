import java.util.Scanner;
public class CgpaCalc {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x,y,z;
        float c;
        x = n.nextByte();
        y = n.nextByte();
        z = n.nextByte();
        c = (x + y + z) / 30.0f;
        System.out.println(c);
    }
}
