package assignment3;

public class Triangle {
	double a,b,c;
	double area;
	double peri;
	
	public Triangle(double a,double b,double c) {
		double s=(a+b+c)/2;
		 area=(s*(s-a)*(s-b)*(s-c))*0.5;
	
	}
	public Triangle(int a,int b,int c) {
		peri=a+b+c;
	}
	
	public void display() {
		System.out.println("Area :"+area);
		System.out.println("Peri :"+peri);

	}
			
	
	public static void main(String[] args) {
		Triangle t1=new Triangle(3, 4, 5);
		Triangle t2=new Triangle(3, 4, 5);
		
		t1.display();
		t2.display();
	}


}
