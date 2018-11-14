import java.util.ArrayList;

public class InsertionSort {

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
		// BEGING INSERTION SORT

		for (int i = 1; i < data.size(); i++) {
			double v = data.get(i);
			int j = i;
			while (j > 0 && data.get(j - 1) > v) {
				data.set(j, data.get(j - 1));
				j--;
			}
			data.set(j, v);
			System.out.print("\nStep-" + i + ": ");
			for (int k = 0; k < data.size(); k++) {
				System.out.print(data.get(k) + " ");
			}
		}
		// END OF BEGING INSERTION SORT

		// CETAK DATA AKHIR

		System.out.print("\nHASIL SORTING: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k) + " ");
		}
		return null;

	}
}
