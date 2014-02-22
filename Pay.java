// The "Pay" class.
import hsa.*;
public class Pay
{
    public static void main (String[] args)
    {
	double annualSalary, monthlySalary, incomeTax, deduction = 52.5, pay;
	System.out.print ("Enter annual salary: ");
	annualSalary = Stdin.readDouble ();
	monthlySalary = annualSalary / 12;
	System.out.println ("Monthly gross salary = $" + monthlySalary);
	incomeTax = monthlySalary / 4;
	System.out.println ("Income tax = $" + incomeTax);
	System.out.println ("Benefits deduction = $" + deduction);
	pay = monthlySalary - incomeTax - deduction;
	System.out.println ("Take home pay = $" + pay);
    } // main method
} // Pay class
