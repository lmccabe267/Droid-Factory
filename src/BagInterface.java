
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list / collection. Do not count duplicates, make sure to remove them.
		public ResizableArrayBag<T> union();
		
		//An intersection is a collection of elements that appear in both collections given.
		public ResizableArrayBag<T> intersection(ResizableArrayBag<T> first, ResizableArrayBag<T> second);
		
		public ResizableArrayBag<T> difference();
		
		public LinkedBag<T> unionL();
		
		//An intersection is a collection of elements that appear in both collections given.
		public LinkedBag<T> intersectionL(LinkedBag<T> first, LinkedBag<T> second);
		
		public LinkedBag<T> differenceL();
		
		
}
