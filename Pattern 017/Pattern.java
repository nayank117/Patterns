import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n/2+1; i++) {
            for(int j = 1; j <= n/2-i+1; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= i+i-1; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= n/2-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n/2; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= n-i-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}