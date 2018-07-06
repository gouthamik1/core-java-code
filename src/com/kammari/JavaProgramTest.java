package com.kammari;

import java.util.Scanner;

public class JavaProgramTest {

    public static void main(String args[]) {
        JavaProgramTest test_obj = new JavaProgramTest();

        int fibonacci_result = test_obj.fibonacciUsingRecursion(5);
        System.out.println("fibonacci series from 1 to 5 is " + fibonacci_result);

        test_obj.fibonacci();

        int factorial_result = test_obj.factorialUsingRecursion(7);
        System.out.println("The factorial O(using recursion) of 7 is : " + factorial_result);

        test_obj.factorial();

        test_obj.printPrimeNumbers();

        test_obj.numberReverse();

        test_obj.printTraingle();

        String palindrome_word = "madam";
        char[] palindrome_word_array = palindrome_word.toCharArray();
        System.out.println(isPalindrome(palindrome_word_array));

        test_obj.sumOfArray();

        test_obj.sumOfSquares();
    }

    public int fibonacciUsingRecursion(int num){
        int result;
        if(num==0 )
        {
            return 0;
        }
        if (num <= 2){
            return 1;
        }

        result = fibonacciUsingRecursion(num-1) + factorialUsingRecursion(num-2);
        return result;
    }
    public void fibonacci(){
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        System.out.println("fibonacci series from 1 to 21 are : ");
        while (sum <= 21)
        {
            System.out.println( sum + " " );
            sum = f1 +f2;
            f1 = f2;
            f2 = sum;

        }
    }

    public int factorialUsingRecursion(int num){
            int result;
            if(num==0 || num==1) {
                return 1;
            }

            result = factorialUsingRecursion(num-1) * num;
            return result;


    }

    public void factorial(){

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num =0;
        int result = 1 ;
        num = scan.nextInt();

        for (int i=num; i >= 1; i--)
        {
            result = result * i;
        }

        System.out.println("factorial of " + num + " is : " + result);

    }

    public void printPrimeNumbers(){
        //Scanner scan = new Scanner(System.in);
        int n = 100;
        System.out.print("Prime numbers from 1 to 100 are : ");
        for(int i=3;i<=n;i++) // 1.So we are starting with initialization i = 3. 2 is not prime.
        {
            int flag = 1;
            for(int j=2;j<=i/2;j++)  // 2.Try dividing the number by half check whether it divisible
            {
                if(i%j==0) // 3. If the number is divisible by other number ->Not a prime Number
                {
                    flag = 0;
                    break;
                }

            }
            if(flag==1) // 4. If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.print(i+" ");
            }
        }
    }

    public void numberReverse(){
        int num=0;
        int reversenum =0;
        System.out.println("Input your number and press enter: ");
        //capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //While Loop: Logic to find out the reverse number
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum);
    }

    public void printTraingle(){
        for (int a = 1; a <= 5; a++) {
            for (int x = 1; x <= a; x++) {
                System.out.print(x+" ");
            }
            // To print new line.
            System.out.println();
        }
    }

    public static boolean isPalindrome(char[] word){

        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public void sumOfArray(){
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }

    public void sumOfSquares(){
        int sum = 0;
        for(int i=5;i>=1;i--)
        {
            if(i%2 != 0)
            {
                if(sum < (i*i))
                {
                    sum = (i*i)-sum;
                }else {
                    sum = sum -(i*i);
                }
            }else{
                sum = sum + (i*i);
            }
        }
        System.out.println(sum);
    }


}
