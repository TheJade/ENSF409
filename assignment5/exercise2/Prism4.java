

class Prism extends Rectangle{
	private Double height;
	
	public Prism(Double x, Double y, Double l, Double w, Double h, String  name, Colour colour)
	{
		super(x, y, l, w, name, colour);
		height = h;
	}

	//add clone method
	public Object clone() throws CloneNotSupportedException{
		Prism copy = (Prism)super.clone();
		return copy;
	}//

	//Implementing Resizable methods
	public void shrink(Double divisor)throws SizeFactorException{
		if(divisor < $LIMIT){
			throw new SizeFactorException();
		}
		width /= divisor;
		length = length/divisor;
		height /= divisor;
	}
	public void enlarge(Double multiplier)throws SizeFactorException{
		if(multiplier < $LIMIT){
			throw new SizeFactorException();
		}
		width *= multiplier;
		length = length*multiplier;
		height *= multiplier;
	}//
	
	public void  set_height(Double h)
	{
		height = h;
	}
	
	public Double  height() 
	{
		return height;
	}
	
	public Double  area()
	{
		return  2 * (length * width) + 2 * (height * length) + 2 * (height * width); 
	}
	
	public Double  perimeter()
	{
		return  width  * 2 + length * 2;
	}
	
	public Double  volume()
	{
		return  width  * length * height;
	}
	
	
	public String toString()
	{
		String s = super.toString()+ "\nHeight: " + height;
		return s;
	}
}