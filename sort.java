package Arrays;

public class sort {

	public static void main(String[] args) {
	int a[] = {2,1,8,-4,6,3};
	int n= a.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-
				1;j++)
		{
			if(a[j+1]<a[j])
			{
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
			
		}
	}
	for(int e: a)
		System.out.print(e);
	}
}
		
