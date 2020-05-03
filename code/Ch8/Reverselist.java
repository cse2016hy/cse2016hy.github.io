
public class Reverselist {

	public static int[] reverse(int[] r) {
		int size = r.length; 
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[size - 1 - i] = r[i]; 
		}
		r[0] = 100;
		return answer; 
	}
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) arr[i] = i;
		
		System.out.print("arr: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		System.out.println("");
		
		int[] rev = reverse(arr); 
		System.out.print("arr: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		
	}

}
