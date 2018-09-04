/* Part 2 of Problem Set 1

Allow user to provide a name as an argument from the command line.
Print out "Hello, <whatever_the_name_is>!"

How to compile and run from the command line (don't type the $):
$ javac PartTwo.java
$ java PartTwo <whatever_the_name_is>

*/


public class PartTwo {

  public static void main (String[] args) {

    if (args.length == 0) {
      System.out.println("Please provide a name!");
      return;
    }

    // String input = args[0];
    String input = String.join(" ", args);
    System.out.format("Hello, %s!", input);
    System.out.println();

  }

}
