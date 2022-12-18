package arrays;

//searching element in an array
public class LinearSearch {
	public static int toSearch(int arr[],int x) {
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x)
				return i; 
		}
		return idx;
	}
   public static void main(String args[]) {
	   int arr[]= {40,20,15,34,90};
	   int x=23;
	   System.out.println(toSearch(arr,x));
   }
}
