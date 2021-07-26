import java.util.Random;
/**
 * Provides data fields and methods to create a Java data-type, 
 * representing a random integer generator.
 */
class RandomGenerator {

    /**
     * Creates a random number ranging between lo and hi,  
     * @param lo lower limit
     * @param hi upper limit
     * @return randomly generated integer
     */
	int discrete(int lo, int hi)
	{
		if(lo >= hi){
			System.out.println("Error discrete, lo >= hi");
			System.exit(0);
		}
		
		Random r = new Random();
		int d = r.nextInt(hi - lo + 1) + lo;
		return d;
	}
	
}
