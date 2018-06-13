package com.jqchan;

/**
 * 基本数据类型,及其封装类型
 * 简单类型	boolean	byte	char	short	int	long	float	double
 * 二进制位数	1		8		16		16		32	64		32		64
 */
public class Chapter1 {


	public static void numberInteger(){

		//byte -127~126
		byte b = 0;
		Byte b_min = Byte.MIN_VALUE;
		Byte b_max= Byte.MAX_VALUE;
		System.out.println(b+" "+b_min+"~"+b_max);

		//short
		short s = 0;
		Short s_min = Short.MIN_VALUE;
		Short s_max = Short.MIN_VALUE;
		System.out.println(s+" "+s_min+"~"+s_max);

		int i = 0;
		Integer i_min = Integer.MIN_VALUE;
		Integer i_max = Integer.MAX_VALUE;
		System.out.println(i+" "+i_min+"~"+i_max);

		//long 的操作是 非原子性
		long l = 0L;
		Long l_min = Long.MIN_VALUE;
		Long l_max = Long.MAX_VALUE;
		System.out.println(l+" "+l_min+"~"+l_max);

	}


	public static void numberDouble(){
		float f = 0;
		Float f_min = Float.MIN_VALUE;
		Float f_max = Float.MAX_VALUE;
		System.out.println(f+" "+f_min+"~"+f_max);

		double d = 0;
		Double d_min = Double.MIN_VALUE;
		Double d_max = Double.MAX_VALUE;
		System.out.println(d+" "+d_min+"~"+d_max);
	}

	public static void charDataType(){
		char c = 'a';
		//unicode编码 16位
		Character c_min = Character.MIN_VALUE;
		Character c_max = Character.MAX_VALUE;

		System.out.println(c+" "+(int)c_min+"~"+(int)c_max);
	}

	public static void main(String[] args) {
		/**
		 * output
		 * 0 -128~127
		 * 0 -32768~-32768
		 * 0 -2147483648~2147483647
		 * 0 -9223372036854775808~9223372036854775807
		 */
		Chapter1.numberInteger();
		/**
		 * output
		 * 0.0 1.4E-45~3.4028235E38
		 * 0.0 4.9E-324~1.7976931348623157E308
		 */
		Chapter1.numberDouble();
		/**
		 * output
		 * a 0~65535
		 */
		Chapter1.charDataType();

	}

	public static void test(Integer i){
		i=2;
		System.out.println("i in test :"+i);
	}
}
