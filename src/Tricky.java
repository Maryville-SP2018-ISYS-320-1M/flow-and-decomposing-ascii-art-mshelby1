/*
  	ISYS 320
  	Name(s): Matthew Shelby
  	Date: 3/18/2018
*/

// 1. Your predicted output: This is message1. This is message2. This is message1. Done with message 2. Done with main.
 

public class Tricky {
	public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

// 3. Were you correct? Explain any differences: My prediction was correct.
 
 

