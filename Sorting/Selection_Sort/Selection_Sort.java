import java.util.*;
public class Selection_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j;
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
            for (i=0; i< a.length()-1; i++)
            {
                small = a[i];
                pos = i;
                for (j=i+1; j < a.length()-1; j++)
                {
                    if( a[j] < small )  //Ascending
                    {
                        small = a[j];
                        pos = j;
                    }
                }
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
            break;

            case D:
            case d:
            for ( i =0; i < a.length(); i++)
            {
                small = a[i];
                pos = i;
                for (j=0; j< a.length()-1; j++)
                {
                    if ( a[j] > small ) //Descending
                    {
                        small = a[j];
                        pos = j   
                    }
                }
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
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