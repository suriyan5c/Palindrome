package project_palindrome;
import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int total = 0;
int ReverseDigits = 0;
int count = 0;
System.out.println("Enter Number");
int value = scan.nextInt();
int value2 = value;
System.out.println("Reverse Number is");
while(value>0)
{
total = total + value%10;
ReverseDigits = ReverseDigits * 10 + value%10;
System.out.println(value%10);
value = value/10;
count++;
}
System.out.println("Sum of Digits : " + total);
System.out.println("Count of Digits : " + count);
System.out.println("Reverse Number(or)Palindrome : " + ReverseDigits);
if(ReverseDigits==value2)
{
	System.out.println(ReverseDigits + " given value is 'Palindrome'");
}
else
{
	System.out.println(ReverseDigits + " given value is 'Non Palindrome'");
}
}
}
