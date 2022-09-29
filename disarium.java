public class DisariumNumber {

    public static int Calculatelength(int n) {
        int length = 0;
        while (n != 0) {
            length = length + 1;
            n = n / 10;
        }
        return length;

    }

    public static void main(String args[]) {
        int num = 176, rem = 0, sum = 0, n;
        int len = Calculatelength(num);
        n = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, len);
            num = num / 10;
            len--;
        }
        if (sum == n) {
            System.out.println(n + " is a Disarium Number ");

        } else {
            System.out.println(n + " Not a Disarium Number");

        }

    }
}