package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class streams {

	// @Test
	public void streamsorg() {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();

		names.add("Mahendiran");
		names.add("Manoj");
		names.add("Mitran");
		names.add("vijay");
		names.add("kumar");
		names.add("Loki");
		names.add("vikram");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("M")) {
				count++;

			}
		}

		System.out.println(count);

	}

	// @Test
	public void stream() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Mahendiran");
		names.add("Manoj");
		names.add("Mitran");
		names.add("vijay");
		names.add("kumar");
		names.add("Loki");
		names.add("vikram");

		long c = names.stream().filter(s -> s.startsWith("M")).count();
		System.out.println(c);

		// long d =
		// Stream.of("Mahendiran","Vijay","Manoj","VIkram","Mosses").filter(s->s.startsWith("M")).count();
		// if intermediate operation contain more than one values use like this.
		long d = Stream.of("Mahendiran", "Vijay", "Manoj", "VIkram", "Mosses").filter(s -> {
			s.startsWith("M");
			return false; // it does not count if the intermediate component is failed.
		}).count();

		System.out.println(d);

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	// @Test
	public void StreamMaap() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Mahendiran");
		names.add("Harsha");
		names.add("Raj");

		// print all the names which ended up on "A"
		Stream.of("Mahendiran", "Vijay", "Manojan", "VIkraman", "Mosses").filter(s -> s.endsWith("n"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// print sorted names
		List<String> names1 = Arrays.asList("Mahendiran", "Vijay", "Manojan", "VIkraman", "Mosses");

		names1.stream().filter(s -> s.startsWith("M")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// largest number in array.
		names1.stream().filter(s -> s.startsWith("M")).limit(2).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		Stream<String> newnames = Stream.concat(names.stream(), names1.stream());

		newnames.sorted().forEach(s -> System.out.println(s));

		boolean flag = newnames.anyMatch(s -> s.equalsIgnoreCase("Mahendiran"));

		System.out.println(flag);

		Assert.assertTrue(flag);

	}

	@Test
	public void StreamCollect() {

		// Print sorted 2nd name using collect()
		List<String> newname = Stream.of("Mahendiran", "Vijay", "Manojan", "VIkraman", "Mosses")
				.filter(s -> s.endsWith("n")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(newname.get(2));

		// Print non-duplicate values
		List<Integer> val = Arrays.asList(1, 3, 4, 4, 5, 7, 8, 8, 9);
		List<Integer> dis = val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(dis);

		// Print second smallest number
		List<Integer> values = Arrays.asList(1, 3, 4, 4, 5, 7, 8, 8, 9);
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(1));

		// Print second largest number in Array //Comparator.reverseOrder()
		List<Integer> values1 = Arrays.asList(1, 3, 4, 4, 5, 7, 8, 8, 9);
		List<Integer> li1 = values.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(li1.get(1));

	}

}
