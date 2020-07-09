package com.epam.lambdaandstreams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class PalindromeorNot {
	static boolean palin(String s)
	{
		return IntStream.range(0, s.length() / 2).noneMatch(i -> s.charAt(i) != s.charAt(s.length() - i - 1));
	}
	public void ListOfPalindrome(List<String> list)
	{
		Predicate<String> p = (s)->palin(s);
		for (String st:list) 
		{
            if (p.test(st)) 
                System.out.println(st); 
        } 
	}
}
