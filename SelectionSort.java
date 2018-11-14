import java.util.ArrayList;

public class SelectionSort {

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
		System.out.print("INPUT: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k) + " ");
		}

		// BEGIN SELECTION SORT
		for (int i = 0; i < data.size() - 1; i++) {
			double minimum = data.get(i);
			int posisiMinimum = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(j) < minimum) {
					minimum = data.get(j);
					posisiMinimum = j;
				}
			}
			if (posisiMinimum != i) {
				double tempBox = data.get(i);
				data.set(i, data.get(posisiMinimum));
				data.set(posisiMinimum, tempBox);

			}
			// CETAK PROGRESS
			System.out.print("\nstep-" + i + ": ");
			for (int k = 0; k < data.size(); k++) {
				System.out.print(data.get(k) + " ");
			}
		}
		// END OF SELECTION SORT

		// CETAK DATA AKHIR
		System.out.print("\nDATA HASIL SORTING: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k) + " ");
		}

		return null;
	}

}
