package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<String>
{
	private static final int CAPACITY = 10;
	
	private String elements[] = new String[CAPACITY];
	private int head;
	
	
	public ArrayStack()
	{
		this.head = 0;
	}

	@Override
	public void push(String elem)
	{
		this.elements[head] = elem;
		this.head ++;
	}
	
	@Override
	public String pop()
	{
		if( head ==0)
				return "";
		this.head --;
		return this.elements[head];
	}
	
	@Override
	public String peek()
	{
		return this.elements[head-1];
	}
	
	@Override
	public int size()
	{
		return this.head;
	}
	
}
