class q4
{
public static void main(String args[])
{
int[] marks = new int[]{98,76,85,93,30,65,48,65,98,59};
for (int i=0;i<=11;i++){
	if (marks[i] >= 76)
	{
		System.out.println(marks[i]+" DISTINCTION");
	}
	else
	{
		if (marks[i] >= 51 && marks[i] <= 75)
		{
			System.out.println(marks[i]+" MERIT");
		}
		else
		{
			if (marks[i] >= 40 && marks[i] <= 50)
			{
				System.out.println(marks[i]+" PASS");
			}
			else
			{
				System.out.println(marks[i]+" FAIL\t\t");
			}
		}
	}
}
}
}