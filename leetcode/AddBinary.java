package leetcode;

public class AddBinary {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11", b = "10";
		System.out.println(addBinary(a, b));
	}
	public String addBinary(String a, String b) {
		StringBuffer str = new StringBuffer();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while(i >= 0 || j >= 0 || carry != 0) {
			int sum = carry;
			if(i >= 0) {
				sum += a.charAt(i) - '0'; //we subtract '0' to get the int value from the ascii
				i--;
			}
			if(j >= 0) {
				sum += b.charAt(j) - '0';
				j--;
			}
			str.append(sum%2);
			carry = sum/2;
		}
		
		return str.reverse().toString();
        
    }

}
