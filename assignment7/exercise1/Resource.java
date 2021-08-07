public class Resource {

	int counter;
	
	public int increment() {	//<---- added synchronized
			return counter++;
	}
	
}