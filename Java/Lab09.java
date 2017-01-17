 /*====================*\ 
||     Code Writer:     ||
||     Jackson Tweet    ||
||     Discription:     || 
|| A Java lab for class || 
 \*====================*/

import java.util.Scanner;

public class Lab09jt
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
        r.getGCF(num,den);
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}



class Rational
{
    private int num;
    private int den;
    public Rational(int numPriv, int denPriv)
    {
      num = numPriv;
      den = denPriv;
    }
    public int getNum()
    {
      return num;
    }
    public int getDen()
    {
      return den;
    }
    private String getOriginal()
    {
      return getNum() + "/" + getDen();
    }
    private float getDecimal()
    {
      float decimalNumber = ((float) num) / den;
      return decimalNumber;
    }
    public void displayData()
    {
        System.out.println();
        System.out.println(getOriginal()+ " equals " + getDecimal());
        System.out.println();
        System.out.println();
        System.out.println();
    }

     public void getGCF(int n1,int n2)
    {
        n1 = num;
        n2 = den;
        int rem = 0;
        int gcf = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
    } 
}
