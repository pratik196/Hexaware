class Demo1
{
	public static void main(String Args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int even[] = new int[30];
		int odd[] = new int[30];
		int i=0, j=0, k=0, l=0;

		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[k] = a[i];
				k++;
			}
			else
			{
				odd[l] = a[i];
				l++;
			}
		}


		for(int x:a)
		{
			System.out.println(x);
		}
	}
}