package LAB_03_1;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList linkList = new LinkList(); 
		
		
		linkList.insertFirst("Nisha", 59.00);
		linkList.insertFirst("Ravi", 89.00);
		linkList.insertFirst("Sanju", 49.00);

		
//		linkList.deleteFirst();
		linkList.displayList();
		
		linkList.deleteLink("Nisha");
		linkList.displayList();
	}

}
