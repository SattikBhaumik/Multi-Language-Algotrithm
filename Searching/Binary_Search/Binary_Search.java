import java.util.*;
public class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, l=0, u;
        System.out.println("Enter the size of the array (m*n): ")
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]= new int[m][n];
        System.out.println("Enter "+(m*n)+" numbers:")
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number to be searched:")
        int num = sc.nextInt();
        u = a.length-1;
        switch(ch)
        {
            case A:
            case a:
            while(l<=u)
            {
                m = (l+u)/2;
                if(a[m][m]==n)
                {
                    f=1;
                    break;
                }
                else if( a[m][m]>n ) //Ascending
                {
                    u = m-1;
                }
                else
                {
                    l = m+1;
                }
            }
            break;
            case D:
            case d:
            while(l<=u)
            {
                m = (l+u)/2;
                if( a[m][m]==n )
                {
                    f=1;
                    i = l;
                    j = 
                    break;
                }
                else if( a[m][m]>n ) //Descending
                {
                    l = m+1;
                }
                else
                [
                    u = m-1;
                ]
            }
        }  
    }
}