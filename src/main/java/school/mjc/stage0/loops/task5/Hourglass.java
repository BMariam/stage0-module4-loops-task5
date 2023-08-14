package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
		boolean heightIsEven = (0 == height % 2) ? true : false;
		int center = heightIsEven ? (height / 2 - 1) : (height / 2);
		for (int i = 0; i < height; ++i) {
			int distanceFromEdge = center - Math.abs(i - center);
			if (heightIsEven && i > center) {
				distanceFromEdge = center - Math.abs(i - center) + 1;
			}
			for (int j = 0; j < distanceFromEdge; ++j) {
				System.out.print(" ");
			}
			for (int j = 0; j < height - 2 * (distanceFromEdge); ++j) {
				System.out.print("8");
			}
			for (int j = 0; j < distanceFromEdge; ++j) {
				System.out.print(" ");
			}
			System.out.println();
		}
    }
}
