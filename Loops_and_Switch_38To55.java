import java.util.Scanner;


public class Loops_and_Switch_38To55 {

    public static void main(String[] args) {
        // matSum();
        // countDigits();
        // sumOfDigits();
        // reverseNum();
        // ArmstrongNum();
        // sumTillSingleDigit();
        // primeDigits();
        // fact(8);
        // fourDigitDenomination(5698);
        // increment1(14395);
        // mPowern();
        // vowelConsonants();
        pattern();
        // operations();
        // smile();
        // series2();
    }

    // 38.   Write a program to find the biggest, smallest and sum of the elements in the given 3 X 3 matrix.

    // 5 6 7
    // 4 5 6
    // 5 6 7
    
    public static void matSum(){
        int mat[][] = {{5,6,7},{4,5,6},{5,6,7}};
        int sum = 0;
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                sum+= mat[i][j];
                if(mat[i][j] > biggest)
                    biggest = mat[i][j];

                if(mat[i][j] < smallest)
                    smallest = mat[i][j];
            }
        }
        System.out.println("Sum: "+sum+"\nBiggest Element is : "+biggest+"\nSmallest element is: "+smallest);
    }

    // 41.    Write a program to accept a number from the user and count the number of digits in the number.

    // Expected output:
    
    // Enter any number:
    // 14567
    // The number of digits in the entered number is 5
    
    public static void countDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        System.out.println("The number of digits in the entered number is "+count);
    }

    // 42.   Write a program to accept a number from the user and find the sum of digits in the entered number.
    // Expected output:
    
    // Enter any number:
    // 14567
    // The sum of digits of the entered number is 22
    

    public static void sumOfDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("The sum of digits of the entered number is "+sum);


    }

    // 43.   Write a program to accept a number from the user and find the reverse of the entered number.

    // Expected output:
    
    // Enter any number:
    // 45646
    // Reverse of the entered number is 64654

    public static void reverseNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }
        System.out.println("Revere of the entered number is "+rev);
    }

    // 44.   Write a program to accept a number from the user and determine whether it is an Armstrong number or not.
    // (Example: 153 is an Armstrong number 1^3 + 5 ^3 +3 ^3 =153)
    
    public static void ArmstrongNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int count = 0;
        int x = num;
        while(x > 0){
            count++;
            x /= 10;
        }
        x = num;
        int sum = 0;
        while(x > 0){
            int rem = x%10;
            int secSum = 1;
            for(int i=0; i<count; i++){
                secSum = secSum * rem;
            }
            sum += secSum;
            x /= 10;
        }
        if(num == sum)
            System.out.println(num+" is Armstrong Number ("+sum+")");
        else
            System.out.println(num+" is not Armstrong Number ("+sum+")");

    }

    // 45.   Write a program to accept a number from the user and calculate the sum of digits of the number; repeat the operation till the sum gets to be a single digit number.

    // Expected output:
    
    // Enter any number:
    // 9981
    // Single digit sum is: 9
    // (Hint: 9+9+8+1 = 27; 2+7 = 9)
    
    public static void sumTillSingleDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int sum = 0;
        int x = num;
        while(x > 0){
            int rem = x %10;
            sum += rem;
            x /= 10;
        }
        while(sum > 9){
            x = sum;
            sum = 0;
            while(x > 0){
                int rem = x %10;
                sum += rem;
                x /= 10;
            }
        }
    
        System.out.println("Single digit Sum is: "+sum);
    }

    // 46.   Write a program to accept a number from the user and count the number of prime digits.

    // Expected output:
    
    // Enter any number:
    // 97512
    // Number of prime digits in the entered number is 3

    public static void primeDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            int rem = num%10;
            boolean prime = true;
            if(rem <= 1)
                prime = false;
            else{
                for(int i=2; i < rem/2; i++){
                    if(rem%i == 0)
                        prime = false;
                }
            }
            if(prime)
                count++;
            num /= 10;
        }
        System.out.println("Number of prime digits in the entered number is "+count);
    }
    // 47.   Write a program to accept a number and find the factorial of the number (using while loop).
    public static void fact(int num){
        int fact = 1;
        while(num>0){
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial of number is: "+fact);
    }

    // 48.   Write a program to accept a four digit number from the user and display its denomination.

    // Example: 5698
    // Output: 5*1000 =5000
    // 6*100 =600
    // 9*10 =90
    // 8*1 =8

    public static void fourDigitDenomination(int num){
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // sc.nextLine();
        int rev = 0;
        int x = num;
        while(x > 0){
            rev = rev*10 + x%10;
            x /= 10;
        }
        int mul = 1000;
        while(rev > 0){
            System.out.println(rev%10+" * "+mul+" = "+(rev%10)*mul);
            rev /= 10;
            mul /= 10;
        }
    }

    // Write a program to accept a five digit number from the user, increment each digit by one and display the number (digit 9 gets incremented to 0).

    // Example:
    // Input: 14385
    // Output: 25496

    public static void increment1(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans = ans * 10 + (rem+1)%10;
            num /= 10;
        }
        num = 0;
        while(ans > 0){
            num = num*10 + ans%10;
            ans /= 10;
        }
        System.out.println("Output: "+num);
    }

    // 50.   Write a program to accept 2 numbers “m” and “n” from the user and determine m^n (without using predefined functions).

    public static void mPowern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = 1;
        while(n > 0){
            ans = ans * m;
            n--;
        }
        System.out.println("Answer is : "+ans);
        
    }

    // 51.   Write a program to accept a character from the user and check whether it is a vowel or consonant using switch statement.
    
    public static void vowelConsonants(){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("It's Vowel !!");
                
                break;
        
            default: System.out.println("It's Consonant !! ");
                break;
        }
    }

    // 52.   Write a program to accept two numbers num1, num2 and an operator. Simulate the calculator using switch statement.

    // Enter the 1st Operand num1:
    // 10
    // Enter the 2nd Operand num2:
    // 20
    // 1. add 2. mul 3. div 4. mod 5. div
    // Enter the operator
    // 1
    // The sum of 10 and 20 is 30
    
    public static void operations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Operand num1:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the 2nd Operand num2:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("1.add 2.sub 3.mul 4.div 5.mod");
        System.out.println("Enter the operator");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));      
                break;
            case 2:
                System.out.println("The ans of "+num1+" - "+num2+" is "+(num1-num2));      
                break;
            case 3:
                System.out.println("The multiplication of "+num1+" and "+num2+" is "+(num1*num2));      
                break;
            case 4: if(num2 == 0)
                        System.out.println("division not possible due to zero in the denominator");
                System.out.println("The division of "+num1+" by "+num2+" is "+(num1/num2));      
                break;
            case 5:
                System.out.println("The modulo of "+num1+" and "+num2+" is "+(num1%num2));      
                break;
        
            default:
                break;
        }
    }

    // 53.   Write a program to generate the following output

    // 1 2
    // 1 3
    // 2 1
    // 2 3
    // 3 1
    // 3 2

    public static void pattern(){
                System.out.println(1+" "+2+"\n"+1+" "+3);
                System.out.println(2+" "+1+"\n"+2+" "+3);
                System.out.println(3+" "+1+"\n"+3+" "+2);
        
    }
    
    // 54.   Write a program to add the first 7 terms of the following series using a for loop:
    // 1/1!+2/2!+3 /3!+....
    public static void series2(){
        int sum = 0;
        for(int i=1; i<=7; i++){
            sum = sum + i/facto(i);
        }
        System.out.println("Answer is: "+sum);
    }
    public static int facto(int num){
        if(num <= 1)
            return 1;
        return num*facto(num-1);
    }
    
    
    // 55.   Write a program to fill the entire screen with a smiling face. The smiling face has an ASCII value 1.
    public static void smile(){
        while(true){
            System.out.print((char)1);
        }
    }
}
