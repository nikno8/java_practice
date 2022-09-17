package practice_5;

public class Recursion_14 {
    public void Print(int n){
        if(n < 10) {
            System.out.print(n+" ");
            return;
        }
        Print(n / 10);
        System.out.print(n % 10 + " ");
    }
}
