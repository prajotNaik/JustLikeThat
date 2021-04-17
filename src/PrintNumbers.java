

public class PrintNumbers {

	public static void main(String[] args) {
		print(1, 5);
	}
	
	public static int print(int start, int num) {
		System.out.println(start);
		if(num == start) {
			return num;
		}
		
		return print(start+1, num);
	}
}
