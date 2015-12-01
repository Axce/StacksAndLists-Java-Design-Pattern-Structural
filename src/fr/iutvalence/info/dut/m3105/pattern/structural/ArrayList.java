package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<T> implements List<T>
{
	private static final int CAPACITY = 10;
	
	private T elements[] = (T[]) new Object[CAPACITY];
	
	public ArrayList()
	{
	}

	@Override
	public void add(int index, T elem)
	{
		this.elements[index]=elem;
	}
	
	@Override
	public T remove(int index)
	{
		T elem = this.elements[index];
		this.elements[index]=null;
		return elem;
	}
	
	@Override
	public T get(int index)
	{
		return this.elements[index];
	}
	
	@Override
	public int size()
	{
		int size =10;
		for( T element : elements )
		{	
			if(element == null)
				size--;
		}
		return size;
	}
	
}
