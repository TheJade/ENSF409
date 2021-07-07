package Notes.LectureExample.Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.StringTokenizer;

public class arrays{
	public static void main(String args[]) {
		ArrayList<Integer> in_array = new ArrayList<Integer>();
		TreeSet<Integer> in_array2 = new TreeSet<Integer>();
		
		if(in_array2.isEmpty())
		{
			System.out.println("no elements in array list yet");
		}
/*		
		System.out.println("default initialization values");
		for(int e : in_array)
		{
			System.out.println(e);
		}

		System.out.println("fill function output");
		Arrays.fill(in_array,10);
		for(int e : in_array)
		{
			System.out.println(e);
		}
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("please Enter 10 integers");
		
		for(int i=0; i< 10 ;i++)
		{
			in_array.add(scan.nextInt());
		}

//		System.out.println("array list elements: ");
		Collections.sort(in_array);
		System.out.println("sorted array list elements are");
//		Arrays.sort(in_array);
		for(int e : in_array)
		{
			System.out.println(e);
		}
		
		System.out.println("element found at position " + Collections.binarySearch(in_array, 20));
	/*	
		in_array.set(2,100);
		System.out.println("third element on array list is now "+ in_array.get(2));
		
		Iterator<Integer> it= in_array.iterator();
		int i=0;
		while(it.hasNext()) {
				
			System.out.println(it.next());
			if(i==2)
				it.remove();
			i++;
		}
		
		System.out.println("array list elements: ");
//		Arrays.sort(in_array);
		for(int e : in_array)
		{
			System.out.println(e);
		}
		*/
		
/*		
		System.out.println("search output");
		int ind=Arrays.binarySearch(in_array,5);

		System.out.println("element found at index "+ind);
*/
		
	/*	
		for(int e : in_array)
		{
			System.out.println(e);
		}
		*/
		String s="Welcome to ENSF 409";
		StringTokenizer strtoken= new StringTokenizer(s);
		System.out.println("string has "+ strtoken.countTokens() + " tokens, whic are :");
		while(strtoken.hasMoreTokens())
			System.out.println(strtoken.nextToken());
		
	//	Scanner scanstr= new Scanner(s);
	//	for(int i =0; i <3; i++)
	//		System.out.println(scanstr.next());
	
	}
}