package com.assignments.day2;

import java.math.BigInteger;

public class PrimitiveTypeBigIntegerVal {

	public static void main(String[] args) {
		    BigInteger bigvalue = BigInteger.valueOf(Long.MAX_VALUE);
	        System.out.println("Big Integer Value: "+bigvalue);
			
	        long long_Val = bigvalue.longValue();
			System.out.println("Convert  BigInteger to an long value: "+long_Val);
	       
			int integer_Val = bigvalue.intValue();
			System.out.println("Convert BigInteger to an int value: "+integer_Val);
	       
			short short_Val = bigvalue.shortValue();
	        System.out.println("Convert BigInteger to an short value: "+short_Val);
	       
	        byte byte_Val = bigvalue.byteValue();
	        System.out.println("Convert BigInteger to byte: "+byte_Val);
	        
	        long exact_LongVal = bigvalue.longValueExact();
			System.out.println("Convert BigInteger to exact long: "+exact_LongVal);
	}

}
