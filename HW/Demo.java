import java.util.*;

class Demo
{
	public static void main(String Args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {2,3,5,6,7,2};
		int r[]=new int[100];
		int m[]=new int[100];int i=0, j=0, k=0, l=0, flag;

		for(i=0;i<10;i++)
		{
			for(j=0;j<6;j++)
			{
				if(a[i]==b[j])
				{
					r[k]=a[i];
					k++;
				}
				else
				{
					m[l]=a[i];
					l++;
				}
			}
		}

		for(i=0;i<=k;i++)
		{
			System.out.print(r[i]);
		}
		for(i=0;i<=l;i++)
		{
			System.out.print(r[i]);
		}
	}

}