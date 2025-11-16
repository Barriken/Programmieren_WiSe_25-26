package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {
		
		int min=0;
		int max=0;
		int avg=0;
		int data[] = {
			    42, 87, 13, 65, 90, 22, 7, 54, 38, 62, 64, 31, 76, 48, 15, 70, 3, 81, 24, 93,
			    11, 60, 45, 57, 28, 85, 17, 96, 2, 73, 33, 68, 9, 78, 50, 91, 19, 35, 4, 26,
			    8, 63, 47, 71, 52, 39, 4, 95, 23, 66, 88, 41, 59, 12, 84, 18, 77, 25, 46, 69,
			    34, 53, 4, 98, 43, 10, 56, 20, 97, 16, 6, 75, 27, 40, 83, 21, 61, 49, 32, 67,
			    14, 58, 29, 94, 1, 62, 5, 79, 36, 82, 37, 4, 44, 72, 92, 51, 55, 74, 86, 14
			};

		//Überarbeiten
		// 1
//		for (int i=0; i<data.length; i++) {
//			System.out.print(data[i] + ", ");
//			if ((i+1)%10 == 0) {
//				System.out.println();
//			}
//		}
		
		
		// Test Push for GitHub.com
		//2
		for (int i=0; i<data.length; i++) {
			min = min>data[i]?data[i]:min;
			max = max<data[i]?data[i]:max;
		}
		System.out.println("Min: " + min + "\nMax: " + max);
		
		//3
		for (int i=0; i<data.length; i++) {
			avg = avg + data[i];
			if ((i+1) == data.length) {
				avg = (avg*100)/++i;
				float avgWithCommas = avg / 100f;
				System.out.println("Durchschnitt: " + avgWithCommas);
			}
		}
		
		//4
		int size=0;
		
		for (int i=0; i<data.length; i++) {
			if ((data[i]%5 == 0) & i!=0) {
				++size;
			}
		}
		
		int[] newData = new int[size];
		int indicator=0;
		
		for (int i=0; i<data.length; i++) {
			if ((data[i]%5)==0) {
				newData[indicator] = data[i];
				++indicator;
			}
		}
		System.out.println();
		for (int i=0; i<newData.length; i++) {
			System.out.print(newData[i] + " ");
		}
		
		//5
		int occurencesOuter=0;
		int mode=0;
		int occurencesTotal=0;
		
		for (int i=0; i<data.length; i++) {
			int occurencesInner=0;
			for (int j=0; j<data.length; j++) {
				if (data[j] == data[i]) {
					++occurencesInner;
				}
				if ((j+1) == data.length) {
					if (occurencesInner>occurencesTotal) {
						mode = data[i];
						occurencesTotal = occurencesInner;
					}
				}
			}
		}
		System.out.println("\n\nModus: " + mode + "   Häufigkeit: " + occurencesTotal);
	}

}
