package question;


public class Solution20141021 {
	public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        for(int i=0; i<numStr.length()/2+1; i++){
        	if(numStr.charAt(i) != numStr.charAt(numStr.length()-1-i)){
        		return false;
        	}
        }
        return true;
    }
	
	public boolean isPalindrome1(int x) {
        int palindromeX = 0;
        int inputX = x;
        while(x>0){
            palindromeX = palindromeX*10 + (x % 10);
            x = x/10;
        }
        return palindromeX==inputX; 
    }
	
	public static void main(String[] args) {
		Solution20141021 sl = new Solution20141021();
		System.out.println(sl.isPalindrome(100101));
	}
}
