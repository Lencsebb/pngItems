package eu.nsjg.programmingitems.simple;

import java.util.List;

public interface SimpleProgramingItemStrategy {

	Object getResult(List<Integer>numbers, int divider);
	
	default Object getResult(List<Integer>numbers) {
			return getResult(numbers, 0);

}
}
