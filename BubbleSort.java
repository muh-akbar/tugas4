import java.util.ArrayList;

public class BubbleSort {
	public static void main(String[] args) {
		ArrayList<Double> data = new ArrayList<Double>();
		data.add(5.0);
		data.add(2.0);
		data.add(8.0);
		data.add(1.0);
		data.add(2.0);
		data.add(9.0);
		data.add(45.0);
		data.add(2.0);
		data.add(3.0);
		data.add(8.0);
		data.add(6.0);
		data.add(4.0);
		data.add(3.0);

		// CETAK DATA AWAL
		System.out.print("INPUT: " + data.toString());
		ArrayList<Double> OUTPUT = sort(data);
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		int swapped = 1;
		for (int i = data.size() - 1; i >= 0 && data.size() - 1 >= swapped; i--) {
			swapped = 0;
			for (int j = 0; j <= i - 1; j++) {
				if (data.get(j) > data.get(j + 1)) {
					double temp = data.get(j);
					data.set(j, data.get(j + 1));
					data.set(j + 1, temp);
					swapped = 1;
				}
			}
			System.out.print("\nstep->: ");
			for (int k = 0; k < data.size(); k++) {
				System.out.print(data.get(k) + " ");
			}
		}
		// END OF BEGING BUBBLE SORT

		// CETAK DATA AKHIR

		System.out.print("\nDATA HASIL SORTING: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k) + " ");
		}
		return null;
	}

}
