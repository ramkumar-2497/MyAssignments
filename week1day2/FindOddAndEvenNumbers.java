package week1day2;

public class FindOddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange=10;
		
		for (int i=1; i <=maxRange ; i++) {
			if(i%2==1)
			{
				System.out.println("The given number" +i+" is odd");
			}else {
				System.out.println("The given number" +i+" is even");
			}
		}

	}

}
