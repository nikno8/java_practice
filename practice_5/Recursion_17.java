package practice_5;

public class Recursion_17 {
    public int FindMax(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, FindMax());
        }
    }
}

