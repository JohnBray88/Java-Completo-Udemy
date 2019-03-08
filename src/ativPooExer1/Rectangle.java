package ativPooExer1;

public class Rectangle {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return (width * height);
	}
	public double perimeter() {
		return (2*width) + (2*height);
	}
	public double diagonal() {
		return (Math.pow(width, 2)+Math.pow(width, 2));
	}
	public String toString() {
		return "Area = "+ area()
		+ "\nPerimeter = "+ perimeter()
		+ "\nDiagonal = "+ diagonal();
	}
}
