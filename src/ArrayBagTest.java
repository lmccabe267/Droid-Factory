
public class ArrayBagTest{
	
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		//This section will test out the three methods, intersection, union, difference
		ResizableArrayBag<String> newOne = new ResizableArrayBag<String>(2);
		ResizableArrayBag<String> secondArray = new ResizableArrayBag<String>(2);
		ResizableArrayBag<String> thirdArray = new ResizableArrayBag<String>(2);
		
		//adding content to secondArray
		secondArray.add("a");
		secondArray.add("a");
		secondArray.add("b");
		secondArray.add("e");
		secondArray.add("d");
		//test print...seems to print the location of the array in memory
		System.out.println(secondArray);
		//Testing to see if the bag stored values correctly
		System.out.println(secondArray.getIndexOf("a"));
		System.out.println(secondArray.getIndexOf("b"));
		System.out.println(secondArray.getIndexOf("e"));
		
		//adding content to thirdArray
		thirdArray.add("h"); 
		thirdArray.add("h");
		thirdArray.add("f");
		thirdArray.add("g");
		thirdArray.add("e");
		//test print...does same thing...odd...
		System.out.println(thirdArray);
		
		
		//printing intersections
		System.out.println("Printing intersection");
		System.out.println(newOne.intersection(secondArray, thirdArray));
		
		
	}
	
	
}
