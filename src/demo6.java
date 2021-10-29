
public class demo6 {
	public static void main(String[] args) {
		
		int num = 1;
		char ch = 'a';
		int count = 0;
		while (count < 4)
		{
			for (int i = 0; i < 4; i++) 
			{
				if (i % 2 == 0) 
				{	
					System.out.print(num++);
				}
					else
					{
						System.out.print(ch++);
				}
			}
			System.out.println();
			count++;
		}

	}

}
