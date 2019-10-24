package WrapperClassPack;

public class Myclass {	
	
	static int getIntLenth(int val){
		Integer b = val;
		String s = b.toString();
		int n = s.length();
		return n;
	}	
	
	public static void main(String[] args) {
		int len = getIntLenth(125);
		System.out.println("Lenghth of int value is: "+ len);
	}

}
