package LAB_03;

public class LinkMain {

	public static void main(String[] args) {
		
		LINK L1 = new LINK("Nipuna", 53.03);
		LINK L2 = new LINK("Aravinda", 73.03);
		LINK L3 = new LINK("Prashani", 93.03);
		
		
		L1.next = L2;
		L2.next = L3;
		L3.next = null;
		
		L1.displayDetails(); 
		L1.next.displayDetails(); 
		L1.next.next.displayDetails(); 
		

	}

}
