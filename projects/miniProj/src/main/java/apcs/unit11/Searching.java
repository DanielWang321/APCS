package apcs.unit11;


public class Searching
{
	public static void main(String[] args)
	{
		int[] ar = {-4, -2, -1, 0, 1, 4, 4, 8, 64};
		System.out.println(sequentialSearch(ar, 4));
		System.out.println(binarySearch(ar, -1, 0, ar.length - 1));
	}
	
	//precondition: list is sorted
	//returns the index of an occurrence of target in list, -1 if target does not occur in list
	public static int binarySearch(int[] list, int target, int start, int end)
	{
		if (start > end) {
			return -1;
		}

		int mid = (start+end)/2;
		if (list[mid] == target){
			return mid;
		}
		if (target < list[mid]){//"get rid of" top half becasue target must be in bottom half
			return binarySearch(list, target, start, mid-1);
		}else{//target must be larger than list[mid]
			return binarySearch(list, target, mid+1,end);
		}
	}
	
	//returns the index of the first occurrence of target in list, 
		//-1 if target does not occur in list
	public static int sequentialSearch(int[] list, int target)
	{
		for(int i = 0; i<list.length;i++){
			if(list[i]==target){
				return i;
			}
		}
		return -1;
	}
}




