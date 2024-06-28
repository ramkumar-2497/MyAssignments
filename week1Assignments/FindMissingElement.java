package week1Assignments;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,3,2,8,6,7};

//1+4+3+2+8+6+7=31 sum1
//1+2+3+4+5+6+7+8=36 sum2
int sum1=0;

for(int i=0;i<a.length;i++)
{
	sum1=sum1+a[i];
}
System.out.println("Sum of elements in array:"+ sum1);

int sum2=0;
 for(int i=1;i<=8;i++)
 {
	 sum2=sum2+i;
	}
 System.out.println("sum of range of elements:"+sum2);
 
 System.out.println("Missing Number is:"+ (sum2-sum1));
	
	}
}
