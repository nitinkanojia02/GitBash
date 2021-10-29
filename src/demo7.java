
public class demo7 {
public static void main(String[] args)
{
	int num = 1;
	int count = 0;
	while (count < 4)
	{
			for (int i = 0; i < 4; i++) 
		{
				if(num>6)
				{
					num=0;
				}
			System.out.print(num++);
		}
		System.out.println();
		count++;
	}

	
	
}
}
