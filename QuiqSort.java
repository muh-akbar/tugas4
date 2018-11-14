import java.util.ArrayList;

public class QuiqSort {

	private static int high;

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
		int low = 0, high = 0;
		ArrayList<Double> OUTPUT = sort(data, 0, data.size() - 1);
		System.out.println("\nHasil Sorting : " + data.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data, int low,
			int high) {
		if ((data == null) || (data.size() == 0)) {
			return data;
		}
		if (low >= high) {
			return data;
		}
		int mid = low + (high - low) / 2;
		double pivot = data.get(mid);

		int i = low, j = high;

		while (i <= j) {
			while (data.get(i) < pivot) {
				i++;
			}
			while (data.get(j) > pivot) {
				j--;
			}
			if (i <= j) {
				swap(data, i, j);
				i++;
				j--;

			}
		}
		if (low < j) {
			sort(data, low, j);
		}
		if (high < j) {
			sort(data, i, high);
		}

		System.out.print("\nStep->: ");
		for (int k = 0; k < data.size(); k++) {
			System.out.print(data.get(k));
		}

		return data;
	}

	private static void swap(ArrayList<Double> data, int x, int y) {
		double temp = data.get(x);
		data.set(x, data.get(y));
		data.set(y, temp);

	}

}
