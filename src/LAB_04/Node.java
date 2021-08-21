package LAB_04;

public class Node {
	public int EmpNo;
	public String name;
	public Node leftchild;
	public Node rightchild;

	public void displayNode() {
		System.out.println("{ Empno " + EmpNo + ", Name }" + name );
	}

}
