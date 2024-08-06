// import java.util.Scanner;
import java.util.*;
public class Loops_Programs_15To24 {

    public static void main(String[] args) {
        // NaturalNumbers();
        // isprime();
        // NaturalNumbersDescending();
        // primeRange();
        // FibonacciSeries();
        // MultiplicationTable();
        // factorial();
        // SumSeries();
        // oddSeries();
        cubeSeries();
    }

    // 15.   Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.

    // Expected output:
    
    // Enter the number of natural numbers to be generated:
    // 5
    // First 5 natural numbers are : 1 2 3 4 5
    public static void NaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int n = sc.nextInt();
        System.out.print("First "+n+" natural numbers are: ");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }

    // 16.   Write a program to accept a number and determine whether it is a prime number or not.

    // Expected output:
    
    // Enter any number:
    // 9
    // The entered number 9 is not a prime number
    
    // Enter any number:9
    // 7
    // The entered number 7 is a prime number

    public static void isprime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        for(int i=2; i<num/2;i++){
            if(num%i == 0){
                System.out.println("The entered number "+num+" is a not prime number");
                return;
            }
        }
        System.out.println("The entered number "+num+" is a prime number");
    }

    // 17.   Write a program to generate the first 'N' natural numbers and print them in descending order.

    // Expected output:
    
    // Enter the number of natural numbers to be generated:
    // 5
    // The first 5 natural numbers in descending order are: 5 4 3 2 1
    
    public static void NaturalNumbersDescending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int n = sc.nextInt();
        System.out.print("First "+n+" natural numbers in descending order are: ");
        for(int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
    }

    // 18.    Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.

    // Expected output:
    
    // Enter the lower bound value:
    // 5
    // Enter the upper bound value:
    // 15
    // The prime numbers between 5 and 15 are: 5 7 11 13

    public static void primeRange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound value:");
        int low = sc.nextInt();
        System.out.println("Enter the upper bound value:");
        int high = sc.nextInt();
        System.out.print("The prime numbers between "+low+" and "+high+" are: ");
        for(int num=low; num<=high; num++){
            boolean isprime = true;
            for(int i=2 ; i<num/2; i++){
                if(num%i == 0)
                    isprime = false;
            }
            if(isprime)
                System.out.print(num+" ");
        }
    }

    // 19.   Write a program to accept a number and print the Fibonacci series up to the entered number.

    // Expected output:
    
    // Enter the upper bound number to generate the Fibonacci numbers:
    // 8
    // Fibonacci series up to the entered number is: 0 1 1 2 3 5 8
    
    public static void FibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.print("Fibonacci series up to the entered number is: "+first+" "+second+" ");
        while(third < num){
            third = first+second;
            first = second;
            second = third;
            System.out.print(third+" ");
        }
    }
    
    // 20.   Write a program to accept a number from the user and print its multiplication table (upto “times 10”).

    // Expected output:
    
    // Enter the number to generate its multiplication table:
    // 19
    // Multiplication table for 19 is :
    // 19 * 1 = 19
    // 19 * 2 = 38
    // …..............
    // …..............
    // 19* 10 = 190

    public static void MultiplicationTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate it's multiplication table:");
        int num = sc.nextInt();
        System.out.println("Multiplication table for "+num+" is :");
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    // 21.   Write a program to accept a number and find its factorial.

    // Expected output:
    
    // Enter any number:
    // 5
    // The factorial of 5 is 120
    // (Hint: 5! = 5 * 4 * 3 * 2 * 1)
    
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of "+num+" is "+fact(num));
    }
    public static int fact(int n){
        if(n == 1 || n== 0)
            return 1;
        
        return n*fact(n-1);
    }

    // 22.   Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.

    public static void SumSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int num = sc.nextInt();
        double sum = 0;
        for(int i=1; i<= num; i++){
            sum = sum + (1.0/i);
        }
        System.out.println("Final sum is: "+sum );
    }

    // 23.   Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and find the sum of the numbers in this series.
    
    public static void oddSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The series is: ");

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println("\nThe sum of Series is: "+sum);

    }

    // 24.   Write a program to accept a number “n” from the user; find the sum of the series 1/23+1/33+1/43……..+1/n3
    public static void cubeSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int num = sc.nextInt();
        double sum = 0;
        for(int i=1; i<= num; i++){
            sum = sum + (1.0/(i*i*i));
        }
        System.out.println("Final sum is: "+sum );
    }
    
}