/* Part 3 of Problem Set 1

Prompt the user for a name.
Print out "Hello, <whatever_the_name_is>!"

How to compile and run from the command line (don't type the $):
$ javac PartThree.java
$ java PartThree

*/

import edu.princeton.cs.algs4.StdIn;


public class PartThree {

  public static void main(String[] args) {
    
    System.out.print("Type a name: ");
    String input = StdIn.readString();
    System.out.format("Hello, %s!", input);
    System.out.println();

  }

}
