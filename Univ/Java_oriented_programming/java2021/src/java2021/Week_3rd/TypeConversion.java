package java2021.Week_3rd;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;

		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		// char 2byte ÀÌ¹Ç·Î  0x0041 -> A
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}