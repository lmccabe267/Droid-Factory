
public class LinkedBagTest {
	
	public static void main(String[]args) {
		
		LinkedBag<String> first = new LinkedBag<String>();
		LinkedBag<String> second = new LinkedBag<String>();
		LinkedBag<String> third = new LinkedBag<String>();
		
		System.out.println(first.intersectionL(second, third));
		
	}
	
}
