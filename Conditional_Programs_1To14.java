import java.util.Scanner;
import java.util.*;

public class Conditional_Programs1To14{
    public static void main(String[] args) {
        // SumOfTwo();
        // WeightOfThree();
        // CalculateYearlySalary();
        // SwapTwoNumbers();
        // SimpleInterest();
        // ConvertToPositive();
        // CalculateBillAmt();
        // RegisterPerson();
        //IF ELSE
        // EvenOdd();
        // BigNum();
        // DiffPositive();
        // BillingAmt();
        //IF_ELSE_IF
        // BiggestOfThree();
        CalculateGrade();

    }


    // Write a program to accept two numbers from the user, calculate the sum and display the same.
    // Expected output:

    // Enter the num1 value:
    // 10
    // Enter the num2 value:
    // 20
    // Sum of 10 and 20 is 30
    public static void SumOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 value: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));

    }

    // Write a program to accept the weight of 3 persons, calculate the total weight, determine the average weight and display these details.

    // Expected output:

    // Enter the weight of the first person:
    // 55.5
    // Enter the weight of the second person:
    // 45.4
    // Enter the weight of the third person:
    // 65.6
    // The sum of weight of the 3 persons is 166.5 Kgs and the average weight is 55.5 Kgs

    public static void WeightOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the first person:");
        float w1 = sc.nextFloat();
        System.out.println("Enter the weight of the second person:");
        float w2 = sc.nextFloat();
        System.out.println("Enter the weight of the third person:");
        float w3 = sc.nextFloat();
        System.out.println("The sum of weight of the 3 persons is "+(w1+w2+w3)+" Kgs and the average weight is "+((w1+w2+w3)/3)+" Kgs");
    }



    // Write a program to accept the following details of an employee: empno, name and monthly salary; calculate the yearly salary and display the result.

    // Expected output:

    // Enter the empno:
    // 1001
    // Enter the employee name:
    // Ramana
    // Enter the monthly salary:
    // 25000
    // Hi Ramana! Your employee id is 1001, monthly salary is Rs 25,000 and yearly salary is Rs 300,000.

    public static void CalculateYearlySalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empno:");
        int empno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name:");
        String name = sc.nextLine();
        System.out.println("Enter the monthly salary:");
        int salary = sc.nextInt();
        System.out.println("Hii "+name+"! Your employee id is "+empno+", monthly salary is Rs "+salary+" and yearly salary is Rs "+(salary*12));
    }

    // Write a program to accept two numbers from the user, swap their values and display the result.

    // Expected output:

    // Enter the first number num1:
    // 100
    // Enter the second number num2:
    // 200
    // Before swap, the values of num1=100 and num2=200
    // After swap, the values of num1=200 and num2=100

    public static void SwapTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number num2:");
        int num2 = sc.nextInt();
        System.out.println("Before swap, the value of num1="+num1+" and num2="+num2);
        //one method 
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        //second method without using third variable
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        //third method with exor operator
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swap, the value of num1="+num1+" and num2="+num2);
    }

    // Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.

    // Expected output:

    // Enter the principal amount:
    // 20000
    // Enter the rate of interest
    // 1.5
    // Enter the time (years)
    // 2

    // Simple interest is 600

    // (Help: Simple Interest formula ((p*t*r)/100))

    public static void SimpleInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("Enter the rate of interest:");
        float r = sc.nextFloat();
        System.out.println("Enter the time (years)");
        int t = sc.nextInt();

        System.out.println("Simple Interest is "+((p*t*r)/100));
    }

    // Write a program to accept a number, if it is negative then covert it to a positive number.

    // Expected output:
    
    // Enter a number:
    // -10
    // The result is: 10

    public static void ConvertToPositive(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num < 0){
            //first way
            // num = Math.abs(num);
            //2nd way
            num = num - num - num;
        }
        System.out.println("The result is: "+num);
    }

    // .       Write a program to accept the billing amount, if it is > 6000 then give a discount of 10% and display the net amount.

    // Expected output:

    // Enter the billing amount:
    // 6500
    // Your net billing amount: 5850

    // Enter the billing amount:
    // 5500
    // Your net billing amount: 5500

    
    public static void CalculateBillAmt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the billing amount");
        double bill = sc.nextDouble();
        if(bill > 6000){
            bill = bill - (bill*0.1);
        }
        System.out.println("Your net billing amount:"+bill);
    }


    // .       The Sports Club registration form has the following details: name, mobile number and age. Per the membership policy, the person should be at least 18 years old to become a member. Write a program to accept the details mentioned above; if the age is >18 years then display the entered details with a congratulatory message, else the following message should be displayed “Sorry! You need to be at least 18 years old to get membership.”

    // Expected output:

    // Enter the name:
    // Lakshman
    // Enter the mobile number:
    // 989999999
    // Enter the age:
    // 16

    // “Sorry! You need to be at least 18 years old to get membership.”

    // Enter the name:
    // Lakshman
    // Enter the mobile number:
    // 989999999
    // Enter the age:
    // 30

    // “Congratulations Lakshman for your successful registration.”

    public static void RegisterPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the mobile number :");
        String num = sc.nextLine();
        System.out.println("Enter the age :");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
            return;
        }
        if(age >= 18){
            System.out.println("Congratulations "+name+" for your successful registration.");
        }
    }


    //IF ELSE Problems
    // 9.       Write a program to accept a number from the user and determine whether it is even or odd.

    // Expected output:

    // Enter a number:
    // 15
    // The entered number 15 is odd

    // Enter a number
    // 10
    // The entered number 10 is even

    public static void EvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The entered number "+num+" is even");
        }
        else{
            System.out.println("The entered number "+num+" is odd");
        }
    }

    // 10.   Write a program to accept two numbers from the user and determine bigger of the two.

    // Expected output:

    // Enter the first number num1:
    // 20
    // Enter the second number num2:
    // 45

    // The bigger of the two numbers entered (20 and 45) is: 45

    public static void BigNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number num2:");
        int num2 = sc.nextInt();
        int ans = num1;
        if(num1 > num2){
            ans = num1;
        }
        else{
            ans = num2;
        }
        System.out.println("The bigger of two numbers entered ("+num1+" and "+num2+") is :"+ans);
    }

    // 11.   Write a program to accept two numbers num1 and num2; when one is subtracted from the other, the result should always be a positive number.

    // Expected output:

    // Enter the first number num1:
    // 35
    // Enter the second number num2:
    // 45
    // The result (difference) is: 10

    // Enter the first number num1:
    // 45
    // Enter the second number num2:
    // 35
    // The result (difference) is: 15


    public static void DiffPositive(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number num2:");
        int num2 = sc.nextInt();
        int diff = Math.abs(num1-num2);
        System.out.println("The result (difference) is :"+diff);
    }

    // 12.   In a shopping mall, privileged customers (if they have a membership card) are being given a 10% discount on the billed amount, and the others are being given a 3% discount. Write a program to accept the billing amount and confirm the membership card from the customer; calculate and display the net amount to be paid by the customer.

    // Expected output:
    
    // Enter the bill amount:
    // 5000
    // Do you have a membership card?
    // Y
    // Thank you! Your total bill amount is Rs 5000, discount is Rs 500 and net amount payable is Rs 4500.
    
    
    // Enter the bill amount:
    // 5000
    // Do you have a membership card?
    // N
    // Thank you! Your total bill amount is Rs 5000, discount is Rs 150 and net amount payable is Rs 4850.

    public static void BillingAmt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double amt = sc.nextDouble();
        sc.nextLine();
        System.out.println("Do you have a membership card?");
        String str = sc.nextLine();
        double discount = 0.0;
        double netAmt = 0.0;
        if(str.toLowerCase().charAt(0) == 'y'){
            discount = amt*0.1;
            netAmt = amt - discount;
        }
        else{
            discount = amt*0.03;
            netAmt = amt - discount;
        }
        System.out.println("Thank you! Your total bill amount is Rs "+amt+", discount is Rs"+discount+" and net amount payable is Rs "+netAmt);
    }

    //IF_ELSE_IF Statement
    // 13.   Write a program to accept 3 numbers from the user and find the biggest of them.

    // Expected output:
    
    // Enter the 1st number num1:
    // 45
    // Enter the 2nd number num2:
    // 75
    // Enter the 3rd number num3:
    // 45
    // The biggest of the 3 numbers entered is: 75

    public static void BiggestOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 1st number num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 1st number num3: ");
        int num3 = sc.nextInt();
        int ans = 0;

        if(num1 > num2 && num1 > num3)
            ans = num1;
        else if(num2 > num1 && num2 > num3)
            ans = num2;
        else 
            ans = num3;

        System.out.println("The biggest of 3 numbers entered is: "+ ans);
    }

    // 14.   Write a program to accept the marks scored in three subjects; determine the sum and average of the entered marks. Grade is awarded based on following criteria.

    // If average is < 35 -- “C”; >35 and <60 -- “B”; Otherwise -- “A”
    
    // Expected output:
    
    // Enter the marks scored in 1st subject:
    // 40
    // Enter the marks scored in 2nd subject:
    // 60
    // Enter the marks scored in 3rd subject:
    // 80
    
    // Total marks: 180
    // Average is: 60.0
    // Grade: “B”

    public static void CalculateGrade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored in 1st subject: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks scored in 2nd subject: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks scored in 3rd subject: ");
        int m3 = sc.nextInt();
    
        double average = 0.0;

        average = (m1+m2+m3)/3;
        String grade = "F";

        if(average <= 35)
            grade = "C";
        else if(average > 35 && average <= 60)
            grade = "B";
        else
            grade = "A";
        
        System.out.println("Total marks: "+(m1+m2+m3)+"\nAverage is : "+average+"\nGrade: "+grade);
    }
    
    
    
}