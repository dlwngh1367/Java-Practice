import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		 System.out.println(reverse());
	}
		private static String reverse() {
			int[] a = new int[] {1,2,3,4,5};
			int[] b = new int[a.length];
			for(int i=0; i<a.length; i++) {
				int temp=a[i];
				b[i]=a[a.length-i-1];
				a[i]=temp;
				
			}
			return Arrays.toString(b);

		}}
