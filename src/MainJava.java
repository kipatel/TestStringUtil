
public class MainJava {
	
 public static void main(String[] args) {
	 System.out.println("MainJava.main()");
	 
	String hex = StringUtils.convertToHex("qeq".getBytes());
	System.out.println("MainJava.main() "+hex);
}

}
