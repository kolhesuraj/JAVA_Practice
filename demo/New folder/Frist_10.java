package demo;

public class Frist_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input , flag=0 , counter = 0;
		for(input = 1; input <= 1000; input++)
		{
			if(counter == 10) {
				break;
			}
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
	}

}
