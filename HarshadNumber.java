// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HarshadNumber {

    void Harshad(int num) {
        int n = num;
        int sum = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (n % sum == 0) {
            System.out.println(n + " Harshad Number");
        } else {

            System.out.println(n + " Is not a Harshad Number");
        }

    }

    public static void main(String[] args) {
        HarshadNumber h1 = new HarshadNumber();
        h1.Harshad(156);
    }
}