package moduleAndPackageTwo;

public class StringExPage6 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		if(a == b)
			System.out.println("1");	
		if(c == d)
			System.out.println("2");
		if(a.equals(b))
			System.out.println("3");
		if(c.equals(d))
			System.out.println("4");	

		String s = new String("hello");
		String t = s.concat("Java");
		System.out.println(s);
		System.out.println(t);
		//String은 Immutable 불변.
		String str1 = "abc";
		String str2 = "bcd";
		int res = str1.compareTo(str2);
		if(res == 0)
			System.out.println("the same");
		else if(res <0)
			System.out.println(str1 + " < " + str2);
		else
			System.out.println(str1 + " > " + str2);
		
		System.out.println("내용1".concat("내용2"));
		
		String stringspace ="   공백이 많음    ";
		System.out.println(stringspace.trim());
		
		char[]chrarr ="012345".toCharArray();
		System.out.println(chrarr[5]);
		char f = a.charAt(1);
		System.out.println(f);
	}

}
