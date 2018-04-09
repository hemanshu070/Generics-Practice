package stack_impl_generics;

import java.util.NoSuchElementException;

public class First_stack<V> {
	private V stack[];
	private int n,top,len,size;
	
	public First_stack(int n) {
		this.size = n;
		this.len = 0;
		this.stack =(V[]) new Object[n];
		this. top = -1;
	}
	
	public void push(V value) {
		if(top+1 >= size) {
			throw new IndexOutOfBoundsException("stack is full");
		}
		if(top+1 < size) {
			stack[++top] = value;
			len++;
		}
	}
	public boolean isEmpty() {

		return top == -1;
		
	}
	public V pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("underflow stack");
		}
		size--;
		return stack[top--];
	}
	public void print() {
		System.out.println("Top of the stack  " + stack[top]);
		System.out.println("sIZE OF THE STACK  " + size);
		System.out.println("Elements of staCK");
		for(V i:stack) {
			System.out.println(i);
		}
		
	}
}
