public class MyClass
{
	public static void main(String[] args) {
	    int row = 4;
	    for (int i = 2; i <= row; i++) {
	        int num = 2;
	        for (int j = 2; j <= i; j++) {
	            System.out.print(num + " ");
	            num = num + 2;
	        }
	        System.out.println();
	    }
	}
}