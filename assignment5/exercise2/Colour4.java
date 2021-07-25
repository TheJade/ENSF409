

class Colour implements Cloneable
{
    private String colour;
    
	public Colour(String s) {
		colour = new String(s);
	}
	
	//add clone method
	public Object clone() throws CloneNotSupportedException{
		Colour copy = (Colour)super.clone();
		return copy;
	}// 

    public void setColour(String newColour){
    	colour = newColour;
    }
    
	@Override
	public String toString(){
		return colour;
	}

}
