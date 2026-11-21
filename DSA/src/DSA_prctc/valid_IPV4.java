package DSA_prctc;

public class valid_IPV4 {
public static boolean isValidIPv4(String ip) {
	String[] parts=ip.split("\\.");
	if(parts.length!=4) {
		return false;
	}
	for(String part:parts) {
		if(part.length()==0||part.length()>3) {
			return false;
		}
		if(part.charAt(0)=='0'&&part.length()>1) {
			return false;
		}
		
		for(int i=0;i<part.length();i++) {
			if(!Character.isDigit(part.charAt(i))) {
				return false;
			}
		}
		
		int num= Integer.parseInt(part);
			if(num<0|| num>255) {
				return false;
			}
		}
	return true;
	}
public static void main(String[] args) {
	System.out.println(isValidIPv4("192.23.54.78"));
	System.out.println(isValidIPv4("192.01.54.78"));
	System.out.println(isValidIPv4("192.23.54.00"));
	System.out.println(isValidIPv4("0.0.0.0"));
}
}
	
	
	
	

