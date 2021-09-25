
public class ArrayBagTest<T> extends ResizableArrayBag<T> {
	
	@SuppressWarnings("unchecked")
	public static <T> void main(String[]args) {
		//This section will test out the three methods, intersection, union, difference
		ResizableArrayBag<T> newOne = new ResizableArrayBag<T>(2);
		ResizableArrayBag<T> secondArray = new ResizableArrayBag<T>(2);
		ResizableArrayBag<T> thirdArray = new ResizableArrayBag<T>(2);
		
		//adding content to secondArray
		secondArray.add((T) "a");
		secondArray.add((T) "a");
		secondArray.add((T) "b");
		secondArray.add((T) "e");
		secondArray.add((T) "d");
		//test print...seems to print the location of the array in memory
		System.out.println(secondArray);
		//Testing to see if the bag stored values correctly
		System.out.println(secondArray.getIndexOf((T) "a"));
		System.out.println(secondArray.getIndexOf((T) "b"));
		System.out.println(secondArray.getIndexOf((T) "e"));
		
		//adding content to thirdArray
		thirdArray.add((T) "h"); 
		thirdArray.add((T) "h");
		thirdArray.add((T) "f");
		thirdArray.add((T) "g");
		thirdArray.add((T) "e");
		//test print...does same thing...odd...
		System.out.println(thirdArray);
		
		
		//printing intersections
		System.out.println(newOne.intersection(secondArray, thirdArray));
		
		
	}
	
	
}
