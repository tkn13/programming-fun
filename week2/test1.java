import java.util.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls Enter number: ");
        int x = sc.nextInt();
        int i;
        boolean number = true;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                number = false;
            }
        }
        System.out.println(number);
        sc.close();
    }
}