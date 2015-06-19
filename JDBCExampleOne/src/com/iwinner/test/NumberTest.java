package com.iwinner.test;

import java.math.BigDecimal;

public class NumberTest {

	public static void main(String[] args) {
		Number num[]=new  Number[4];
		
		num[0]=new Integer(1);
		num[1]=new Float(2.0f);
		num[2]=new Long(10l);
		num[3]=new BigDecimal(3.0);
		for(Number n:num){
			System.out.println(n);
		}
	}
}
