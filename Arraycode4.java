import java.util.Scanner;
public class Arraycode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of movie house");
		Scanner sc=new Scanner(System.in);
		int movie_hou=sc.nextInt();
		System.out.println("Enter the counter of thearter in each movie house");
		int theater=sc.nextInt();
		System.out.println("Enter the count of screen in each theater");
		int screen=sc.nextInt();
		int arr[][][]=new int [movie_hou][theater][screen];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the movie house"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the theater"+(j+1));
				for(int k=1;k<arr[i][j].length;k++) {
					System.out.println("Enter the capacoty for each screen no"+(k+1));
					arr[i][j][k]=sc.nextInt();
					
				}
			}
		}
		System.out.println("-----------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the movie house"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the theater"+(j+1));
				for(int k=1;k<arr[i][j].length;k++) {
					System.out.println("The fund for screen:"+(k+1)+"is");
					int fund=arr[i][j][k]*350;
					System.out.println(fund);
				}
			}
		}
		
		
		
		

	}

}
