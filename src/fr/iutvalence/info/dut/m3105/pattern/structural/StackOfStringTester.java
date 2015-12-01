package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester
{
	private Stack<String> stack;
	
	public StackOfStringTester(Stack<String> stack)
	{
		this.stack = stack;
	}

	public void testStack()
	{
		System.out.println("Size = "+this.stack.size());
		
		this.stack.push("a");
		System.out.println(" \"a\" Pushed");
		System.out.println("Size = "+this.stack.size());
		
		this.stack.push("b");
		System.out.println(" \"b\" Pushed");
		System.out.println("Size = "+this.stack.size());
		
		System.out.println("Peek = "+this.stack.peek());
		System.out.println("Size = "+this.stack.size());
		
		System.out.println("Pop = "+this.stack.pop());
		System.out.println("Size = "+this.stack.size());
		
		System.out.println("Pop = "+this.stack.pop());
		System.out.println("Size = "+this.stack.size());	
	}
}
