/* Part 4 of Problem Set 1

Allow user to specify the number of times to print out
"Come Mr. DJ won't you turn the music up?"

How to compile and run from the command line (don't type the $):
$ javac PartFour.java
$ java PartFour <some_integer>

*/

public class PartFour {

  public static void main(String[] args) {

    if (args.length < 1) {
      System.out.println("Please provide a number as an argument!");
      return;
    } else if (args.length > 1) {
      System.out.println("Please provide only 1 argument!");
      return;
    }

    String arg = args[0];
    int num = 0;
    try {
      num = Integer.parseInt(arg);
    } catch (NumberFormatException ignored) {
      System.out.format("Whoops, '%s' is not an integer!", arg);
      System.out.println();
      return;
    }

    for (int i = 0; i < num; i++) {
      System.out.println("Come Mr. DJ won't you turn the music up?");
    }

  }

}
