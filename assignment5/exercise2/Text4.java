
class Text implements Cloneable, Resizable
{
	
	private final Double DEFAULT_SIZE = 10.0;
	
    private Colour colour;
    private Double fontSize;
    
    private String text;


	public Text(String text) {
       this.text = text;
       fontSize = DEFAULT_SIZE;
	}

	//add clone method
	public Object clone() throws CloneNotSupportedException{
		Text copy = (Text)super.clone();
		if(colour!=null)
		    copy.colour = (Colour)colour.clone();
		return copy;
	}//

	//Implementing Resizable methods
	public void shrink(Double divisor)throws SizeFactorException{
		if(divisor < $LIMIT){
			throw new SizeFactorException();
		}
		fontSize /= divisor;
	}
	public void enlarge(Double multiplier)throws SizeFactorException{
		if(multiplier < $LIMIT){
			throw new SizeFactorException();
		}
		fontSize *= multiplier;
	}//

	//Implementing Accessible methods
	public String getName(){
		return text;
	}
	public void setName(String newName){
		setText(newName);
	}

	public Double getFontSize(){
		return fontSize;
	}
	
	public void setColour(String s){
		colour = new Colour(s);
	}
	
	public void setText(String newText){
		text = newText;
	}
	
	public String getText(){
		return text ;
	}
	
	@Override
	public String toString(){
		return (text);
	}

       
}
