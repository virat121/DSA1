package arrays;

//all pairs with repetition also possible
//unique pairs are find using Set and HashSet in java
public class PairsInArray {
	public static void pairs(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					 continue;
				System.out.println(arr[i] + " " + arr[j]);
			}
				
		}
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 2 };
		pairs(arr);
	}
}
