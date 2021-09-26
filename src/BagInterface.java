
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list
		public BagInterface<T> union(BagInterface<T> bag);
		
		//An intersection is a collection of elements that appear in both collections given.
		public BagInterface<T> intersection(BagInterface<T> bag);
		
		public BagInterface<T> difference(BagInterface<T> bag);
		
		public boolean add(T newEntry);
		
		public T[] toArray();
		
}
