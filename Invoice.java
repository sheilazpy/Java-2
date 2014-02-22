// The "Invoice" class.
public class Invoice
{
    public static void main (String[] args)
    {
	int pens = 3, binders = 1, notebooks = 3;
	double penC = .5, binderC = 4.75, nbC = 3;
	double penTot = pens * penC, binderTot = binders * binderC, nbTot = notebooks * nbC;
	System.out.println ("Pencil and Pens");
	System.out.println ("");
	System.out.println (pens + " Pens @ $" + penC + "        $" + penTot);
	System.out.println (binders + " Binder @ $" + binderC + "     $" + binderTot);
	System.out.println (notebooks + " Notebooks @ $" + nbC + "   $" + nbTot);
	System.out.println ("");
	System.out.println ("Total:              $" + (penTot + binderTot + nbTot));
    } // main method
} // Ch3prob5 class
