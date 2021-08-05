
#include<iostream>

using namespace std;

class ArithmeticX
{
    public:
        void FactRev(int);
};

void ArithmeticX::FactRev(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(int i = iNo/2; i >= 1; i--)
    {
        if(iNo%i == 0)
        {
            cout<<i<<" ";
        }
    }
    cout<<endl;
}

int main()
{
    int iValue = 0;

    cout<<"Enter Number\n";
    cin>>iValue;

    ArithmeticX aobj;
    aobj.FactRev(iValue);

    return 0;
}