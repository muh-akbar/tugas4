import java.util.ArrayList;

public class ShellSort {

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
		int jarak = data.size();
		boolean end;
		while (jarak > 1) {
			jarak /= 2;
			end = false;
			while (end == false) {
				end = true;
				for (int j = 0; j < data.size() - jarak; j++) {
					if (data.get(j) > data.get(j + jarak)) {
						int tukar = 0;
						data.set(tukar, data.get(j));
						data.set(j, data.get(j + jarak));
						data.set(j + jarak, data.get(tukar));
						end = false;
					}
				}
				System.out.print("\nstep-" + jarak + ": ");
				for (int k = 0; k < data.size(); k++) {
					System.out.print(data.get(k) + " ");
				}
			}

		}

		System.out.print("\nData setelah urut: ");
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i));
		}

		return null;
	}

}
