package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayListAdaptor implements Stack<String>
{
	
	private List list;
	private int head;
	
	public ArrayListAdaptor(List list)
	{
		this.list = list;
		this.head = 0;
	}
	
	@Override
	public void push(String elem)
	{
		this.list.add(head, elem);
		this.head++;
	}

	@Override
	public String pop()
	{
		if(head == 0)
			return null;
		head --;
		return (String) this.list.remove(head);
	}

	@Override
	public String peek()
	{
		return (String) this.list.get(head-1);
	}

	@Override
	public int size()
	{
		return this.list.size();
	}


}
