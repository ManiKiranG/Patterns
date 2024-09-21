package patterns;

public class Pattern {
	public static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
         
	public static void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
    
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			for(int l=0;l<n-i-1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*n-2*i-1;k++) {
				System.out.print("*");
			}
			for(int l=0;l<i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			for(int l=0;l<n-i-1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*n-2*i-1;k++) {
				System.out.print("*");
			}
			for(int l=0;l<i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern101(int n) {
		for(int i=1;i<=2*n-1;i++) {
			int stars =i;
			if(i>n) {
				stars = 2*n-i;
			}
			for(int j=0;j<stars;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern11(int n) {
		int start = 1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				start =1;
			}
			else 
				start = 0;
			for(int j=1;j<=i;j++) {
				System.out.print(start + " ");
				start = 1- start;
			}
			System.out.println();
		}
		
	}

	static void pattern12(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<2*n-2*i-1;k++) {
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	static void pattern13(int n) {
		int num =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num + " ");
				num = num+1;
			}
			System.out.println();
		}
	}

	static void pattern14(int n) {
		
		for(int i=1;i<=n;i++) {
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n) {
		for(int i=1;i<=n;i++) {
			for(char j ='A';j<'A'+n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void pattern16(int n) {
		for(int i=0;i<n;i++) {
			for(int j =0; j<= i;j++) {
				System.out.print((char)(int)('A'+i));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
			int n =5;
			pattern16(n);
		}

}
