import java.util.Scanner;
public class kinematics3eqn {
    public static void main(String[] args) {
        double v,u,a,s,exp;
        Scanner sc = new Scanner(System.in);
        System.out.print("v: ");
        v = sc.nextDouble();
        System.out.print("u: ");
        u = sc.nextDouble();
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("s: ");
        s = sc.nextDouble();
        exp = (v*v - u*u)/(2*a*s);
        System.out.println(exp);
    }
}
