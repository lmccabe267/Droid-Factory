
public class LinkedBagTest {
	public static void main(String[] args) 
	{
		//initializing arrays
		BagInterface<String> firstArray = new LinkedBag<>();
		BagInterface<String> secondArray = new LinkedBag<>();
		LinkedBag<String> list = new LinkedBag<>();
		LinkedBag<String> list2 = new LinkedBag<>();
		
		//adding values to list and list2
		list.add("a");
		list.add("b");
		list.add("c");
		list2.add("a");
		list2.add("d");
		list2.add("e");
	
		
		//adding values to those arrays 
		secondArray.add("a");
		secondArray.add("b");
		secondArray.add("c");
		secondArray.add("d");
		secondArray.add("e");
		
		firstArray.add("f");
		firstArray.add("a");
		firstArray.add("g");
		firstArray.add("h");
		firstArray.add("b");

		
		//Print intersection
		System.out.println("Printing list and list2: ");
		System.out.println(list);
		System.out.println(list2);
		System.out.println("Print intersection: ");
		//System.out.println(list.intersection(list2));
		System.out.println(firstArray.intersection(secondArray));
		
		
		//Print union
		System.out.println("Print union: ");
		System.out.println(firstArray.union(secondArray));
		System.out.println(list.union(list2));
		//Print difference
		System.out.println("Print difference: ");
		System.out.println(firstArray.difference(secondArray));
		//LinkedBag<String> testArray = (LinkedBag<String>)secondArray.intersection(firstArray);
		//testArray.toArray();
		//System.out.println(testArray);
		
		
	} // end main
	

   
   // Tests the method isEmpty.
   // Precondition: If the bag is empty, the parameter empty should be true;
   // otherwise, it should be false.
	private static void testIsEmpty(LinkedBag<String> bag, boolean empty)
   {
      System.out.print("\nTesting isEmpty with ");
      if (empty)
         System.out.println("an empty bag:");
      else
         System.out.println("a bag that is not empty:");
      
      System.out.print("isEmpty finds the bag ");
      if (empty && bag.isEmpty())
			System.out.println("empty: OK.");
		else if (empty)
			System.out.println("not empty, but it is: ERROR.");
		else if (!empty && bag.isEmpty())
			System.out.println("empty, but it is not empty: ERROR.");
		else
			System.out.println("not empty: OK.");      
	} // end testIsEmpty
   
   // Tests the method add.
   private static void testAdd(BagInterface<String> aBag, String[] content)
   {
      System.out.print("Adding the following strings to the bag: ");
      for (int index = 0; index < content.length; index++)
      {
         if (aBag.add(content[index]))
            System.out.print(content[index] + " ");
         else
            System.out.print("\nUnable to add " + content[index] +
                             " to the bag.");
      } // end for
      System.out.println();
      
      displayBag(aBag);
   } // end testAdd
   
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

} // end LinkedBagDemo1

/*
 Creating an empty bag.
 
 Testing isEmpty with an empty bag:
 isEmpty finds the bag empty: OK.
 The bag contains the following string(s):
 
 Adding the following strings to the bag: A D B A C A D
 The bag contains the following string(s):
 D A C A B D A
 
 Testing isEmpty with a bag that is not empty:
 isEmpty finds the bag not empty: OK.
 */
