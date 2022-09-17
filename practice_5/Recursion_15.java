package practice_5;


public class Recursion_15 {
    public void ReversePrint(int n) {
        if (n > 0){
            System.out.print(n % 10 + " ");
            ReversePrint(n / 10);
        }
    }
}
