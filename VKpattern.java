import java.util.Scanner;
public class VKpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 && i<n/2 || j==n-1 && i<n/2 ||
						i-j==n/2 && i>=n/2 || i+j==(n/2+n-1)) {
					System.out.print("* ");
				}
			
			else {
				System.out.print("  ");
			}
			}
			for(int j=0;j<n;j++) {
				if( j==0 || i+j==(n/2) || i-j==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}
		
		System.out.println();
	}
	}

}
