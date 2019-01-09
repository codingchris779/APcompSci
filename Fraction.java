package ThingForMarchal;
public class Fraction {

    // ******************  Instance variables  ******************

    private int num;
    private int denom;



    public Fraction()
    {
        num = 0;
        denom = 1;
    }

    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }

    public Fraction(int n, int d)
    {
        if (d != 0)
        {
            num = n;
            denom = d;
            reduce();
        }
        else
        {
            throw new IllegalArgumentException(
                    "Fraction construction error: denominator is 0");
        }
    }

    public Fraction(Fraction other)  // copy constructor
    {
        num = other.num;
        denom = other.denom;
    }
    public Fraction add(Fraction other)
    {
        int newNum = num * other.denom + denom * other.num;
        int newDenom = denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction add(int m)
    {
        return new Fraction(num + m * denom, denom);
    }

    public Fraction multiply(Fraction other)
    {
        int newNum = num * other.num;
        int newDenom = denom * other.denom;
        return new Fraction(newNum, newDenom);
    }

    public Fraction multiply(int m)
    {
        return new Fraction(num * m, denom);
    }

    public double getValue()
    {
        return (double)num / (double)denom;
    }

    public String toString()
    {
        return num + "/" + denom;
    }

    public void reduce()
    {
        if (num == 0)
        {
            denom = 1;
            return;
        }

        if (denom < 0)
        {
            num = -num;
            denom = -denom;
        }

        int q = gcf(Math.abs(num), denom);
        num /= q;
        denom /= q;
    }


    private int gcf(int n, int d)
    {
        if (n <= 0 || d <= 0)
        {
            throw new IllegalArgumentException(
                    "gcf precondition failed: " + n + ", " + d);
        }

        while (d != 0)
        {
            int temp = d;
            d = n % d;
            n = temp;
        }
        return n;
    }
    public Fraction subtract(Fraction m){
        int gcf = m.denom*denom;
        int hol1 = m.denom;
        int hol2 = m.num;
        int hol3 = denom;
        int hol4 = num;
        System.out.println(gcf);
        int mult1 = gcf/m.denom;
        int mult2 = gcf/denom;
        m.denom =m.denom*mult1;
        m.num = m.num*mult1;
        denom = denom*mult2;
        num = num *mult2;
        Fraction hol = new Fraction(num-m.num,gcf);
        m.denom = hol1;
        m.num = hol2;
        denom = hol3;
        num = hol4;
        return hol;


    }
    public  Fraction divide(Fraction m) throws IllegalArgumentException{
        if (m.denom==0){throw new IllegalArgumentException("YOU DON GOOFED"); }
        return new Fraction(num*m.denom,denom*m.num);
    }
}