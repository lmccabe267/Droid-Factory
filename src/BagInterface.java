
public interface BagInterface<T> {
		
		/*
		 * Returns a BagInterface<T> that contains the union of two separate BagInterface<T>
		 * the bag argument must be a BagInterface<T> of the same type as the bag calling the method
		 * 
		 * @param bag the BagInterface<T> that is to be combined with the BagInterface<T> calling the method
		 * @return	A BagInterface<T> that contains the contents of the bag calling the method and the bag passed in
		 */
		public BagInterface<T> union(BagInterface<T> bag);
		
		/*
		 * Returns a BagInterface<T> which contains the common entries between the bag calling the method and the bag passed in
		 * the bag parameter must be a BagInterface<T> of the same type as the bag calling the method
		 * 
		 * @param bag the BagInterface<T> that is to be compared to the bag calling the method in order to find common entries
		 * @return A BagInterface<T> which contains the common entries in each bag
		 */
		public BagInterface<T> intersection(BagInterface<T> bag);
		
		/*
		 * Returns a BagInterface<T> which contains uncommon entries within the bag calling the method and the bag passed in
		 * the bag parameter must be a BagInterface<T> of the same type as the bag calling the mthod
		 * 
		 * @param bag the BagInterface<T> that is to be compared to the bag calling the method to find uncommon entries
		 * @return A BagInterface<T> which contains uncommon entries between the two bags
		 */
		public BagInterface<T> difference(BagInterface<T> bag);
		
		public boolean add(T newEntry);
		
		public T[] toArray();
		
}
