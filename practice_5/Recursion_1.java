package practice_5;

public class Recursion_1 {
    public String Triangle(int n){
        int sum = 0;
        int j = 0;
        if (n == 1)
            System.out.print(n);
        else{
            for (int i =0; sum < n; i++){
                sum += i;
                j = i;
            }
            System.out.print(Triangle(--n) + " " + j);
        }
        return "";
    }
}
