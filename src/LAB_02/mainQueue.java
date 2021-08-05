package LAB_02;

import java.util.Scanner;

public class mainQueue {

	public static void main(String[] args) {
			
		QueueX mainQueueX = new QueueX(5);
		
		Scanner scanner = new Scanner(System.in); 
		
		int inputStr;
		
		for (int i =1; i <=5 ; i++) {
			System.out.println("Enter the transaction ID " +i+ " : ");
			inputStr = scanner.nextInt();
			mainQueueX.insert(inputStr);
		}
		scanner.close();

		QueueX evenQueueX = new QueueX(5);
		QueueX oddQueueX = new QueueX(5);
		
		int value;
		
		while(!mainQueueX.isEmpty()) {
			value = mainQueueX.remove();
			if (value % 2 == 0) {
				evenQueueX.insert(value);
			}else {
				oddQueueX.insert(value);
			}
		}
		
		System.out.println("PC-1");
		while(!evenQueueX.isEmpty()) {
			System.out.println("Transaction " + evenQueueX.remove());
		}
		
		System.out.println("PC-2");
		while(!oddQueueX.isEmpty()) {
			System.out.println("Transaction " + oddQueueX.remove());
		}
	}

}
