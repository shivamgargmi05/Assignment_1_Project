
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		
		for(int i=0;i<=n-1;i++) {
			
			System.out.print("* ");
			
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			for(int j=0;j<=n-1;j++) {
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			for(int j=0;j<=n-1;j++) {
				if((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			for(int j=0;j<=n-1;j++) {
				if(j==0 || (i==0 && j!=n-1) || (i==(n-1)/2 && j!=n-1) || (j==n-1 && i>0 && i<(n-1)/2) || 
						(i>(n-1)/2 && i==j) )
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.print(" ");
			
			for(int j=0;j<=n-1;j++) {
				if((i==0 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || 
						(j==0 && i>0 && i<n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();		
		}
		
	}

}
