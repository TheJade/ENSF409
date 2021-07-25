
abstract class Shape implements Cloneable, Resizable, Accessible
{
	protected Point origin;
	protected Text name;
	abstract protected Double area();
	abstract protected Double perimeter();
	abstract protected Double volume();
	
	protected Shape(Double x_origin, Double y_origin, String name, Colour colour){
		
		origin = new Point(x_origin,y_origin, colour);
		this.name = new Text(name);
	}
	
	//add clone method
	public Object clone() throws CloneNotSupportedException{
		Shape copy = (Shape)super.clone();
		copy.origin = (Point)origin.clone();
		copy.name = (Text)name.clone();
		return copy;
	}//

	//Resizable methods
	abstract public void shrink(Double divisor)throws SizeFactorException;
	abstract public void enlarge(Double multiplier)throws SizeFactorException;

	//Implementing Accessible methods
	public String getName(){
		return name.getText();
	}
	public void setName(String newName){
		name.setText(newName);
	}

	protected Point  getOrigin()   
	{
		return origin;
	}
	
	
	protected  Double distance(   Shape  other)
	{
		return origin.distance(other.origin);
	}
	
	protected Double  distance(   Shape  a,    Shape  b)
	{
		return Point.distance(a.origin, b.origin);
	}
	
	
	protected void  move(Double dx, Double dy)
	{
		origin.setx(origin.getx()+dx);
		origin.sety(origin.gety()+dy);
	}
	
	@Override
	public String toString(){
		String s = "\nShape name: " + name + "\nOrigin: " + origin;
		return s;
	}

}

