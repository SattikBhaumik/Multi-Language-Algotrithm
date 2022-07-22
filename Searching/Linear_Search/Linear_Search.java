import java.util.*;
public class Linear_Search
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
        System.out.println("Enter number to be searched:")
        int num = sc.nextInt();
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                if(num==a[i][j])
                {
                    f++;
                    break;
                }
            }
        }
        if(f!=0)
        {
            System.out.println("Number found!");
        }
        else
        {
            System.out.println("Number not found!")
        }
    }
}