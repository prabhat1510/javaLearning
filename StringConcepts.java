/**
 * 
 */
package javaLearning;

/**
 * @author t-Prabhat
 *
 */
public class StringConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// In below case s1 is not equal to t1 , hashcode is different
		/*String s1 = "Hello";
			String t1 = "hello";
		*/
		
		// In below case s1 is equal to t1 , hashcode is same
		//String s1 = "Hello";
		String s1 = new String("Hello");
		//String t1 = "Hello";
		String t1 = s1.intern();
		//Operator == compares memory locations
		if(s1==t1){
			System.out.println(s1+" is equal to "+t1);
			System.out.println(s1.hashCode()+" is equal to "+t1.hashCode());
		}else{
			System.out.println(s1+" is not equal to "+t1);
			System.out.println(s1.hashCode()+" is not equal to "+t1.hashCode());
		}
		//Using equals method-it compares values or content stored in two objects or respective memory location of objects
		if(s1.equals(t1)){
			System.out.println("***Two Objects value is equal therefore hasCode or memory location is also equals");
			System.out.println(s1+" is equal to "+t1);
		}else{
			System.out.println(s1+" is not equal to "+t1);
		}
		
		System.out.println("*****Example to check whether interning a string changes memory location of not******");
		String s2= s1.intern();
		if(s2==t1){
			System.out.println(s2+" is equal to "+t1);
			System.out.println(s2.hashCode()+" is equal to "+t1.hashCode());
		}else{
			System.out.println(s2+" is not equal to "+t1);
			System.out.println(s2.hashCode()+" is not equal to "+t1.hashCode());
		}
	}

}
