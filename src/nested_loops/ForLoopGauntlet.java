package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		//Single For-Loops
		//1
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//2
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		//3
		for (int i = 2; i <= 100; i++) {
			if (i%2==0) {System.out.println(i);}
		}
		System.out.println();
		
		//4
		for (int i = 1; i <= 99; i++) {
			if (i%2!=0) {System.out.println(i);}
		}
		System.out.println();
		
		//5
		for (int i = 1; i <= 500; i++) {
			if (i%2!=0) {System.out.println(i + " is odd.");}
			else {System.out.println(i + " is even.");}
		}
		System.out.println();
		
		//6
		for (int i = 0; i <= 777; i++) {
			if (i%7==0) {System.out.println(i);}
		}
		System.out.println();
		
		//7
		int year = 0;
		for (int i = 2004; i <= 2018; i++) {
			
			System.out.println("In " + i + ", I was " + year + " old");
			year = year + 1;
		}
		System.out.println();
		
		//Nested For-Loops
		//1
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		
		//2
		for (int i = 0; i <= 6; i = i + 3) {
			for (int j = 1; j <= 3; j++) {
			System.out.print(i + j + " ");
		}
			System.out.println();
		}
		System.out.println();
		
		//3
		for (int i = 0; i <= 90; i = i + 10) {
			for (int j = 1; j <= 10; j++) {
			System.out.print(i + j + " ");
		}
			System.out.println();
		}
		System.out.println();
		
		//4
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
