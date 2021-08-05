
using System;

class ArithmeticX
{
	public
		void FactRev(int iNo)
		{
			if(iNo < 0)
			{
				iNo = -iNo;
			}

			for(int i = iNo/2; i >= 1; i--)
			{
				if(iNo%i == 0)
				{
					Console.Write(i+" ");
				}
			}
			Console.WriteLine();	
		}
}

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.FactRev(iValue);
	}
}