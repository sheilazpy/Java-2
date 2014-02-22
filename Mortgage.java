// The "Mortgage" class.
import hsa.Stdin;
import hsa.Stdout;
import java.text.NumberFormat;
public class Mortgage
{
    public static void main (String[] args)
    {
	// Declare variables.
	double balance, annualInterestPercent;
	double monthlyPayment;
	double annualInterestRate, monthlyInterestRate;
	double monthlyInterest;
	int numberOfYears, displayOption;
	NumberFormat myFormat;
	double yearlyPaid = 0, yearlyInterest = 0;

	// Obtain data from user.
	do
	{
	    do
	    {
		Stdout.print ("Enter the amount of the mortgage: ");
		balance = Stdin.readDouble ();
		if (balance < 0)
		{
		    Stdout.println ("You must enter a positive number");
		} //if
		if (balance > 10000000)
		{
		    Stdout.print ("Are you sure? Y / N  ");
		    char test = Stdin.readChar ();
		    if (test == 'Y' || test == 'y')
		    {
			break;
		    } //if
		} //if
	    } //do
	    while (balance < 0 || balance > 10000000);
	    do
	    {
		Stdout.print ("Enter the interest rate as a percent: ");
		annualInterestPercent = Stdin.readDouble ();
		if (annualInterestPercent < 0)
		{
		    Stdout.println ("You must enter a positive number");
		} //if
		if (annualInterestPercent > 20)
		{
		    Stdout.print ("Are you sure? Y / N:  ");
		    char test = Stdin.readChar ();
		    if (test == 'Y' || test == 'y')
		    {
			break;
		    } //if
		} //if
	    } //do
	    while (annualInterestPercent < 0 || annualInterestPercent > 20);
	    do
	    {
		Stdout.print ("Enter the amount of the monthly payment: ");
		monthlyPayment = Stdin.readDouble ();
		if (monthlyPayment > 100000)
		{
		    Stdout.print ("Are you sure? Y / N  ");
		    char test = Stdin.readChar ();
		    if (test == 'Y' || test == 'y')
		    {
			break;
		    } //if
		} //if
	    } //do
	    while (monthlyPayment > 100000);
	    annualInterestRate = annualInterestPercent / 100;
	    monthlyInterestRate = annualInterestRate / 12;
	    monthlyInterest = balance * monthlyInterestRate;
	    if ((monthlyPayment <= monthlyInterest) && (monthlyPayment > 0))
	    {
		Stdout.println ("Monthly payment must be greater than " + monthlyInterest);
	    }
	} //do
	while ((monthlyPayment <= monthlyInterest) && (monthlyPayment > 0));
	Stdout.print ("Number of years of printout: ");
	numberOfYears = Stdin.readInt ();
	while (numberOfYears < 0)
	{
	    Stdout.println ("You must enter a positive number");
	    Stdout.print ("Number of years of printout: ");
	    numberOfYears = Stdin.readInt ();
	}
	Stdout.println ("Enter display option");
	Stdout.println ("   1 = Monthly     2 = Yearly");
	Stdout.print ("Choice: ");
	displayOption = Stdin.readInt ();
	while ((displayOption != 1) && (displayOption != 2))
	{
	    Stdout.println ("You must enter a 1 or a 2");
	    Stdout.print ("Choice: ");
	    displayOption = Stdin.readInt ();
	} // while

	// Output user data in nice format.
	myFormat = NumberFormat.getCurrencyInstance ();
	Stdout.println ();
	Stdout.println ("Initial Amount: " + myFormat.format (balance));
	Stdout.println ("Interest Rate: " + annualInterestPercent + "%");
	Stdout.println ("Monthly Payment: " + myFormat.format (monthlyPayment));
	Stdout.println ("Table size: " + numberOfYears + " years");
	if (displayOption == 1)
	{
	    Stdout.println ("Displaying table entry monthly");
	    Stdout.println ();
	    Stdout.print ("Mnth  ");
	}
	else
	{
	    Stdout.println ("Displaying table entry yearly");
	    Stdout.println ();
	    Stdout.print ("Year  ");
	}

	// Output table headings.
	Stdout.print ("Paid  ", -10);
	Stdout.print ("  ");
	Stdout.print ("Interest", -10);
	Stdout.print ("  ");
	Stdout.println ("Owing   ", -13);

	// for 1 .. number of months to continue.
	for (int month = 1 ; month <= numberOfYears * 12 ; month++)
	{
	    // Do monthly calculations.
	    int balanceInPennies;

	    monthlyInterest = balance * monthlyInterestRate;
	    balance = balance + monthlyInterest;
	    balanceInPennies = (int) Math.ceil (balance * 100);
	    balance = balanceInPennies / 100.0;
	    if (monthlyPayment > balance)
	    {
		monthlyPayment = balance;
	    }
	    balance = balance - monthlyPayment;

	    if (displayOption == 1)
	    {
		// Output table entry.
		Stdout.print (month, 4);
		Stdout.print ("  ");
		Stdout.print (myFormat.format (monthlyPayment), -10);
		Stdout.print ("  ");
		Stdout.print (myFormat.format (monthlyInterest),
			- 10);
		Stdout.print ("  ");
		Stdout.println (myFormat.format (balance), -13);
	    } // if
	    else
	    {
		yearlyPaid = yearlyPaid + monthlyPayment;
		yearlyInterest = yearlyInterest + monthlyInterest;
		if (month % 12 == 0 || balance <= 0)
		{
		    // Output table entry for year.
		    Stdout.print (Math.ceil (month / 12.0), 3);
		    Stdout.print ("  ");
		    Stdout.print (myFormat.format (yearlyPaid), -10);
		    Stdout.print ("  ");
		    Stdout.print (myFormat.format (yearlyInterest), -10);
		    Stdout.print ("  ");
		    Stdout.println (myFormat.format (balance), -13);
		    yearlyPaid = 0;
		    yearlyInterest = 0;
		} // if
	    } // else

	    // exit if balance is 0.
	    if (balance <= 0)
	    {
		break;
	    }
	} // for
    } // main method
} // Mortgage class


