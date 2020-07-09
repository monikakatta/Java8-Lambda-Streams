package com.epam.lambdaandstreams;
import java.io.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("Press 1 to find Average of n numbers");
    		System.out.println("Press 2 to return the strings starting with a and length 3" );
    		System.out.println("Press 3 to Check Palindromes from the given list");
    		System.out.println("Enter 0 to exit");
    		int n=sc.nextInt();
    		boolean flag=false;
    		switch(n) {
    		case 1:
    		{
    			System.out.println("enter the size of list");
    			int size=sc.nextInt();
    			System.out.println("enter the element in the list");
    			List<Integer> arr =new ArrayList<>();
    			for(int i=0;i<size;i++) {
    				arr.add(sc.nextInt());
    			}
    			Average a=new Average();
    			System.out.println("The average of the list is "+a.average(arr));
    	        System.out.println("****************************************************************************************************************");

    			break;
    		}
    		case 2:
    		{
    			System.out.println("enter the size of list");
    			int size=sc.nextInt();
    			System.out.println("enter the element in the list");
    			List<String> arr =new ArrayList<>();
    			for(int i=0;i<size;i++) {
    				arr.add(sc.next());
    			}
    			Stringwitha s=new Stringwitha();
    			System.out.println("palindrome in the list are");
    			System.out.println(s.find(arr));
    	        System.out.println("****************************************************************************************************************");

    			break;
    		}
    		case 3:
    		{
    			System.out.println("enter the size of list");
    			int size=sc.nextInt();
    			System.out.println("enter the element in the list");
    			List<String> arr =new ArrayList<>();
    			for(int i=0;i<size;i++) {
    				arr.add(sc.next());
    			}
    			PalindromeorNot p=new PalindromeorNot();
    			p.ListOfPalindrome(arr);
    	        System.out.println("****************************************************************************************************************");

    			break;
    			
    		}
    		default:
    			{
    				flag=true;
    				break;
    			}
    			
     		} 
    		if(flag) {
    			break;
    		}
    	}
    	System.out.println("end of program");
    	return ;
       
    }
}
