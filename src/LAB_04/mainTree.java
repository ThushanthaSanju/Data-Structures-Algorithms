package LAB_04;

import java.util.Scanner;

public class mainTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insert(149, "Anusha");
		tree.insert(150, "dfadf");
		tree.insert(752, "Anadhfdusha");
		tree.insert(781, "bvbzb");
		tree.insert(786, "Anuvbfdasha");
		tree.insert(213, "Anuagafsha");
		tree.insert(7853, "Anbdafbdbbadfusha");
		tree.insert(120, "Anurtjfgsha");
		tree.insert(0454, "Anueeqhgfsha");
		
		tree.inOrder();
		System.out.println("----------------------------------------------------");
		tree.preOrder();
		System.out.println("----------------------------------------------------");
		tree.postOrder();
		System.out.println("----------------------------------------------------");
		
		System.out.println("Enter Employee number");
		Scanner scanner = new Scanner(System.in);
		int empID = scanner.nextInt();
		String nameOFemployee = tree.find(empID).name;
		System.out.println("Name of the EMployee is " +nameOFemployee);
		
		
		tree.deleteAll();
		System.out.println("Tree is deleted");
		tree.inOrder();


	}

}
