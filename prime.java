import java.util.*;
class prime{
    static void PrimeOrNot(int n){
        int count = 0;
        if(n == 0 || n == 1){
            System.out.println("It is Prime");
        }
        else{
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("It is Prime");
        }
        else{
            System.out.println("Its not prime");
        }
    }
    public static void main(String []args){
        System.out.println("Enter a number:");
       Scanner sc = new Scanner System.in;
        int n = sc.nextInt();
        PrimeOrNot(n);
    }
    }
