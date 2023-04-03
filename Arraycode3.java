import java.util.Scanner;
public class Arraycode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of classes:");
		Scanner sc=new Scanner (System.in);
		int cls=sc.nextInt();
		int arr[][]=new int[cls][];
		//collecting student count inside each class
		 for(int i=0;i<arr.length;i++) {
	    	 System.out.println("inside the class"+(i+1));
	    	
	    		 arr[i]=new int[sc.nextInt()];
	}
		 
	
		 for(int i=0;i<arr.length;i++) {
	    	 System.out.println("inside the class"+(i+1));
	    	 for(int j=0;j<arr[i].length;j++) {
	    		 System.out.println("Enter the marrks of students"+(j+1));
}
		 }
		 System.out.println("------");
		 for(int i=0;i<arr.length;i++) {
	    	 System.out.println("inside the class"+(i+1));
	    	 for(int j=0;j<arr[i].length;j++) {
	    		 System.out.println("the marrks of students"+(j+1)+"is"+arr[i][j]);
      }
		 }
	}
}

	