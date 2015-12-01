package fr.iutvalence.info.dut.m3105.pattern.structural;

public class CopyOfStackProxyOnlyPush implements Stack<String>
{
	private Stack stack;

	public CopyOfStackProxyOnlyPush(Stack stack)
	{
		this.stack = stack;
	}

	@Override
	public void push(String elem)
	{
		stack.push(elem);
	}

	@Override
	public String pop()
	{
		return "You can't pop";
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
