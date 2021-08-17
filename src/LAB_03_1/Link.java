package LAB_03_1;



public class Link {
	
	public String name;
	public double average;
	public Link next;
	
	
	public Link(String name, double average) {
		super();
		this.name = name;
		this.average = average;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+ name + " " + average );
		
	}
}
