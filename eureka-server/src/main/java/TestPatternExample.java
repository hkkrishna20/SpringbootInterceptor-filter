import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Coord {

	int x;
	int y;

	public Coord(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}

public class TestPatternExample {

	public static List<Coord> testList(int[] xs, int[] ys) {
		List<Coord> list = new ArrayList<Coord>();

		for (int i = 0; i < xs.length; i++) {
			Coord co = new Coord(xs[i], ys[i]);
			list.add(co);

		}
		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		int integer = sc.nextInt();

		List<Coord> list = new ArrayList<Coord>();

		if (integer == 1) {
			int[] xs = { 1, 2, 2, 1 };
			int[] ys = { 1, 1, 2, 2 };
			list = testList(xs, ys);
		}
		if (integer == 2) {
			int[] xs = { 1, 1, 2, 2, 3, 4, 4, 3, 3, 4, 4, 3, 2, 2, 1, 1 };
			int[] ys = { 1, 2, 2, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 3, 3, 4 };
			list = testList(xs, ys);
		}
		if (integer == 3) {
			int[] xs = { 1, 2, 2, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 7, 7, 8, 8, 7, 6, 6, 5, 5,
					5, 5, 6, 6, 7, 8, 8, 7, 7, 8, 8, 7, 6, 6, 5, 5, 4, 3, 3, 4, 4, 4, 3, 3, 2, 2, 1, 1, 1, 2, 2, 1 };
			int[] ys = { 1, 1, 2, 2, 3, 4, 4, 3, 3, 4, 4, 3, 2, 2, 1, 1, 1, 6, 2, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 3, 3, 4,
					5, 6, 6, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 7, 7, 8, 8, 8, 7, 7, 6, 5, 5, 6, 6, 5, 5, 6, 7, 7, 8, 8 };
			list = testList(xs, ys);
		}
		if (integer == 4) {

			int[] xs = { 1, 1, 2, 2, 3, 4, 4, 3, 3, 4, 4, 3, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 3, 3, 4,
					5, 6, 6, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 7, 7, 8, 8, 8, 7, 7, 6, 5, 5, 6, 6, 5, 5, 6, 7, 7, 8, 8 };
			int[] ys = { 8, 7, 7, 8, 8, 8, 7, 7, 6, 6, 5, 5, 5, 6, 6, 5, 4, 4, 3, 3, 2, 1, 1, 2, 2, 1, 1, 2, 3, 3, 4, 4,
					4, 4, 3, 3, 2, 1, 1, 2, 2, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 7, 7, 8 };
			list = testList(xs, ys);
		}

		System.out.println(list);

	}
}
