
import java.lang.*;
import java.util.*;

class ArithmeticX
{
    public void FactRev(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int i = iNo/2; i >= 1; i--)
        {
            if(iNo%i == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number");
        int iValue = sobj.nextInt();

        ArithmeticX aobj = new ArithmeticX();
        aobj.FactRev(iValue);
    }   
}