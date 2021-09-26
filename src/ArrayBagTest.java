
public class ArrayBagTest{
	
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		//This section will test out the three methods, intersection, union, difference
		BagInterface<String> newOne = new ResizableArrayBag<>();
		BagInterface<String> secondArray = new ResizableArrayBag<>();
		BagInterface<String> thirdArray = new ResizableArrayBag<>();
		
		//adding content to secondArray
		secondArray.add("a");
		secondArray.add("a");
		secondArray.add("b");
		secondArray.add("e");
		secondArray.add("d");
		//test print...seems to print the location of the array in memory
		System.out.println(secondArray.toString());
		//System.out.println(thirdArray.toString());
		//Testing to see if the bag stored values correctly
		
		
		//adding content to thirdArray
		thirdArray.add("h"); 
		thirdArray.add("h");
		thirdArray.add("f");
		thirdArray.add("g");
		thirdArray.add("e");
		
		System.out.println(thirdArray.toString());
		//test print...does same thing...odd...
		ResizableArrayBag<String> fourthArray = (ResizableArrayBag<String>)secondArray.union(thirdArray);
		System.out.println(fourthArray.toString());
		
		//printing intersections
		System.out.println("Printing intersection");
		//System.out.println(newOne.intersection(secondArray, thirdArray));
		
		
	}
	
	
}
