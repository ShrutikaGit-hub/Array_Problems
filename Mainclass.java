package arrayPractise;
import java.util.ArrayList;

public class Mainclass {
    public static void main(String[] args) {
		int []arr = {2,2,4,6,6,1,3,5};
		
    	Sumofarray obj1 = new Sumofarray();
		int sum = obj1.sumation(arr);
		System.out.println("Sum of the Array is: "+sum);
		
		Minmaxofarray obj2 = new Minmaxofarray();
		ArrayList<Integer> ls = obj2.maxmin(arr);
		System.out.println("Minimum Number is : "+ ls.get(0));
		System.out.println("Maximum Number is : "+ ls.get(1));
		
		FindElement obj3 = new FindElement();
		int num = 3;
		int index = obj3.find(arr, num);
		System.out.println("Index of Element is : "+index);
		
		Avgcalculate obj4 = new Avgcalculate();
		float average = obj4.avg(arr);
		System.out.println("Average of Array is : "+average);
		
		ReverseArray obj5 = new ReverseArray();
		int []reverse = obj5.reverse(arr);
		System.out.print("Reverse Array is : ");
		for(int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+" ");
		}
		
		System.out.println();
		RemoveElement obj6 = new RemoveElement();
		int []newarr = obj6.remove(arr, 3);
		System.out.print("New Array : ");
		for(int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]+" ");	
		}
		
		System.out.println();
		int array[] = {2,3,4,5,6};
		BinarySearch obj7 = new BinarySearch();
		int binarysearch = obj7.search(array, 3);
		System.out.println("Index of element with binary search is : "+binarysearch);
		
		LinearSearch obj8 = new LinearSearch();
		int linearsearch = obj8.search(array, 3);
		System.out.println("Index of element with linear search is : "+linearsearch);
		
		PairsofArray obj9 = new PairsofArray();
		String pairs = obj9.pairs(array);
		System.out.println("Pairs of Arrays are : " +pairs);
		
		SecondLargest obj10 = new SecondLargest();
		int large = obj10.largest(arr);
		System.out.print("Second Largest Number from the Array [ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("] is "+large);
		
		MergeArray obj11 = new MergeArray();
		int []mergedarr = obj11.merge(arr, array);
		System.out.print("New Merged Array is : ");
		for(int i = 0; i < mergedarr.length; i++) {
			System.out.print(mergedarr[i]+" ");
		}
		
		System.out.println();
		System.out.print("Original Array is : [ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		SortArray obj12 = new SortArray();
		int []sortedarr = obj12.sort(arr);
		System.out.print("] & Sorted Array is : [ ");
		for(int i = 0; i < sortedarr.length; i++) {
			System.out.print(sortedarr[i]+" ");
		}
		System.out.println("]");
		
		CountEachElement obj13 = new CountEachElement();
		obj13.count(arr);
	}
}
