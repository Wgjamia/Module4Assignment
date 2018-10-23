package co.edureka.pack1;

public class Calc {
    public int sum(int a, int b){
        return a + b;
    }
    public int Subtract (int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a , int b){
        if (a == 0 )
            return 0;
        else
            return a / b;
    }
    public double fact(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }

    public int ReverseNumber(int num) {

       int reversed = 0;

       while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
       }
        return reversed;
    }


}
