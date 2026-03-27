package apcs.unit09;

public class reversibleStackClient {
    public static void main(String[] args)
	{
		ReversibleStack<Integer> numbers = new ReversibleStack<Integer>();
		
		numbers.push(42);
		numbers.push(4);
		numbers.push(64);
		
		System.out.println(numbers);
		
		numbers.reverse();
		System.out.println(numbers);
	}


}
