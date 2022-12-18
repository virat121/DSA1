package arrays;

//Reversing an array element
public class ReverseArray {
	public static void reverse(int arr[]) {
		int s = 0, e = arr.length - 1;
		while (s < e) {
			//swap function to reverse an array
			arr[s] ^= arr[e];
			arr[e] = arr[s] ^ arr[e];
			arr[s] = arr[e] ^ arr[s];
			s++;
			e--;
		}
	}
    //printing array elements
	public static void display(int arr[]) {
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		reverse(arr);
		display(arr);
	}

}
