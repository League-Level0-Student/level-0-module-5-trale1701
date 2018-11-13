package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		//Single For-Loops
		//1
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		//2
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		//3
		for (int i = 2; i <= 100; i++) {
			if (i%2==0) {System.out.println(i);}
		}
		
		//4
		for (int i = 1; i <= 99; i++) {
			if (i%2!=0) {System.out.println(i);}
		}
		
		//5
		for (int i = 1; i <= 500; i++) {
			if (i%2!=0) {System.out.println(i + " is odd.");}
			else {System.out.println(i + " is even.");}
		}
		
		//6
		for (int i = 0; i <= 777; i++) {
			if (i%7==0) {System.out.println(i);}
		}
		
		//7
		int year = 0;
		for (int i = 2004; i <= 2018; i++) {
			
			System.out.println("In " + i + ", I was " + year + " old");
			year = year + 1;
		}
		
		//Nested For-Loops
		//1
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		//2
		
	}

}
