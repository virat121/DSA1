package arrays;

//finding Second Largest element in an array

public class SecondLargest {
    //Naive Solution
	/*
	public static int getLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}

	public static int secondLargest(int arr[]) {
		final int F_LARGEST = getLargest(arr);
		int secondlargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != F_LARGEST) {
				if (secondlargest == -1)
					secondlargest = arr[i];
				else if (arr[i] > secondlargest)
					secondlargest = arr[i];
			}
		}
		return secondlargest;
	}
*/
//Efficient Solution
public static int secondLargest(int arr[]) {
	int res=-1,largest=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>arr[largest]) {
			res=largest;
			largest = i;
		}
		else if(arr[i]!=arr[largest]) {
			if(res==-1 || arr[i]>arr[res])
				res=i;
		}
	}
	return res;
}
	public static void main(String args[]) {
		int arr[] = { 94, 89, 56, 38, 90, 54 };
		System.out.println(secondLargest(arr));
	}
	
	
}
