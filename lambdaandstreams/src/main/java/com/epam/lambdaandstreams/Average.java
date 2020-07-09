package com.epam.lambdaandstreams;
import java.util.*;
public class Average {
       public double average(List<Integer> arr) {
    	   return arr.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
       }
}
