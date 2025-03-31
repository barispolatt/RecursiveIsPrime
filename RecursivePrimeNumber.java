import java.util.Scanner;

public class RecursivePrimeNumber {


    static boolean isPrime(int n, int m) { //n = number, m = divider
        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (m == 1) {
            return true;
        }
        else {
            if (n % m == 0) {
                return false;
            }
        }

        return isPrime(n, m-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n,n/2)) System.out.println(n + " is a prime number");
        else System.out.println(n + " is not a prime number");

        sc.close();
    }

}
