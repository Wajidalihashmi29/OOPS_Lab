import java.util.*;
public class Q1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int numbers[]=new int[3];
		for (int i=0; i<3; i++)
		{
			numbers[i] = sc.nextInt();
		}
		if (numbers[0]!=numbers[1] & numbers[1]!=numbers[2] & numbers[0]!=numbers[2])
		{
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
				{
					for (int k=0;k<3;k++)
					{
						if(numbers[i]!=numbers[j] & numbers[j]!=numbers[k] & numbers[i]!=numbers[k])
						{
							System.out.println(numbers[i]+""+numbers[j]+""+numbers[k]);
						}
					}
				}
			}
		}
		else if(numbers[0]==numbers[1] & numbers[1]==numbers[2] & numbers[0]==numbers[2])
		{
			System.out.println(numbers[0]+""+numbers[1]+""+numbers[2]);
		}
		else if (numbers[0]==numbers[1] & numbers[1]!=numbers[2])
		{
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<i;j++)
				{
					System.out.println(numbers[i]+""+numbers[i]+""+numbers[j]);
				}
			}
		}
	}
}
			
