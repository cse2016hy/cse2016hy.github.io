
public class Reverselist {

	public static int[] reverse(int[] r) {
		int size = r.length; 
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[size - 1 - i] = r[i]; 
			// answer[9] = r[0];
			// answer[8] = r[1];
			// answer[7] = r[2];
			// ...  answer[0] = r[9];
		}
		r[0] = 100;
		return answer; 
	}
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) arr[i] = i;
		int[] rev = reverse(arr); 
		
		System.out.print("arr: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		System.out.println("");
		System.out.print("rev: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			System.out.print(rev[i]);
		}
		
	}

}
