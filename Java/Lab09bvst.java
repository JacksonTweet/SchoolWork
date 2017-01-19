// Lab09bvst.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.
 
 
import java.util.Scanner;
 
 
public class Lab09bvst
{
    static int num1, den1;   // numerator and denominator of the 1st rational number
    static int num2, den2;   // numerator and denominator of the 2nd rational number
 
    public static void main (String args[])
    {
        enterData();
 
        Rational r1 = new Rational(num1,den1);
        Rational r2 = new Rational(num2,den2);
        Rational r3 = new Rational();
 
        r3.multiply(r1,r2);
        System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getRational());
        r3.divide(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getRational());
 
        //100 Point Version Only
        r3.add(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getRational());
        r3.subtract(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getRational());
        System.out.println();
    }
 
    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 1st numerator ----> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the 1st denominator --> ");
        den1 = input.nextInt();
        System.out.print("\nEnter the 2nd numerator ----> ");
        num2 = input.nextInt();
        System.out.print("\nEnter the 2nd denominator --> ");
        den2 = input.nextInt();
    }
}
 
 
class Rational
{
 
    private int num, den;    
    private int firstNum, firstDen;    // for getRational
   
    public Rational() {
       
    }
   
    //  Rational
    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
        firstNum = num;
        firstDen = den;
        reduce();
    }
 
    //  getNum
    public int getNum(){return firstNum;}
 
    //  getDen
    public int getDen(){ return firstDen;}
 
    //  getDecimal
    public double getDecimal(){ return (double) firstNum/firstDen;}
 
    //  getRational
    public String getRational(){
        return num + "/" + den;
    }
 
    //  getOriginal
    public String getOriginal(){ return firstNum + "/" + firstDen;}
 
    //  reduce
    public void reduce(){
        firstNum = num;
        firstDen = den;
        num = firstNum/getGCF(firstNum,firstDen);
        den = firstDen/getGCF(firstNum,firstDen);
    }
 
    private int getGCF(int n1,int n2)
    {
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
        return gcf;
    }
   
    public void multiply(Rational r1, Rational r2)
    {
        num = r1.getNum() * r2.getNum();
        den = r1.getDen() * r2.getDen();
        reduce();
    }
 
    public void divide(Rational r1, Rational r2)
    {
        num = r1.getNum() * r2.getDen();
        den = r1.getDen() * r2.getNum();
        reduce();
    }
 
    public void add(Rational r1, Rational r2)
    {
        den = r1.getDen() * r2.getDen();
        num = (r1.getNum() * r2.getDen()) + (r2.getNum() * r1.getDen());
        reduce();
    }
 
    public void subtract(Rational r1, Rational r2)
    {
        den = r1.getDen() * r2.getDen();
        num = (r1.getNum() * r2.getDen()) - (r2.getNum() * r1.getDen());
        reduce();
    }
 
}