import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(GCD(n,s));

        }
    public static int Pow(int a, int n) {//Problem 6
        if (n == 0) {
            return 1;
        }
        else if (n > 0) {
            return a * Pow(a, n-1);
        }
        else {
            return 1 / Pow(a, -n);
        }
    }
    public static int factorial(int a){//Problem 4
        if(a == 0){
            return 1;
        }
        else{
            return(a*factorial(a-1));
        }
    }


    public static double avg(int n, double a[]){//Problem 2
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for(int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
            sum +=a[i];
        }
        return sum/n;
    }
    public static boolean prime(int a){//Problem 3
        int x = 0;
        for(int i = 1; i<=a; i++){
            if(a%i == 0){
                x++;
            }
        }
        if(x == 2){
            System.out.println("It's a prime " + (a-1+1) );
            return prime(a-1);
        }

        else if (x < 0 ){
            return false;
        }
        else{
            return true;
        }
    }
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }
    }
    }

