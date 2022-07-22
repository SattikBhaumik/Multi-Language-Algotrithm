import java.util.*;
public class Bubble_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, f=0;
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
        System.out.println("Input "+m+"*"+n+" Array:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter choice- A for Ascending or D for Descending order sort:");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case A:
            case a:
            for (i=0; i< a.length(); i++)
            {
                for (j=0; j < a.length()-1; j++)
                {
                    if( a[j] > a[j+1] )  //Ascending
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            break;

            case D:
            case d:
            for ( i =0; i < a.length(); i++)
            {
                for (j=0; j< a.length()-1; j++)
                {
                    if ( a[j] > a[j+1] ) //Descending
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }           
        }
        System.out.println("Modified Array:");
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
} 