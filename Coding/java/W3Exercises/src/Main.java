import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Questions.addTwoNumbers(1,2));
//        System.out.println(Questions.addTwoNumbers(1.1,2.9));
//        Questions.addTwoNumbers();
//        String s = "One Two Three Four Five";
//        System.out.println(Questions.countWords(s));

//        String s = "One Two Three Four Five";
//        String reverse_string = Questions.reverseString(s);
//        System.out.println(reverse_string);

//        int[] arr = {1, 5, 10, 25};
//        int sum = Questions.sumOfArr(arr);
//        System.out.println(sum);

//        double area = Questions.areaOfRect(5,6);
//        System.out.println(area);
//        boolean y = Questions.checkEven(-1);
//        System.out.println(y);
//        y = Questions.checkOdd(21);
//        System.out.println(y);


    }
}


class Questions{
    public static int addTwoNumbers(int a , int b){
        return a + b;
    }
    public static double addTwoNumbers(double a , double b){
        return a + b;
    }
    public static void addTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        double x,y,sum;
        System.out.println("Enter x: ");
        x = sc.nextDouble();
        System.out.println("Enter y: ");
        y = sc.nextDouble();
        sum = x+y;
        System.out.println("Sum is " + sum);

    }

    public static int countWords(String x){
        return x.split(" ").length;
    }

    public static String reverseString(String s) {
        String x="";
        for (int i = 0; i<s.length();i++){
            x = s.charAt(i) + x;
        }
        return x;
    }

    public static int sumOfArr(int[] arr) {
        int sum = 0;
        for (int i: arr){
            sum += i;
        }
        return sum;
    }

    public static double areaOfRect(int i, int i1) {
        return i*i1;
    }

    public static boolean checkEven(int i) {
        return i % 2 == 0;
    }
    public static boolean checkOdd(int i) {
        return i % 2 != 0;
    }
}