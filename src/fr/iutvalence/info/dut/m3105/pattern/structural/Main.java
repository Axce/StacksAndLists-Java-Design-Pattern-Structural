package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		Stack<String> stack = new ArrayStack<String>();
		new StackOfStringTester(stack).testStack();
		
		List<String> list = new ArrayList<String>();
		new StackOfStringTester(new ArrayListAdaptor(list)).testStack();
	}

}
