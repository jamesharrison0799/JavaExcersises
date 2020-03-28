package listSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static ArrayList<Prop> props = new ArrayList<>();

	public static void main(String[] args) {
		createData();
		sortPrint();
	}

	public static void createData() {

		Prop prop1 = new Prop("Asha", 50, 0, 1);
		props.add(prop1);
		Prop prop2 = new Prop("Joanne", 40, 1, 1);
		props.add(prop2);
		Prop prop3 = new Prop("Rayna", 30, 1, 1);
		props.add(prop3);
		Prop prop4 = new Prop("Ashinda", 60, 12, 20);
		props.add(prop4);
	}

	public static void sortPrint() {
		Scanner c = new Scanner(System.in);
		int choice = c.nextInt();
		// sort by host
		if (choice == 1) {
			
			Comparator<Prop> cmp = Comparator.comparing(Prop::getHost);
			Collections.sort(props,cmp);
			System.out.println(cmp);
			for(Prop i:props) {
				System.out.print(i.getValues() + "\n\n");
			}
			
		} else if (choice == 2) { // sort by price low - high
			
			Comparator<Prop> cmp = Comparator.comparing(Prop::getPrice);
			Collections.sort(props,cmp);
			for(Prop i:props) {
				System.out.print(i.getValues() + "\n\n");
			}
		} else if (choice == 3) {// sort by price high - low
			Comparator<Prop> cmp = Comparator.comparing(Prop::getPrice);
			Collections.sort(props,Collections.reverseOrder(cmp));
			for(Prop i:props) {
				System.out.print(i.getValues() + "\n\n");
			}
		}
		c.close();
	}
}
