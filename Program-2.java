import java.util.Scanner;
class Series{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i+",");
			}
		}		
	}
}
