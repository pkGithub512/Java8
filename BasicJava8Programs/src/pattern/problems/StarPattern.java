package pattern.problems;

public class StarPattern {

	public static void main(String[] args) {
		printPatter(5);
		printPatter1(5);
		printPatter2(5);
		printPatter3(5);
		printPatter4(5);
	}
	//Outer loop tells us that how many rows will be there.Inner loop tells us how many columns will be there.
	//Increasing Triangle - for(int j=0; j<i; j++)
	//Decreasing Triangle - for(int j=1; j<n; j++)
	//Right Side Triangle - two forloop is required, 1. Decreasing Space 2. Increasing star
	//Right Side Traigle Case 2 - 1. Increasing Space 2. Decreasing Star
	//Hill Patter - 1. Decreasing Space 2. Increasing Star 3. Increasing Star
	//Reverse Hill Patter - 1. Increasing space 2. Decreasing Star 3. Decreasing Star
	//Diamong Pattern - Add Hill Pattern & Reverse Hill Pattern
	public static void printPatter(int num){
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				System.out.print(j + " " );
			}
			System.out.println(" ");
		}
	}
	public static void printPatter1(int num){
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i + " " );
			}
			System.out.println(" ");
		}
	}
	public static void printPatter2(int num){
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i + " " );
			}
			System.out.println(" ");
		}
	}
	public static void printPatter3(int num){
		for(int i=1; i<=num; i++){
			for(int j=i; j<=num; j++){
				System.out.print(j + " " );
			}
			System.out.println(" ");
		}
	}
	public static void printPatter4(int num){
		
		for(int i=num; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print(j + " " );
			}
			System.out.println(" ");
		}
	}

}
