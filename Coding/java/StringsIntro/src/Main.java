import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = "HeLLo WoRlD";
        System.out.println(s);
        String s1 = s.toLowerCase();
        System.out.println("q1: " + s1);
        String s2 = s.replace(' ','_');
        System.out.println("q2:" + s2);
        String d = "Dear <name>, Thanks a lot!";
        String name = sc.next();
        String d1 = d.replace("<name>",name);
        System.out.println("q3: " + d1);


        //detect whitespaces
        String ln = sc.nextLine();
        boolean checkWs2 ,checkWs3;
        checkWs2 = checkWs3 =false;
        if (ln.indexOf("  ") != -1){
            checkWs2 = true;
        }
        if (ln.indexOf("   ") != -1){
            checkWs3 = true;
        }
        System.out.printf("q4: double whitespace %b\ntriple whitespaces %b\n",checkWs2,checkWs3);


        String letter = "Dear Harry, This java course is nice. Thanks";
        letter = letter.replace(", ",",\n");
        letter = letter.replace(". ",",\n");
        System.out.println("q5: " + letter);
    }
}