
/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private double numerateur;
    private double denominateur;	
    /**
     * Constructor for objects of class Fraction
     */
    public Fraction(double numerateur, double denominateur)
	{
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
    
   	public Fraction()
	{
		this(0,0);
	}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   @Override
	public String toString()
	{
		return Double.valueOf(numerateur).toString() + " " + Double.valueOf(denominateur).toString();
	}
}
