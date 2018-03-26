/*
  	ISYS 320
  	Name(s): Matthew Shelby
  	Date: 3/18/2018
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*	public class StarFigures {
 * 		public static void main(String[] args) {
 * 			Shape();
 * 
 * 			Shape();
 * 			Line();
 * 			line();
 * 
 * 			Dot();
 * 			Dot();
 * 			Dot();
 * 			Shape();
 *		}
 *	}
 */

public class StarFigures {
	public static void main(String[] args) {
		shape();
		System.out.println();
		shape();
		line();
		line();
		System.out.println();
		dot();
		dot();
		dot();
		shape();
	}
	
	public static void shape() {
		System.out.println("*****");
		System.out.println("*****");
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	
	public static void line() {
		System.out.println("*****");
	}
	
	public static void dot() {
		System.out.println("  *  ");
	}

}
