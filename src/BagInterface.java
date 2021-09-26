
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list
		public BagInterface<T> union(BagInterface<T> first, BagInterface<T> second);
		
		//An intersection is a collection of elements that appear in both collections given.
		public BagInterface<T> intersection(BagInterface<T> first, BagInterface<T> second);
		
		public BagInterface<T> difference(BagInterface<T> first, BagInterface<T> second);
		
		public boolean add(T newEntry);

		public int getIndexOf(T anEntry);
		
		
		
}
