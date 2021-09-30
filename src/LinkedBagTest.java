
public class LinkedBagTest {
	/**
	 * Main is the runner method, tests all code.
	 * 
	 */
	public static void main(String[] args) 
	{
	LinkedBag<String> strBag1 = new LinkedBag<>();
	LinkedBag<String> strBag2 = new LinkedBag<>();
	
	strBag1.add("a");
	strBag1.add("b");
	strBag1.add("c");
	strBag2.add("c");
	strBag2.add("d");
	strBag2.add("e");
	
	LinkedBag<String> strBag3 = (LinkedBag<String>)strBag1.union(strBag2);
	displayBag(strBag3);
	LinkedBag<String> strBag4 = (LinkedBag<String>)strBag1.intersection(strBag2);
	displayBag(strBag4);
	LinkedBag<String> strBag5 = (LinkedBag<String>)strBag1.difference(strBag2);
	displayBag(strBag5);
      System.out.println("Creating an empty bag.");
      LinkedBag<String> aBag = new LinkedBag<>();
      testIsEmpty(aBag, true);
		displayBag(aBag);
      
      String[] contentsOfBag = {"A", "D", "B", "A", "C", "A", "D"};
		testAdd(aBag, contentsOfBag);
		testIsEmpty(aBag, false);
	} // end main
   
   /** 
    *Tests the method isEmpty.
    *Precondition: If the bag is empty, the parameter empty should be true;
    *otherwise, it should be false.
    *@param bag of type LinkedBag and boolean empty
    *@return Prints if bag is empty true or full false
    */
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
   
   /**
    * Test method add to see if working correctly
    * @param aBag
    * @param content
    */
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
   
  /**
   * test method toArray() to display the bag
   * @param aBag
   */
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
   /**
    * Tests if bag is empty
    * @param <T>
    * @param bag
    * @return false
    */
   	public static <T> boolean isEmpty(LinkedBag<T> bag) {
   		if (isEmpty(bag)) {
   			return true;
   		}
   		return false;
   	}

} // end LinkedBagDemo1


