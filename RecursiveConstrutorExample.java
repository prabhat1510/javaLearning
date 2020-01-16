/**
 * 
 */
package javaLearning;

/**
 * @author t-Prabhat
 *
 */
public class RecursiveConstrutorExample {
	
	private  int id;
	private  String name;
	private  double weight;
	private  double height;
	/**
	 * @param id
	 * @param name
	 * @param weight
	 * @param height
	 */
	public RecursiveConstrutorExample(int id, String name, double weight, double height) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public RecursiveConstrutorExample(int id, String name, double weight) {
		/**
		this.id = id;
		this.name = name;
		this.weight = weight;
		**/
		this(id,name,weight,0);
	}
	
	/**
	 * @param id
	 * @param name
	 */
	public RecursiveConstrutorExample(int id, String name) {
		/*this.id = id;
		this.name = name; */
		this(id,name,0,0);
	}

	public static void main(String [] args){
		RecursiveConstrutorExample rce = new RecursiveConstrutorExample(15, "Cognizant", 75.50);
	}
}
