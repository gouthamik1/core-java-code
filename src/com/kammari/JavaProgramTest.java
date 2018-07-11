package com.kammari;

import java.util.Arrays;
public class JavaProgramTest {

    public static void main(String args[]) {
        JavaProgramTest test_obj = new JavaProgramTest();

        int fibonacci_result = test_obj.fibonacciUsingRecursion(5);
        System.out.println("fibonacci series from 1 to 5 is " + fibonacci_result);

        test_obj.fibonacciPrintSeries();

        int factorial_result = test_obj.factorialUsingRecursion(7);
        System.out.println("The factorial O(using recursion) of 7 is : " + factorial_result);

        test_obj.factorial(7);

        test_obj.printPrimeNumbers();

        test_obj.isPrimeNumber(67);

        test_obj.reverseNumber(36755);

        test_obj.printTraingle();

        String palindrome_word = "madam";
        char[] palindrome_word_array = palindrome_word.toCharArray();
        System.out.println(isPalindrome(palindrome_word_array) + " " + palindrome_word + " is a palindrome" );

        test_obj.sumOfArray();

        test_obj.sumOfSquares(5);

        test_obj.sumOfMthPowers(5,2);

        test_obj.sort();
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
    public void fibonacciPrintSeries(){
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
//        int n=0;
//        System.out.println("Enter a number upto which fibonacci series to print : ");
//        Scanner scan = new Scanner(System.in);
//        n = scan.nextInt();
        int n = 10;
        System.out.println("fibonacci series upto " + n + " numbers : " );
        while (sum <= n)
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

    public void factorial(int num){

        int result = 1 ;

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
            Boolean flag = true;
            for(int j=2;j<=i/2;j++)  // 2.Try dividing the number by half check whether it divisible
            {
                if(i%j==0) // 3. If the number is divisible by other number ->Not a prime Number
                {
                    flag = false;
                    break;
                }

            }
            if(flag) // 4. If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.print(i+" ");
            }
        }
    }

    public void isPrimeNumber(int num){
        int count = 0;
        if (num == 0 || num == 1 || num == 2){
            System.out.println(num + " is not a prime number");
        }
        for (int i=2; i<num ;i++)
        {
            if(num%i == 0){
               count ++;
               break;
            }
        }
        if(count == 0){
            System.out.println("\n" + num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }

    }

    public void reverseNumber(int num){
        int reverseNum =0;
        int n = num;
        //While Loop: Logic to find out the reverse number
        while( num != 0 )
        {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of " + n + " is: " + reverseNum);
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
        int[] array = {10, 20, 30, 40, 50, 80};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }

        System.out.println( Arrays.toString(array) + " Sum of array elements is: "+sum);
    }

    public void sumOfSquares(int n){
        int sum = 0;
        for(int i=1;i <= n;i++)
        {
            sum += (i*i);
        }
        System.out.println("Sum of squares for n = " + n + " is: " + sum);
    }

    public void productOfNnumbers(int n) {
        //for n = 3 : 1*2*3 = 6 etc.
        int res=1;
        for (int i = 1; i<=n ;i++)
            res *= i;
    }
    public void sumOfMthPowers(int n, int m){
        int sum = 0;
        int power;
        for(int i=1;i <= n;i++)
        {
            power = 1;
            for(int j=1; j <= m; j++ )
            {
              power *= i;
            }
            sum += power;

        }
        System.out.println("Sum of " + m +"th powers for n = " + n + " is: " + sum);
    }

    public void sort(){
        int n, temp;
        int[] a = {1,8,10,2,67,90,23,11,90,-1,-23, 444444};
        n = a.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }



}
