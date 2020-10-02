public class Ques1{
	int limit_size=10;
	int top= -1;
	int size=0;
	int [] stackArray=new int[limit_size];

	public boolean isEmpty(){
		if (size==0){
			return true;
		}
		else{
			return false;
		}
	}
	public int top(){
		if (top==-1){
			return 0;
		}
			return stackArray[top];
	}
	public int size(){
		return size;
	}
	public int pop(){
		if (size==0){
			System.out.println("The stack is empty");
		}
		else{
			top=stackArray[top-1];
			size=size-1;
		}
		return stackArray[top+1];
	}
	public void push(int e){
		if (size==0){
			stackArray[0]=e;
			top=0;

		}
		else{
			stackArray[top+1]=e;
			top++;
		}
		size=size=1;
	}
	public static void main (String []args)
	{
		stack obj = new stack();

		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println("size:" +obj.size());
		System.out.println(obj.isEmpty());
	}
}
