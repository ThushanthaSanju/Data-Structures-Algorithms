package LAB_03_1;

public class LinkList {

	private Link first;

	public LinkList() {
		first= null;
	}



	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(String name, double average) {

		Link newLink = new Link(name, average); 
		newLink.next = first;
		first = newLink;

	}

	public Link deleteLink(String name) {

		Link current = first;
		Link previous = first;

		while(current.name != name) {
			if (current.next == null) {
				return null;
			}
			else {
				previous = current;
				current = current.next;
			}
		}

		if (current == first) {

			first = first.next;
		}else {
			previous.next = current.next;
		}
		return current;
	}

	public Link deleteFirst() {

		Link temp = first;
		first = first.next;
		return temp;

	}

	public void displayList() {

		System.out.println("List from the first Link to the Last Link");
		Link current = first;

		while(current != null) {

			current.displayDetails();
			current = current.next;
		}

	}
}
