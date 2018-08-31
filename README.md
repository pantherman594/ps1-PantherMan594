# Problem Set 1

## Due Wednesday, September 5, at 11:59pm local time

### Cloning (review): Three options to clone the repository

1. Use the GitHub Desktop app to clone the repo, then move it to your course directory.

*OR*

2. Use a terminal to issue ``git clone``, then move the repo to your course directory.

*OR*

3. Follow the instructions in the last problem set for using the Command Palette in Atom.

After this problem set, I'll assume you have figured out the best way to do this for your system.

### Compiling and running Java programs

1. Open your repository in Atom and go to ``Packages -> platformio-ide-terminal -> New Terminal``.

2. Type the following to compile the code in `PartOne.java` (but don't type the `$`):

```bash
$ javac PartOne.java
```

This will create a new file, `PartOne.class`, which is the Java byte code that can be understood by the Java virtual machine. 

3. Now run your program by typing:

```bash
$ java PartOne
```

4. This should print ``Hello, World!`` to the screen.


### Part 1 (2 points)
Java's `System` package has utilities for reading in input and printing out output (I/O). You have seen `System.out.println` which prints to standard out (i.e., the screen) whatever you give it as an argument. There's also a handy function named `format` in `System.out` which supports *formatted output*.  For example, the call

   ```java
   System.out.format("The city of %s is amazing!", "Boston");
   ```

   would print to the console

   ```java
   The city of Boston is amazing!
   ```

   The string `"The city of %s is amazing!"` is a *format string* and `%s` represents a hole in the string accepting a String as input. Other specifiers are `%d`, `%f` and `%c` for integers, reals (`f` for `float`), and characters, respectively. For example, the call:

   ```java
   System.out.format("BEGIN--%d--%c--%f--%s--END", 12, 'A', 3.14, "Mei");
   ```

   prints

   ```java
   BEGIN--12--A--3.140000--Mei--END
   ```

1. Modify the file `PartOne.java` so that it uses `System.out.format` to print `Hello World!` instead of `System.out.println`. Of course, this can be done  without a hole at all, but you should write it as shown above so that it uses `%s`. Write this code within the `main` function within the `PartOne` class:

2. Make sure you did it right by compiling and running your code, as described in Part 1.


### Part 2 (2 points) 
Java programs can receive *command line arguments* (i.e., input provided on the command line when running the program) just as they can in Python and OCaml. The body of any `main` function in Java can access the command line arguments in the array `args` that we have seen in the declaration `public static void main (String[] args)`. In the following command:

   ```java
   $ java PartTwo Boston College
   ```

   `args.length` would be `2`, the string `"Boston"` would be in `args[0]` while the string `"College"` would be the value in `args[1]`. 

In the `PartTwo.java` files, rewrite function so that it accepts a name from the command line. Running it as in

   ```java
   $ java PartTwo Mookie
   ```

   should print

   ```java
   Hello, Mookie!
   ```

### Part 3 (2 points) 
Java is notorious for its complicated I/O (input/output) architecture. The `algs4.jar` library you installed in ps0.5 provides a simpler interface for I/O. In this problem you'll use the `readString` function from `StdIn` from that library. You will use the `StdIn.readString` function to interactively prompt the user for a name, rather than having the user supply the name on the command line. Write this code in PartThree.java, then compile and run to make sure it works. Running that program should go as follows:

   ```java
   $ java Part3
   Type a name: Offred
   Hello, Offred !
   ```

I have provided the `import` of `algs4` that is necessary to access the `StdIn.readString` function, but I have left out some of the code I provided before. You will need to fill in the declaration of the `main` function, in addition to writing the code that does the printing. Copying and pasting from the previous programs is just fine, of course.


### Part 4 (4 points) 
`Part4.java` contains no code at all! Your job is to use the code from parts 1, 2, and 3, to write a program that takes an integer `n` as a command line argument and then uses `n` to determine how many times to print the string:

   ```java
   Come Mr. DJ won't you turn the music up?
   ```

   For example, the call

   ```java
   $ java PartFour 4
   ```

   would print

   ```java
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
  Come Mr. DJ won't you turn the music up?
   ```

   For this problem you'll need to figure out how to do two things: (1) to convert a string representation of an integer such as `"343"` to an actual `int` `343`, and (2) to call the `System.out.println` function repeatedly. For the former, take a stroll through Java's built-in `Integer` class to see if there are any pre-defined library functions that might convert a string such as `"343"` to an integer `343`. For the latter, google Java for-loops, which are a bit different from `for` statements in Python. 

Once your code works to your satisfaction, save the files, stage them, commit them, and push them to master repo on the class GitHub site. For a reminder about how to do this, see ps0.5.

As always, you can check to see if it worked by going to your account on GitHub and checking to see if it was updated and whether the files have changed in the way you expected.

