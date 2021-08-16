class RemoveDup
{
    static void RD(int A[])
    {
        int L = A.length;
        System.out.println("Given Array is : ");
        for(int i=0;i<L;i++)
        {
            System.out.print(A[i] + " ");
            System.out.println();
        }
        
        for(int i=0;i<L-1;i++)
        {
            for(int j=i+1;j<L;j++)
            {
                if(A[i]==A[j])
                {
                   A[j]=A[L-1];
                   L--;
                }
            }
        }
        
        System.out.println("New Array after Removal of Duplicate");
        
        for(int i=0;i<L;i++)
        {
            System.out.println(A[i] + " ");
        }
    }
}