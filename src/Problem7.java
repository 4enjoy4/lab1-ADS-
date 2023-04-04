import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(reverse(arr, a));
    }
    public static String reverse(int[] arr, int a){
        if(a == 0){
            return "";
        }
        else{
            return arr[a-1] + " " + reverse(arr,a -1);
        }
    }
}
