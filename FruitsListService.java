package fruits;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FruitsListService {

	public static List<String> addFruitsToList(String fruits) {

		String[] str = fruits.split(",");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i].toLowerCase());
		}
		List<String> list = new ArrayList<String>(set);
		return list;

	}

	public static int searchFruitInList(List<String> list, String fruit) {

		if (list.contains(fruit)) {
			return list.indexOf(fruit);
		} else {
			return -1;
		}
	}

	public static int searchFruitInListIgnoreCase(List<String> list, String fruit) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(fruit)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<String> list = addFruitsToList("mango,apple,cherry,mango,Mango");
		System.out.println(searchFruitInList(list, "mAngo"));
		System.out.println(searchFruitInListIgnoreCase(list, "mAngo"));

	}
}
