package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.apache.taglibs.standard.tag.common.core.ForEachSupport;
import org.hibernate.criterion.Distinct;

public class StreamTest {
	public static void main(String[] args) {
		
		List<String> myList=Arrays.asList("a1","a2","b1","c2","c1");
		
		myList
		.stream()
		.filter(s-> s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
		System.out.println("Example 2");
		 Stream.of("a1","a2","a3","a4")
		 .distinct()
		 .forEach(System.out::println);
		 
		 Arrays.stream(new int[] {1,2,3})
		 .map(n-> 2*n+1)
		 .average()
		 .ifPresent(System.out::println);
		 
	}
	


}
