import java.util.ArrayList;

/*
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    INCOMPLETE DEFINITION; includes definitions for the methods add,
    toArray, isEmpty, and getCurrentSize.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public final class LinkedBag<T> implements BagInterface<T>
{
    private Node firstNode;       // Reference to first node
    private int numberOfEntries;

    public LinkedBag()
    {
        firstNode = null;
      numberOfEntries = 0;
    } // end default constructor

    /* Adds a new entry to this bag.
        @param newEntry  The object to be added as a new entry.
        @return  True. */
    public boolean add(T newEntry) // OutOfMemoryError possible
    {
      // Add to beginning of chain:
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;  // Make new node reference rest of chain
                                 // (firstNode is null if chain is empty)
      firstNode = newNode;       // New node is at beginning of chain
        numberOfEntries++;

        return true;
    } // end add

    /* Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
    public T[] toArray()
    {
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast

      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      } // end while

      return result;
      // Note: The body of this method could consist of one return statement,
      // if you call Arrays.copyOf
    } // end toArray

    /* Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */
    public boolean isEmpty()
    {
        return numberOfEntries == 0;
    } // end isEmpty

    /* Gets the number of entries currently in this bag.
       @return  The integer number of entries currently in the bag. */
    public int getCurrentSize()
    {
        return numberOfEntries;
    } // end getCurrentSize

// STUBS:

    /* Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
    public T remove()
   {

      return null; // STUB
   } // end remove

    /* Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false otherwise. */
   public boolean remove(T anEntry)
   {
      return false; // STUB
   } // end remove

    /* Removes all entries from this bag. */
    public void clear()
   {
      // STUB
   } // end clear

    /* Counts the number of times a given entry appears in this bag.
         @param anEntry  The entry to be counted.
         @return  The number of times anEntry appears in the bag. */
    public int getFrequencyOf(T anEntry)
   {
      return 0; // STUB
   } // end getFrequencyOf

    /* Tests whether this bag contains a given entry.
         @param anEntry  The entry to locate.
         @return  True if the bag contains anEntry, or false otherwise. */
    public boolean contains(T anEntry)
   {
    	boolean contains = false;
    	T[] temp = toArray();
    	for(int i = 0; i < temp.length; i++) {
    		if(temp[i] == anEntry) {
    			contains = true;
    		}
    	}
      return contains; // STUB
   } // end contains

    private class Node
    {
       private T data;    // Entry in bag
       private Node next; // Link to next node

       private Node(T dataPortion)
       {
          this(dataPortion, null);
       } // end constructor

       private Node(T dataPortion, Node nextNode)
       {
          data = dataPortion;
          next = nextNode;
       } // end constructor

       private T getData()
       {
          return data;
       } // end getData

       private void setData(T newData)
       {
          data = newData;
       } // end setData

       private Node getNextNode()
       {
          return next;
       } // end getNextNode

       private void setNextNode(Node nextNode)
       {
          next = nextNode;
       } // end setNextNode
    } // end Node
    
    
    
/*
 * Iterates through both the LinkedBag<T> calling the method as well as the LinkedBag<T> passed in and combines the items
 * 	in both of the bags into a new LinkedBag<T> which is returned
 * 
 * @param bag must be a LinkedBag<T> of the same type as the LinkedBag<T> calling the method
 * @return the LinkedBag<T> which is a result of the combination of items contained in the LinkedBag<T> calling the method
 * 	as well as the LinkedBag<T> passed in
 */
@Override
public BagInterface<T> union(BagInterface<T> bag) {
	LinkedBag<T> everything = new LinkedBag<T>();
	for(T item: toArray()) {
		everything.add(item);
	}
	for(T item: ((LinkedBag<T>)bag).toArray()) {
		everything.add(item);
	}
	return everything;
}

/*
 *  Iterates through both the LinkedBag<T> calling the method as well as the LinkedBag<T> passed in
 *   then returns a LinkedBag<T> which contains the common items in each bag
 *   
 *   @param bag must be a LinkedBag<T> of the same type as the LinkedBag<T> calling the method
 *   @return the LinkedBag<T> which is a result of finding the common items between the two bags
 */
@Override
public BagInterface<T> intersection(BagInterface<T> bag) {
	LinkedBag<T> intersection = new LinkedBag<T>();
	ArrayList<T> temp = new ArrayList<T>();
	
	for(T item: bag.toArray()) {
		temp.add(item);
	}
	
	for(T item: toArray()) {
		if(temp.contains(item)) {
			intersection.add(item);
			temp.remove(item);
		}
		
	}
	
	return intersection;
	
}

/*
 * Iterates through the LinkedBag<T> calling the method as well as the LinkedBag<T> passed in
 * it then returns a LinkedBag<T> which is a result of finding the uncommon items between the two bags
 * 
 * @param bag must be a LinkedBag<T> of the same type as the LinkedBag<T> calling the method
 * @return the LinkedBag<T> which is a result of finding the uncommon items between the two bags
 */

@Override
public BagInterface<T> difference(BagInterface<T> bag) {
	LinkedBag<T> result = new LinkedBag<>();
	T[] union = union(bag).toArray();
	T[] intersection = intersection(bag).toArray();
	ArrayList<T> difference = new ArrayList<T>();
	
	for(T item: union) {
		difference.add(item);
	}
	
	for(T item: intersection) {
		difference.remove(item);
		difference.remove(item);
	}
	
	for(T item: difference) {
		result.add(item);
	}
	
	return result;
}
} // end LinkedBag