package fr.iutvalence.info.dut.m3105.pattern.structural;

public class CopyOfStackProxyOnlyPop implements Stack<String>
{
	private Stack stack;

	public CopyOfStackProxyOnlyPop(Stack stack)
	{
		this.stack = stack;
	}

	@Override
	public void push(String elem)
	{
		System.out.println("You can't push");;
	}

	@Override
	public String pop()
	{
		return (String) stack.pop();
	}

	@Override
	public String peek()
	{
		return "You can't peek";
	}

	@Override
	public int size()
	{
		System.out.println("You can't get the size");
		return -1;
	}
}
