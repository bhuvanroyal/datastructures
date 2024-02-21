package recursion;

public class Palindrome {

	public static boolean checkPalindrome(StringPermutation str) {
		if(str.length()<=1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return checkPalindrome(str.substring(1,str.length()-1));
		}
		return false;
		
	}
	
	public static void main(StringPermutation[] args) {

		StringPermutation str="SMADAMS";
		System.out.println(checkPalindrome(str));

	}

}
