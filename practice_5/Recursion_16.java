package practice_5;

public class Recursion_16 {
    public void amountMax(int max_value, int count){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        if (n != 0){
            if (n > max_value)
                amountMax(n,1);
            else if (n == max_value)
                amountMax(n, ++count);
            else
                amountMax(max_value,count);
        }
        else
            System.out.println(count);
    }
}
