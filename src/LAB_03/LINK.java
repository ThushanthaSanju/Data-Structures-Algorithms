package LAB_03;

public class LINK {
	public String name;
	public double average;
	public LINK next;
	
	
	public LINK(String name, double average) {
		super();
		this.name = name;
		this.average = average;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+ name + " " + average );
		
	}

	
	
}
