import java.util.Scanner;
public class functions {
    public static void main(String [] args){
        Scanner i_p = new Scanner(System.in);
        String a = i_p.nextLine();
        String r = i_p.nextLine();
        int aa = i_p.nextInt();
        int rr = i_p.nextInt();
        System.out.println("newfunction");
        NewFunctoin(a,r);
        System.out.println("newfunction_1");
        NewFunction_1(aa,rr);

    }
    public static void NewFunctoin(String x,String y){
        Scanner i_p_1 = new Scanner(System.in);
        String azeer = x + " " + y;
        System.out.println(azeer);
        int az = i_p_1.nextInt();
        int ar = i_p_1.nextInt();
        NewFunction_1(az,ar);
    }
    public static void NewFunction_1(int a,int r){
        int sum_of = a+r;
        int sub_of = a-r;
        int multi_of = a*r;
        float div_of = a%r;
        System.out.println(sum_of);
        System.out.println(sub_of);
        System.out.println(multi_of);
        System.out.println(div_of);
    }

}
