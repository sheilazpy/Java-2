// The "Trig" class.
public class Trig
{
    public static void main (String[] args)
    {
	double angleRad, sine, cosine;
	int angleDeg = 0;
	angleRad = Math.toRadians (angleDeg);
	sine = Math.sin (angleRad);
	cosine = Math.cos (angleRad);
	System.out.println ("Angle:" + angleDeg + ", Sine:" + sine + ", Cosine:" + cosine);
	angleDeg = 30;
	angleRad = Math.toRadians (angleDeg);
	sine = Math.round (Math.sin (angleRad) * 10) / 10.0;
	cosine = Math.cos (angleRad);
	System.out.println ("Angle:" + angleDeg + ", Sine:" + sine + ", Cosine:" + cosine);
	angleDeg = 45;
	angleRad = Math.toRadians (angleDeg);
	sine = Math.sin (angleRad);
	cosine = Math.cos (angleRad);
	System.out.println ("Angle:" + angleDeg + ", Sine:" + sine + ", Cosine:" + cosine);
	angleDeg = 90;
	angleRad = Math.toRadians (angleDeg);
	sine = Math.sin (angleRad);
	cosine = Math.round (Math.cos (angleRad));
	System.out.println ("Angle:" + angleDeg + ", Sine:" + sine + ", Cosine:" + cosine);
	angleDeg = 180;
	angleRad = Math.toRadians (angleDeg);
	sine = Math.round (Math.sin (angleRad));
	cosine = Math.cos (angleRad);
	System.out.println ("Angle:" + angleDeg + ", Sine:" + sine + ", Cosine:" + cosine);
    } // main method
} // Trig class
