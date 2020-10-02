public class stack{
	int max = 10;
	int top= -1;
	int size= 0;
	int [] array = new int[max];

	public void push(int e){
		if(size==0){
			array[0] = e;
			top = 0;
		}
		else{
			array[top+1] = e;
			top=top+1;
		}
		size = size+1;
		System.out.println(e);

	}
	public int pop(){
		if (size==0) {
			System.out.println("stack is empty:");
		}
		else{
			top=top-1;
			size=size-1;
		}
		return array[top+1];
	}
	public int top(){
		return array[top];
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		stack obj = new stack();
		obj.push(35);
		obj.push(78);
		obj.push(91);

		System.out.println("removed array is: "+obj.pop());
		System.out.println("array top is: "+obj.top());
		System.out.println("size of the array: "+obj.size());
		System.out.println(obj.isEmpty());

	}
}