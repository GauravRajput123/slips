// Java program to illustrate
// working of toString() method

// Main class
class S6Q1{

	// Member attributes of this class
	String Empname, Desig;
	int Empid, Empsal;
	
	// Constructor of this class
	S6Q1(int id, String nm, String desg, int sal)
	{
		// This keyword refers to current instance itself
		this.Empid= id;
		this.Empname=nm;
		this.Desig=desg;
		this.Empsal=sal;
	}

	// Method 1
	// Creating our own toString() method
	public String toString()
	{
		return Empid + " " + Empname + " " + Desig + " "
			+ Empsal;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		S6Q1 obj = new S6Q1(123, "ABC", "AABBCC",1234);

		System.out.println(obj.toString());
	}
}
