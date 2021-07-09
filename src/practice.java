import java.util.Scanner;
public class practice {
    public static void main(String[]args) {
        Scanner input_a = new Scanner(System.in);
        int a = input_a.nextInt();
        int r = input_a.nextInt();
        for (int i = 20; i >= a; a++) {
            r = r + a;
            azeer(a);
        }
    }

    public static void azeer (int x) {
        Scanner input_b = new Scanner(System.in);
        int y = input_b.nextInt();
        x = x+y;
            System.out.println(x);

            System.out.println("this is azeer function");
        }
}
