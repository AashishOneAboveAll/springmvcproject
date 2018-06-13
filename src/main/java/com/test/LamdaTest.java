package com.test;

import java.util.Arrays;
import java.util.List;

interface test{
	void show();
}

class testimp implements test{

	@Override
	public void show() {
		System.out.println("From test Impl");
		
	}

}

public class LamdaTest {

		
	public static void main(String[] args) {
		
		test t = new testimp();
		t.show();	


		test t1 = new test() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
				System.out.println("Upgraded one !!");
				
			}
		};
		
	
	test t2 = () -> {
		
		System.out.println("from lambda");
		
	};
	
	t2.show();
	
	//Integer data[] = {10,20,40,50};
	List<Integer> dList = Arrays.asList(10,20,40,50);
	dList.forEach(x -> System.out.println(x));
	
	
	}
	
}