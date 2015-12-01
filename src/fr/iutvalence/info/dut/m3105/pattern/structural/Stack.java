package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface Stack<T>
{
	public void push(T elem);
	
	public T pop();
	
	public T peek();
	
	public int size();
	
}
