
public class demo5 {
	public static void main(String[] args) {

		int num = 1;
		char ch = 'a';
		int count = 0;
		int flag = 0;

		while (count < 4)
		{
			for (int i = 0; i < 4; i++) 
			{
				if (flag % 2 == 0) 
				{	
					System.out.print(num++);
				}
					else
					{
						
					System.out.print(ch++);
				}
			}
			num=1;
			ch='a';
			System.out.println();
			flag++;
			count++;
		}

	}

}
