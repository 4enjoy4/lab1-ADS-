import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        System.out.println(string(line));
    }
    public static boolean string(String s){
        if (s.isEmpty()) {//if string is empty it would return true
            return true;
        }
        char element = s.charAt(0);
        if (!Character.isDigit(element)) {//checks if the first element is not digit
            return false;// return false, if no digit
        }
        return string(s.substring(1));//
    }
}

