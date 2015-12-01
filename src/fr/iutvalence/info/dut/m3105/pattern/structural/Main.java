package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		Stack<String> stack = new ArrayStack<String>();
		new StackOfStringTester(stack).testStack();
		
		System.out.println("\n\n");
		List<String> list = new ArrayList<String>();
		new StackOfStringTester(new ArrayListAdaptor(list)).testStack();
		
		System.out.println("\n\n");
		List<String> list2 = new ArrayList<String>();
		new StackOfStringTester(new StackProxyNoPeek(new ArrayListAdaptor(list2))).testStack();
		
	}

}
