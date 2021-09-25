
public interface BagInterface<T> {
		
		//A union is literally combining all elements in a list / collection. Do not count duplicates, make sure to remove them.
		public <T> ResizableArrayBag<T> union();
		
		//An intersection is a collection of elements that appear in both collections given.
		public <T> ResizableArrayBag<T> intersection();
		
		public static void difference() {
			
		}
		
		
}
