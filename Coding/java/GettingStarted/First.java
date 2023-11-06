import java.util.Scanner;

public class First{
  public static void main(String[] args) {
    ProgramUtils.ProgramStarts();

    double[] r;
    boolean run = true;

    while (run){
    r = MyMath.calcQuadRoots(MyMath.getQuad());
    MyMath.printQuad(r);
    System.out.print("Roots: ");
    for (double i : r){
        System.out.print(i + " ");
    }
    System.out.println();
    run = ProgramUtils.getYN();
    }


    ProgramUtils.ProgramEnds();
  }
}


class MyMath{
  public static double add(double x , double y){
    return x+y;
  }
  public static double subtract(double x , double y){
    return x-y;
  }
  public static double multiply(double x , double y){
    return x*y;
  }
  public static double divide(double x , double y){
    return x/y;
  }
  public static double sqr(double x){
    return x*x;
  }
  public static double sqrt(double x){
    return Math.sqrt(x);
  }
  public static double[] getQuad(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    double a = sc.nextDouble();
    System.out.print("Enter b: ");
    double b = sc.nextDouble();
    System.out.print("Enter c: ");
    double c = sc.nextDouble();
      return new double[]{a,b,c};
  }
  public static double[] calcQuadRoots(double[] quad){
    double a = quad[0], b = quad[1], c=quad[2] , x1, x2;
    x1 = ((-b) + MyMath.sqrt(sqr(b) - (4*a*c)))/(2*a);
    x2 = ((-b) - MyMath.sqrt(sqr(b) - (4*a*c)))/(2*a);
      return new double[]{x1,x2};
  }
  public static void printQuad(double[] quad){
    double a = quad[0], b = quad[1], c = quad[2];
    String y = a + "x^2 + " + b + "x + " + c +" = 0";
    System.out.println(y);
  }
}

class ProgramUtils{
  public static void ProgramStarts(){
    System.out.println("--PROGRAM EXECUTION STARTS--");
  }
  public static void ProgramEnds(){
    System.out.println("--PROGRAM EXECUTION ENDS--");
  }
  public static void invalidInput(){
    System.err.println("--Invalid Input--");
  }

  public static boolean getYN(){
    Scanner scw = new Scanner(System.in);
    System.out.print("Do you want to continue (1 to yes / else for exit): ");
    int y = scw.nextInt();
    return y == 1;
  }
}