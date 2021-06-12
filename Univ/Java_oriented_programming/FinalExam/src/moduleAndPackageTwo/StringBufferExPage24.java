package moduleAndPackageTwo;

public class StringBufferExPage24 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.delete(8, 13);
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("java");
		StringBuffer sb3 = sb2.insert(2, "bcde").delete(0,1);
		sb2.setLength(20);
		System.out.println(sb3);
		System.out.println(sb2);
	}

}
