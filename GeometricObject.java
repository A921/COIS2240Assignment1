public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
	//Properties for the length of 3 sides
	private double side1, side2, side3;
	
	//Constructor with 3 arguments length of 3 sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}
	//Default no argument constructor for Triangle
	public Triangle() {
		//Default values for all sides is 1.0
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//Get area of triangle given 3 sides
	public double getArea() {
		double semiPerimiter = (side1+side2+side3)/2;
		double area;
		//Calculate area given semiPerimeter
		area = Math.sqrt(semiPerimiter*(semiPerimiter - side1)*(semiPerimiter - side2)*(semiPerimiter - side3));
		
		return area;
	}
	public double getPerimeter() {
		//Returns the sum of all 3 sides
		return (side1+side2+side3)	;
	}
	
	@Override
	public String toString () {
		//Returns Triangle information + toString version of its superclass GeomtricObject
		return ("Triangle: Side 1 =" + side1 + ", Side 2 = " + side2 + ", Side 3 = "+ side3
				+ " " + super.toString());
	}
	
	
}
