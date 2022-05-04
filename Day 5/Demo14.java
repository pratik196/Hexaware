class Demo14
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7};
		int a[]=new int[7];
		a[0]=0;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[5]=50;
		a[6]=60;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
}}