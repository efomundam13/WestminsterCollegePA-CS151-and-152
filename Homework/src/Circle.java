
public class Circle {
										//Defined variables
	private final double PI = 3.14159;
	private double radius;
	private double center_1 = 0, center_2 = 0;
	private double x = 5, y = 5;
	private double dx = (x-center_1), dy = (y-center_2);
	
	public Circle() {
		radius = 0.0;
	}
								//sets radius
	public Circle(double r) {
		radius = r;
	}

	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
									//finds the area
    public double findArea() {
        return PI * radius * radius;
    }
    								//finds the diameter
    public double findDiameter() {
        return radius * 2;
    }
    									//finds the circumference
    public double findCircumference() {
        return 2 * PI * radius;
    }

    									//compares the circles to determine which is bigger
    public int compareTo(Circle c) {
    	if(this.getRadius() < c.getRadius())
    		return -1;
    	else if (this.getRadius() > c.getRadius())
    		return 1;
    	else
    		return 0;
    }

    							//determines if a point is in a circle
    public boolean isInside() {
    	if (dx + dy <= radius)  {
    		return true;
    	}
    	if (dx > radius) {
    		return false;
    	}
    	if (dy > radius) {
			return false;
    	}
		if (dx*dx + dy*dy <= radius*radius) {
			return true;
		}
		else
			return false;
    }
    }