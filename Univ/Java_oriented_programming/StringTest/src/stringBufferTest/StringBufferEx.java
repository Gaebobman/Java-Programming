package stringBufferTest;

public class StringBufferEx {
	
	public static StringBuffer encrypt(String s, int n) {
		StringBuffer cipher = new StringBuffer(256);
		for(int i = 0 ; i< s.length();i++) {
			char ch = s.charAt(i);
			// 밀어버려
			ch =(char)((ch - 'a' +n) %26 +'a');
			cipher.append(ch);
			
		}
		return cipher;
	}
	
	public static String encrypt2(String s, int n) {
		String cipher ="";
		for(int i = 0 ; i< s.length();i++) {
			char ch = s.charAt(i);
			ch =(char)((ch - 'a' +n) %26 +'a');
			cipher = cipher + ch;
			
		}
		return cipher;
	}

	public static void main(String[] args) {
		long cur = System.nanoTime();
		encrypt("xyzaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
		long end = System.nanoTime();
		double elasped = (end - cur)/ 1000000.0;
		System.out.println(elasped);
		System.exit(1000);
		
		long cur2 = System.nanoTime();
		encrypt2("xyzaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
		long end2 = System.nanoTime();
		double elasped2 = (end2 - cur2)/ 1000000.0;
		System.out.println(elasped2);
		
		System.exit(1000);
	}

}
