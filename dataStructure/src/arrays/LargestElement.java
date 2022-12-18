package arrays;

//finding largest element in an array
public class LargestElement {
	public static int getLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		int arr[] = { 100, 43, 12, 89, 65, 434 };
		System.out.println("Largest element is: " + getLargest(arr));
	}

}
