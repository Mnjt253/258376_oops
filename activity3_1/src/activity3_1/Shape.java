package activity3_1;

abstract class Shape {
	int value;
	
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	abstract public void calculateArea(int value);
	{
		double area= 3.14*value*value;
	}
	class circle extends Shape
	{
		
	}
	class square extends Shape
	{
		
	}
	public static void main(string[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the shape");
		circle c=new circle();
		c.calculateArea(int value);
		System.out.println("area of circle:" +c.area);
				
	}
}


