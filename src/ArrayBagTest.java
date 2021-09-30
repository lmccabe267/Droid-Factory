
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
		//System.out.println(secondArray.toString());
		//System.out.println(thirdArray.toString());
		//Testing to see if the bag stored values correctly
		
		
		//adding content to thirdArray
		thirdArray.add("a"); 
		thirdArray.add("h");
		thirdArray.add("f");
		thirdArray.add("g");
		thirdArray.add("e");
		
		System.out.println(secondArray);
		System.out.println(thirdArray);
		System.out.println("printing difference");
		System.out.println(secondArray.difference(thirdArray));
		
	}
	
	
}
