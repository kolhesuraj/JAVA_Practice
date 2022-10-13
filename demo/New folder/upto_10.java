package demo;
public class upto_10 {
	public static void main(String[] args) 
	{
		int input , flag=2, set = 10;
		for(input = 1; input <= set; input++)
		{
			if(input == 2)
			{
				flag = 1;
			}
			else {
				for(int i = 2; i <= input-1; i++) 
				{
					if(input%i == 0) 
					{
						flag = 0;
						break;
					}
					else
					{
						flag = 1;
					}
				}
			}
			if(flag == 1)
			{
				System.out.println(input);
			}
			

		}
	}
}