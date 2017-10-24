package eu.nsjg.programmingitems;

import java.util.List;
import java.util.Random;

import eu.nsjg.programmingitems.complex.BubbleSort;
import eu.nsjg.programmingitems.complex.ComplexProgramingItemStrategy;
import eu.nsjg.programmingitems.complex.SimpleShuffleShort;
import eu.nsjg.programmingitems.generate.ListPopulate;
import eu.nsjg.programmingitems.simple.Calculate;
import eu.nsjg.programmingitems.simple.Decide;
import eu.nsjg.programmingitems.simple.SimpleItemResult;
import eu.nsjg.programmingitems.simple.SimpleProgramingItemStrategy;

public class App {

	public final List<Integer> numbers;
	private final SimpleItemResult item;
	
	public App() {
		ListPopulate list = new ListPopulate(new Random());
		numbers = list.getNumbers(100, 0, 100);
		item = new SimpleItemResult();
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.print();
	}

	private void print() {
		System.out.println("A lista jelenleg" + numbers.size() + "elemû.");
		System.out.println("A lista tartalma:" + numbers);
		System.out.println(item.getResult(numbers, 10));
		System.out.println("--------");
		ComplexProgramingItemStrategy complex = new SimpleShuffleShort(numbers);
		System.out.println("A lista tartalma:" + numbers);
		System.out.println("A lista tartalma:" + complex.sort());
		System.out.println("--------");
		complex = new BubbleSort(numbers);
		System.out.println("A lista tartalma:" + numbers);
		System.out.println("A lista tartalma:" + complex.sort());
		

	
}
}