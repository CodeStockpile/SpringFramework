package grabage_collector;

public class IslandOfIsolation {
	
	
	// Java Program to Illustrate Island of Isolation


		// Main class
		private IslandOfIsolation i;

		// Method 1
		// Main driver method
		public static void main(String[] args)
		{
			

			// Creating object of class inside main() method
			IslandOfIsolation t1 = new IslandOfIsolation();
			IslandOfIsolation t2 = new IslandOfIsolation();

			// Object of t1 gets a copy of t2
			t1.i = t2;

			// Object of t2 gets a copy of t1
			t2.i = t1;

			// Till now no object eligible
			// for garbage collection
			t1 = null;

			// Now two objects are eligible for
			// garbage collection
			t2 = null;

			// Calling garbage collector
			System.gc();
		}

		// Method 2
		// overriding finalize() Method
		@Override 
		protected void finalize() throws Throwable{
			// Print statement
			System.out.println("Finalize method called");
		}
	}



