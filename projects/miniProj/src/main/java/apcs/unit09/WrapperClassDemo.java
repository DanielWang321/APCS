package apcs.unit09;


public class WrapperClassDemo 
{
	public static void main(String[] args)
	{
		Integer intObj = new Integer(6);	//boxing
		int j = intObj.intValue();			//unboxing
		int i = intObj; //autounboxing 
		Integer intObj3 = intObj; //creates a shallow copy - Integers are immutable so whatever
        Integer intObj4 = j; //autoboxing
		
		System.out.println("Integer value: " + intObj);
		//calls toString() 
		
		Object obj = new Integer(6);		//legal - because there is an inheritance relationship between Integer and Object
                                                //Integer IS-A Object
                                                //limitation: obj only has access to Object class functions
                                                //obj is seen as an object during compile time, but an Integer during runtime
                                                //the only time we can see this in action is when calling overridden functions

		//int val = obj.intValue(); illegal because intvalue is not in the object class
		//Integer blah = new Object(); not legal integer is not a super class of object
		System.out.println("dfljd " + obj.toString());	
		Object o = new Object();
		System.out.println("dfljd " + o.toString());	
		
		Integer intObj2 = new Integer(6);	
		int k = intObj2.intValue();
	
		
		/*
		if(intObj.equals(intObj2))	//legal, intObj and intObj2 are both Integers, which have .equals() defined for them
			System.out.println("intObj equals intObj2");	
							
		if(intObj.intValue() == intObj2.intValue())	// legal, .intValue() returns an int, which can be compared with ==
			System.out.println("intObj == intObj2");
		
		if(k.equals(j))			//	illegal, k and j are ints and ints do not have .equals() defined for them		
			System.out.println("k equals j");
			
		if(intObj.equals(j))		// legal, j would be autoboxed which means it can be compared to intObj using .equals() **
			System.out.println("intObj equals j");
		
		if(intObj.intValue().compareTo(intObj2.intValue()) < 0)		//illegal, intValue() returns an int, and ints do not have .compareTo() defined for them
			System.out.println("intObj compared To intObj2 is < 0"); 
		
		if(intObj.compareTo(intObj2.intValue()) == 0)	//legal, intObj2.intValue() returns an int, which can be autoboxed to an Integer, which can be compared to intObj using .compareTo()
			System.out.println("intObj compared To intObj2 is == 0");
		
		if(intObj.compareTo(obj) < 0)	//illegal, compareTo is only defined for Integers, and obj is an Object, which does not have .compareTo() defined for it. 
                                        
			System.out.println("intObj compared to (Integer)object is < 0");
		
		if(intObj.equals(obj))	// legal, equal accepts an Object as a parameter
			System.out.println("intobj is equal to object");
		
		if(intObj.compareTo((Integer)obj) < 0)		//legal, you can compare Integers to Integers, obj is cast to an Integer, which can be compared to intObj using .compareTo()
                                                    //during runtime, obj is an Integer, so the cast is valid, but during compile time, obj is an Object, so the cast is necessary to avoid a compile time error
			System.out.println("intObj compared to (Integer)object is < 0");
		
		if(obj.equals(intObj))	// legal, equals accepts an Object as a parameter
                                //shows polymorphic behavior
                                
			System.out.println("something");
	
		if(obj.compareTo(intObj) < 0)	// illegal, obj is an Object, and compareTo is only defined for Integers
			System.out.println("object compared to intObj is < 0");
		
		if(((Integer)obj).compareTo(intObj) == 0)			//legal, obj is cast to an Integer, which can be compared to intObj using .compareTo()
			System.out.println("object compared to intObj is < 0");
		
		Object o = new Object();
		if(o.equals(intObj))		// legal, equals is defined for all objects, and intObj is an Object, which can be compared to o using .equals()
			System.out.println("");
		if(intObj.equals(o))		// legal, equals is defined for all objects, including Integers. It can accept any object.
			System.out.println("");
		*/

	}
}

