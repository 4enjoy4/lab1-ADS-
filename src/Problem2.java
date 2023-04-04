import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(avg(arr, a));
    }
    public static int avg(int[] arr, int a){
        if(a == 0){
            return 0;
        }
        else{
            return (arr[a - 1] + (a -1) * avg(arr, a -1)) / a;
        }
    }
}
