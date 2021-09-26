
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list / collection. Do not count duplicates, make sure to remove them.
		public ResizableArrayBag<T> union();
		
		//An intersection is a collection of elements that appear in both collections given.
		public ResizableArrayBag<T> intersection();
		
		public ResizableArrayBag<T> difference();
		
		
}
