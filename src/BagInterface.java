
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list / collection. Do not count duplicates, make sure to remove them.
		public ResizableArrayBag<T> union(ResizableArrayBag<T> first, ResizableArrayBag<T> second);
		
		//An intersection is a collection of elements that appear in both collections given.
		public ResizableArrayBag<T> intersection(ResizableArrayBag<T> first, ResizableArrayBag<T> second);
		
		public ResizableArrayBag<T> difference(ResizableArrayBag<T> first, ResizableArrayBag<T> second);
		
		
}
