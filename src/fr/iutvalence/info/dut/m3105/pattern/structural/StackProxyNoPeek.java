package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackProxyNoPeek implements Stack<String>
{
	private Stack stack;

	public StackProxyNoPeek(Stack stack)
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
		return this.stack.size();
	}
}
