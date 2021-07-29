
public class Resource {

	int counter;
	
	synchronized public int increment() {	//<---- added synchronized
		return counter++;
	}
	
}
