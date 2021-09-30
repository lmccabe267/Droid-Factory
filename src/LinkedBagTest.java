public class LinkedBagTest {
    /*
     * Main is the runner method, tests all code.
     * 
     */
    public static void main(String[] args) 
    {
    LinkedBag<String> strBag1 = new LinkedBag<>();
    LinkedBag<String> strBag2 = new LinkedBag<>();

    //adding contents to strBag1
    strBag1.add("a");
    strBag1.add("b");
    strBag1.add("c");
    strBag1.add("d");
    strBag1.add("e");
    //strBag2
    strBag2.add("c");
    strBag2.add("d");
    strBag2.add("e");
    strBag2.add("f");
    strBag2.add("g");

    //ResizableArrayBag<String> fourthArray = (ResizableArrayBag<String>)secondArray.union(thirdArray);
    //System.out.println(fourthArray.toString());

    displayBag(strBag1);
    displayBag(strBag2);
    LinkedBag<String> strBag3 = (LinkedBag<String>)strBag1.union(strBag2);
    System.out.println("Bag after union");
    displayBag(strBag3);
    LinkedBag<String> strBag4 = (LinkedBag<String>)strBag1.intersection(strBag2);
    System.out.println("Bag after intersection");
    displayBag(strBag4);
    LinkedBag<String> strBag5 = (LinkedBag<String>)strBag1.difference(strBag2);
    System.out.println("Bag after difference");
    displayBag(strBag5);

    //printing that we are done to terminal
    System.out.println("Done printing main 3 methods.");
    System.out.println();

    } // end main


  /*
   * test method toArray() to display the bag
   * @param aBag
   */
   private static void displayBag(BagInterface<String> aBag)
   {
      System.out.println("Bag contains:");
      Object[] bagArray = aBag.toArray();
      System.out.print("[");
      for (int index = 0; index < bagArray.length; index++)
      {

         System.out.print(bagArray[index] + ", ");

      } // end for
      System.out.print("]");
      System.out.println();
   } // end displayBag
   
} // end LinkedBagTest