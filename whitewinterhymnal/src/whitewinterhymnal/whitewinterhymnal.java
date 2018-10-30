package whitewinterhymnal;

public class whitewinterhymnal 
{

	public static void main(String[] args) 
	{
		int[] myArray = new int[20];
		for (int i = 0; i < myArray.length; i++)
			myArray[i] = (int)(Math.random() * 20)+1;
	
	System.out.println("the average " + average(myArray));
	System.out.println("13 appears " + isPresent(myArray, 13));
	System.out.println("at index " + indexOf(myArray, 13));
	System.out.println(Arrays.toString(myArray));
	}

	//can be private bc it doesn't leave this program
	private static double average(int[] arr)
	{
		for (int num : arr)
		{
			double sum = 0 ;
			sum += num;
		}
		return (sum/arr.length) ;
	}
	private static boolean isPresent(int[] arr, int target)
	{
		for(int num : arr)
		{
			if(num == target)
				return true;
		}
		return false;
	}
	/**
	 * returns the first occurance of target value
	 * @param arr array
	 * @param target target valye
	 * @return the index of the frst occurance of target or -1 if not found
	 */
	private static int indexOf(int[] arr, int target)
	{
		for(int i = arr.length; i >= 0; i--)
		{
			if(arr[i]  ==target)
				return i;
		}
		return -1;
		//denotes that the value was not found at any position
	}

}
