public class SumOfNTerms {
    public static void main(String[] args) {
        int result = sumOfNTerms(3000);
        System.out.println(result);
    }
    public static int sumOfNTerms(int k) {
        if (k > 0) {
            return k + sumOfNTerms(k - 1);
        } else {
            return 0;
        }
    }
}
