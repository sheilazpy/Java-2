// The "NamesAndAges" class.
import hsa.*;
public class NamesAndAges
{
    public static void main (String[] args)
    {
	String name1, name2, name3;
	int age1, age2, age3;
	Stdout.print ("Enter the first name:  ");
	name1 = Stdin.readLine ();
	Stdout.print ("Enter the first age:  ");
	age1 = Stdin.readInt ();
	Stdout.print ("Enter the second name:  ");
	name2 = Stdin.readLine ();
	Stdout.print ("Enter the second age:  ");
	age2 = Stdin.readInt ();
	Stdout.print ("Enter the third name:  ");
	name3 = Stdin.readLine ();
	Stdout.print ("Enter the third age:  ");
	age3 = Stdin.readInt ();
	Stdout.print (name1, 20);
	Stdout.println (age1, 4);
	Stdout.print (name2, 20);
	Stdout.println (age2, 4);
	Stdout.print (name3, 20);
	Stdout.println (age3, 4);
    } // main method
} // NamesAndAges class
