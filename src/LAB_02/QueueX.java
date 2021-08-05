package LAB_02;

public class QueueX {
	
	private int maxSize;
	private int[] QueueArray;
	private int front,rear;
	private int NoOfItems;
	
	
	public QueueX(int maxSize) {
	
		this.maxSize = maxSize;
		QueueArray = new int [maxSize];
		this.front = 0;
		this.rear = -1;
		NoOfItems = 0;
	}
	
	public void insert(int j) {
		
		if (rear == maxSize -1) {
			System.out.println("Queue is full");
		}else {
			QueueArray[++rear]=j;
			NoOfItems++;
		}
	}
	
	public int remove() {
		if (NoOfItems == 0) {
			System.out.println("Empty queue");
			return -9;
		} 
		else{
			NoOfItems--;
			return QueueArray[front++];
		}
	}

	public boolean isEmpty() {
		return (NoOfItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}
}








