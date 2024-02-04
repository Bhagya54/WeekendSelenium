package day5;

public class ArrayDemo {

	//Array -- passing values of same datatype
	//Class based -- Object 
	
	/*Array
	 * 1. declaration
	 * 2. instanstiation -- Object creation
	 * 3. initialization
	 * 
	 * 
	 * Rules:
	 * 1.Mandatory -- size
	 * 2.Default value gets initialized
	 * 3.Indexing starts from zero
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int[] id; // declaration
		id = new int[5];//instantiation
		
		id[0] = 12;
		id[1] = 23;
		id[3] = 34;
		id[4] = 67;
		System.out.println("Size of an array: " +id.length);
	
		System.out.println("Retrieving values of an array");
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]);
		}
		
		
		String[] str = {"abc","def","ghi"};
		
		
		//A1: 1 to 10
		//A2:10 to 100
		
		//5 --- 0 1 2 3 4
		
	}

}
