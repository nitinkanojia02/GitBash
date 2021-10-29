public class demo 
{
	public static void main(String[] args) {

		int flag=-1;
		char ch='a';
		for(int i=0;i<4;i++)
		{
			if(flag==3)
				break;
			System.out.print(ch++);

			if(i==3)
			{
				System.out.println();
				flag++;
				i=-1;
			}
		}


	}
}
