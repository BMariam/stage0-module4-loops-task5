package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
		for (int i = 1; i <= sideLength; ++i) {
			if (1 == i || sideLength == i) {
				for (int j = 1; j <= sideLength; ++j) {
					System.out.print("8");
				}
			} else {
				System.out.print("8");
				for (int j = 2; j < sideLength; ++j) {
					System.out.print(" ");
				}
				System.out.print("8");
			}
			System.out.println();
		}
    }
}
