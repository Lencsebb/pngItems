package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Select implements SimpleProgramingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if (divider == 0) {
			throw new IllegalArgumentException("kakifej, null�val nem osztunk");
		}
		int i = 0;
		while (numbers.get(i) % divider != 0)
			i++;
		return i;
	}

}
