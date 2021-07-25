public class SizeFactorException extends Exception{
    public SizeFactorException(){
        super("Error: Size factor is less than the limit of 1.0.");
    }
}
