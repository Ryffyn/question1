
public class Question1 {
	public static void main(String[] args) {
		
		replace("User is not allowed");
		
	}
	
	public static void replace(String input) {
		String string= input;  
		String replaceString=string.replace(" ","&32");  
		System.out.println(replaceString);  
	}
	
	
}
