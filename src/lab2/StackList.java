package lab2;
import java.util.Scanner;

public class StackList<T> implements Stack <T> {
 
    private int size;
    private T[] SNode;
    private int top;
     
   
    
    
    @SuppressWarnings("unchecked")
    public StackList(int newSize) {
        this.size = newSize;
        this.SNode = (T[]) new Object[size];
        this.top = -1;
    }
 
    public void push(T entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full."));
            this.increaseStackCapacity();
        }
        this.SNode[++top] = entry;
    }
 
   
    @SuppressWarnings("unchecked")
	public T pop() {
        if(this.isStackEmpty()){
        }
        T entry = this.SNode[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    @SuppressWarnings("unchecked")
	public T peek() {
        return SNode[top];
    }
 
    private void increaseStackCapacity(){
         
    	
    	
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.size*2];
        for(int i=0;i<size;i++){
            newStack[i] = this.SNode[i];
        }
        this.SNode = newStack;
        this.size = this.size*2;
    }
     
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    public boolean isStackFull() {
        return (top == size - 1);
    }

	public static void menu() {
		System.out.println("Menu:\t 0. Exit" + "\n\t1. isEmpty" + "\n\t2. Push" + "\n\t3. Peek" + "\n\t4. Pop" + "\n\t5. Size "
				+ "\n\t6. Menu ");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StackList <String> sll2 = new StackList<String>(0);
		StackList<Integer> sll = new StackList<Integer>(0);

		Scanner sc = new Scanner(System.in);
		StackList.menu();

		while (true) {

			System.out.println("\n ENTER THE MENU NUMBER: ");
			try {
				int songolt = sc.nextInt();

				switch (songolt) {
				case 0: {
					System.out.print("Exit");
					sc.close();
					System.exit(1);
				}
					break;
				case 1: {
					if (sll.isStackEmpty())
						System.out.println("\t Stack is Empty");
					else
						System.out.println("\t Stack is not Empty" + sll.toString());
				}
					break;
				case 2: {
					try {
						System.out.print("Enter a value: ");
						int elements = sc.nextInt();
						sll.push(elements);
						System.out.println( elements + "\t : pushed to stack");
					} catch (Exception e) {
						System.out.println("Stack takes only int value!!");
					}
				}
					break;
				case 3: {
					if (sll.isStackEmpty()) {
						System.out.println("\t Stack is Empty");

					} else {
						System.out.println("\t Top element: " + sll.peek());

					}
				}
					break;
				case 4: {
					if (sll.isStackEmpty()) {
						System.out.println("\t Stack is Empty");

					} else {
						System.out.println("\t " + sll.pop() + " popped from stack");

					}

				}
					break;
				case 5: {
					System.out.println("\t Size of Stack:" );
				}
					break;
				case 6: {
					StackList.menu();
					break;
				}
				
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("Enter an int value! " + e);
			}
		}

	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
