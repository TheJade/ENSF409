
abstract class Shape implements Comparable <Shape>{
	protected Point origin;
	protected Text name;
	abstract protected Double area();
	abstract protected Double perimeter();
	abstract protected Double volume();

	
	protected Shape(Double x_origin, Double y_origin, String name, Colour colour){
		
		origin = new Point(x_origin,y_origin, colour);
		this.name = new Text(name);
	}

	//	public int compareTo(Shape the_shape){	
	//		if(the_shape instanceof Circle) {	// always true for some reason
	//			return 1; 
	//		} 
	//		else if(the_shape instanceof Rectangle)  {	//can't get the order right for some reason
	//			return 3;  
	//		}
	//		else  {
	//			return 2;  
	//		}
	//			
	//	}  

	// public int compareTo(Shape the_shape){
	// 	if(the_shape.getName().charAt(0) == "C".charAt(0)) {	// always true for some reason
	// 		return 1; 
	// 	} 
	// 	else if(the_shape.getName().charAt(0) == "P".charAt(0))  {	//can't get the order right for some reason
	// 		return 3;  
	// 	}
	// 	else  {
	// 		return 2;  
	// 	}
	// }

	public int compareTo(Shape the_shape){
		if(the_shape.getName().charAt(0) == "C".charAt(0)) {	// always true for some reason
			return 1; 
		} 
		else if(the_shape.getName().charAt(0) == "R".charAt(0))  {	//can't get the order right for some reason
			return -1;  
		}
		else  {
			return 1;  
		}
	}
			
	
	//	public int compareTo(Shape the_shape){
//	
	//		//System.out.print("!!!!!!!! " + the_shape.getName());
	//		//System.out.println(the_shape.getName().charAt(0) == "C".charAt(0));
//	
	//		if(the_shape.getName() == "C1") { return 0;} 
	//		else if(the_shape.getName() == "C2")  { return 1; }
	//		else if(the_shape.getName() == "P1")  { return 2; }
	//		else if(the_shape.getName() == "P2")  { return 3; }
	//		else if(the_shape.getName() == "R1")  { return 4; }
	//		else  {	return 5; }
	//			
	//	} 


	protected Point  getOrigin()   {
		return origin;
	}
	
	protected String  getName()   {
		return name.getText();
	}
	 
	
	protected  Double distance(   Shape  other){
		return origin.distance(other.origin);
	}
	
	protected Double  distance(Shape a, Shape  b){
		return Point.distance(a.origin, b.origin);
	}
	
	
	protected void  move(Double dx, Double dy){
		origin.setx(origin.getx()+dx);
		origin.sety(origin.gety()+dy);
	}
	
	@Override
	public String toString(){
		String s = "\nShape name: " + name + "\nOrigin: " + origin;
		return s;
	}

}

