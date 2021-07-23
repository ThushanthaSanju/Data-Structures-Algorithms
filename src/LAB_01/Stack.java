package LAB_01;

public class Stack {
   private int maxSize;
   private int top;
   private double[] StackArray;
   
   
public Stack(int max) {
	
	this.maxSize = max;
	top = -1;
	StackArray = new double[maxSize];
}

public boolean isEmpty() {
	
	return (top==-1);

}
public boolean isFull() {

return (top==(maxSize-1));

}

public void Push(double val) {
	if(isFull()) {
		System.out.println("Stack is full");
	}else {
		StackArray[++top] = val;
	}
}

public double Pop() {
	if(isEmpty()) {
		return -99;
	}else {
		return StackArray[top--];
	}
}

public double Peek() {
		if(isEmpty()) {
			return -99;
		}else {
			return StackArray[top];
		}
}


}
