import java.util.Scanner;
public class Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		System.out.println("For better result gine n=11 or 15:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0 && j<n/2 || j==n/4 || i==n-1 && j<n/2 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int j=0;j<n;j++){
					if(i==n-1 && j<n/2 || j==n/2 && i!=0 && i!=n-1
					   || j==n-1 && i!=0 && i!=n-1 || i==0 && j>n/2 && j!=n-1 
					   || i==n-1 && j>n/2 && j!=n-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			for(int j=0;j<n;j++){
				if(j==0 && i<3*n/4 || j==n/2+1 && i<3*n/4 || i-j==3*n/4-1 && j<=n/4+1
				   || i+j==n+n/4 && i>=3*n/4 || j==n/2+2 || i==0 && j>=n/2+2 || 
				   i==n/2 && j>=n/2+2 || i==n-1 && j>=n/2+2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==n/2-1 || j==n-1 || j-i==n/2-1 && j>=n/2 && j<3*n/4 || i+j==n-1 && j>=3*n/4 && j<n-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==n/4+1 && i>n/4 || i==j && i<n/2-1 || i+j==n/2+1 && i<n/2-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++){
				if(i==j && i<n/2-1 || i+j==n/2+1 && i<n/2-1 || j==0 || j==n/2+1
						|| j==3*n/4-1 && i!=0 && i!=n-1 || i==0 && j>=3*n/4 || i==n-1 && j>=3*n/4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1 || i==0 && j>0 && j<=n/2 || j==n/4+1 || j==n/2+1 || j==n-1 ||  i==n/2 && j>n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 || i==0 && j<n/2 || i==n/2 && j<n/2 || i==n-1 && j<n/2
					|| j==n/2+1 || i==0 && j>n/2 && j!=n-1 || i==n/2 && j>n/2 && j!=n-1
					|| j==n-1 && i!=0 && i<n/2 || j-i==1 && i>n/2)
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