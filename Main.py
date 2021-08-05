
def FactRev(iNo):

    if(iNo < 0):
        iNo = -iNo
    
    limit = int(iNo/2)

    for x in range(limit,0,-1):
        if iNo%x == 0:
            print(x,end=" ")

if __name__ == "__main__":

    iValue = int(input("Enter Number\n"))

    FactRev(iValue)