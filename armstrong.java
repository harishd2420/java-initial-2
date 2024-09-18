import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r;
        int c = 0;
        double s = 0;
        int t = a;

        while (a > 0) {
            c++;
            a = a / 10;
        }

        a = t; // Reset 'a' to its original value
        while (a > 0) {
            r = a % 10;
            s += Math.pow(r, c);
            a = a / 10;
        }

        if (t == s) {
            System.out.println("It's an Armstrong number.");
        } else {
            System.out.println("It's not an Armstrong number.");
        }
    }
}
