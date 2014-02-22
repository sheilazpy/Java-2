// The "MonthCalendar" class.
import hsa.*;
public class MonthCalendar
{
    public static void main (String[] args)
    {
	int monthNum = 0, year, days, date, start = 5;
	char char1, char2, char3;
	String month;
	Stdout.print ("Enter month and year:  ");
	month = Stdin.readString ();
	year = Stdin.readInt ();
	char1 = month.charAt (0);
	char2 = month.charAt (1);
	char3 = month.charAt (2);
	switch (char3)
	{
	    case 'n':
		switch (char2)
		{
		    case 'a':
			month = "January";
			monthNum = 1;
			days = 31;
			break;
		    case 'u':
			month = "June";
			monthNum = 6;
			days = 30;
			break;
		    default:
			month = "Invalid";
			monthNum = 0;
			days = 0;
			break;
		} //switch
		break;
	    case 'b':
		month = "February";
		monthNum = 2;
		if (year % 4 == 0)
		{
		    if (year % 100 == 0)
		    {
			if (year % 400 == 0)
			{
			    days = 29;
			} //if
			else
			{
			    days = 28;
			} //else
		    } //if
		    else
		    {
			days = 29;
		    } //else
		} //if
		else
		{
		    days = 28;
		} //else
		break;
	    case 'r':
		switch (char2)
		{
		    case 'a':
			month = "March";
			monthNum = 3;
			days = 31;
			break;
		    case 'p':
			month = "April";
			monthNum = 4;
			days = 30;
			break;
		    default:
			month = "Invalid";
			monthNum = 0;
			days = 0;
			break;
		} //switch
		break;
	    case 'y':
		month = "May";
		monthNum = 5;
		days = 31;
		break;
	    case 'l':
		month = "July";
		monthNum = 7;
		days = 31;
		break;
	    case 'g':
		month = "August";
		monthNum = 8;
		days = 31;
		break;
	    case 'p':
		month = "September";
		monthNum = 9;
		days = 30;
		break;
	    case 't':
		month = "October";
		monthNum = 10;
		days = 31;
		break;
	    case 'v':
		month = "November";
		monthNum = 11;
		days = 30;
		break;
	    case 'c':
		month = "December";
		monthNum = 12;
		days = 31;
		break;
	    default:
		month = "Invalid";
		monthNum = 0;
		days = 0;
		break;
	} //switch
	Stdout.println ();
	Stdout.println ("           " + month + " " + year);
	Stdout.print ("Sun", -5);
	Stdout.print ("Mon", -5);
	Stdout.print ("Tues", -5);
	Stdout.print ("Wed", -5);
	Stdout.print ("Thur", -5);
	Stdout.print ("Fri", -5);
	Stdout.println ("Sat", -5);
	if (year < 2009)
	{
	    for (int loop = year ; loop <= 2009 ; loop++)
	    {
		start -= 337;
		if (loop % 4 == 0)
		{
		    if (loop % 100 == 0)
		    {
			if (loop % 400 == 0)
			{
			    start -= 29;
			} //if
			else
			{
			    start -= 28;
			} //else
		    } //if
		    else
		    {
			start -= 29;
		    } //else
		} //if
		else
		{
		    start -= 28;
		} //else
	    } //for
	    for (int loop = 1 ; loop < monthNum ; loop++)
	    {
		if (loop == 1 || loop == 3 || loop == 5 || loop == 7
			|| loop == 8 || loop == 10 || loop == 12)
		{
		    start += 31;
		} //if
		if (loop == 4 || loop == 6 || loop == 9 || loop == 11)
		{
		    start += 30;
		} //if
		if (loop == 2)
		{
		    if (year % 4 == 0)
		    {
			if (year % 100 == 0)
			{
			    if (year % 400 == 0)
			    {
				start += 29;
			    } //if
			    else
			    {
				start += 28;
			    } //else
			} //if
			else
			{
			    start += 29;
			} //else
		    } //if
		    else
		    {
			start += 28;
		    } //else
		} //if
	    } //for
	    start = start % 7 + 8;
	} //if
	if (year >= 2009)
	{
	    for (int loop = year - 1 ; loop >= 2009 ; loop--)
	    {
		start += 337;
		if (loop % 4 == 0)
		{
		    if (loop % 100 == 0)
		    {
			if (loop % 400 == 0)
			{
			    start += 29;
			} //if
			else
			{
			    start += 28;
			} //else
		    } //if
		    else
		    {
			start += 29;
		    } //else
		} //if
		else
		{
		    start += 28;
		} //else
	    } //for
	    for (int loop = 1 ; loop < monthNum ; loop++)
	    {
		if (loop == 1 || loop == 3 || loop == 5 || loop == 7
			|| loop == 8 || loop == 10 || loop == 12)
		{
		    start += 31;
		} //if
		if (loop == 4 || loop == 6 || loop == 9 || loop == 11)
		{
		    start += 30;
		} //if
		if (loop == 2)
		{
		    if (year % 4 == 0)
		    {
			if (year % 100 == 0)
			{
			    if (year % 400 == 0)
			    {
				start += 29;
			    } //if
			    else
			    {
				start += 28;
			    } //else
			} //if
			else
			{
			    start += 29;
			} //else
		    } //if
		    else
		    {
			start += 28;
		    } //else
		} //if
	    } //for
	       start %= 7;
	} //if
	for (int space = 1 ; space < start ; space++)
	{
	    Stdout.print ("", 5);
	} //for
	for (date = 1 ; date <= days ; date++)
	{
	    Stdout.print (date, 5);
	    if ((date + start - 1) % 7 == 0)
	    {
		Stdout.println ();
	    } //if
	} //for
    } // main method
} // MonthCalendar class


