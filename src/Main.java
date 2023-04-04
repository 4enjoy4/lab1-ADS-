import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for(int i = 0; i<n; i++){
            s[i] = scanner.nextInt();
        }
        System.out.println(FindMin(s,n));

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
    public static int FindMin(int[]arr, int a){//problem 1
        if(a == 1){//if there are only one element, it will return it
            return arr[0];
        }
        else{
            return Math.min(FindMin(arr, a -1),arr[a-1]);// find minimum value in the array
        }
    }
    public static int factorial(int a){//Problem 4
        if(a == 0){
            return 1;
        }
        else{
            return(a*factorial(a-1));//multiplies a to a-1
        }
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
    public static int Binomial(int a, int b){//Problem 9
        if(b == 0 || b == a){//if b equal zero or to a, it return 1, cause it's binomial coefficient always will be 1.
            return 1;
        }
        else{
            return Binomial(a -1, b -1) + Binomial(a -1, b);//finding binomial coefficient by given formula.
        }
    }
    public static int GCD(int a, int b){//problem 10
        if(b == 0){//if b is equal to zero it return a, cause  the GCD of any number and zero is that number.
            return a;
        }
        else{
            return GCD(b, a%b);//find the GCD, by the formula
        }
    }

    }

