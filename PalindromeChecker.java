public class PalindromeChecker {
	
	//recursively check if input is palindrome
	public static boolean palindromecheck(int left, int right,String arr) {
		left = 0;
		right = arr.length()-1;
		
		if(left >= right) {
			return true;
		}
		if(arr.charAt(left) != arr.charAt(right)) {
			return false;
		}
			return palindromecheck(left + 1, right - 1, arr);
	}
	
		public static boolean palindromecheck(String arr){
			return palindromecheck(0,arr.length()-1, arr);
		}
		
	public static void main(String[] args) {
		
		// allow user to enter own input
		Scanner palindromeinput = new Scanner(System.in);
		System.out.println("Enter an input, and we'll tell you if it is a palindrome or not");
		String input = palindromeinput.nextLine();
		
		//make sure of no case issues
		input = input.toLowerCase();
		
		boolean arr = palindromecheck(input);
		System.out.println(arr);
		
		
		
	}
}
