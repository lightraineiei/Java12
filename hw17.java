
public class hw17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="262904713";
		short num;
		num = Short.parseShort(str);
		System.out.println(num+"*2="+num*2);
	}
}

/*output
 * Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
	at java.base/java.lang.Short.parseShort(Short.java:122)
	at java.base/java.lang.Short.parseShort(Short.java:146)
	at hw17.main(hw17.java:8)*/
