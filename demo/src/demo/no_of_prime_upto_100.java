package demo;

public class no_of_prime_upto_100 {

	public static void main(String[] args) {
		
		int input , flag=0 , counter = 0;
		for(input = 1; input <= 100; input++)
		{
			if(input == 2) {
				flag = 1;
			}
			else {
				for(int i = 2; i <= input-1; i++)
				{
					if(input % i == 0)
					{
						flag = 0;
						break;
					}
					else {
						flag = 1;
					}
				}
			}
			if(flag == 1)
			{
				System.out.println(input);
				counter = counter + 1 ;
			}
	}
		System.out.println("no. of prime numbers bettween 1-100 are " +counter);

}
}
