
public class ArrayBagTest{
	public static void main(String[] args) 
	{
		//creating two linked bags of the type String
		ResizableArrayBag<String> bag1 = new ResizableArrayBag<>();
		ResizableArrayBag<String> bag2 = new ResizableArrayBag<>();
		
		//adding items to bag1
		System.out.println("Adding the following strings to bag1: D C B B A");
		bag1.add("A");
		bag1.add("B");
		bag1.add("B");
		bag1.add("C");
		bag1.add("D");
		displayBag(bag1);
		
		//adding items to bag2
		System.out.println("\n Adding the following strings to bag2: H C F B E");
		bag2.add("E");
		bag2.add("B");
		bag2.add("F");
		bag2.add("C");
		bag2.add("H");
		displayBag(bag2);
		
		
		//testing the 3 methods for the bags
		System.out.println("\n Testing the union of the two bags:");
		displayBag(bag1.union(bag2));
		System.out.println("\n Testing the intersection of the two bags:");
		displayBag(bag1.intersection(bag2));
		System.out.println("\n Testing the difference of the two bags:");
		displayBag(bag1.difference(bag2));
	}
		
	
   // Tests the method toArray while displaying the bag.
   private static void displayBag(BagInterface<String> aBag)
   {
      System.out.println("The bag contains the following string(s):");
      Object[] bagArray = aBag.toArray();
      for (int index = 0; index < bagArray.length; index++)
      {
         System.out.print(bagArray[index] + " ");
      } // end for
      
      System.out.println();
   } // end displayBag

   	public static <T> boolean isEmpty(LinkedBag<T> bag) {
   		if (isEmpty(bag)) {
   			return true;
   		}
   		return false;
   	}
	
	
}
