import java.util.*;

public class Thanos {

	public static void main(String[] args) {

		List<Hero> heroes = new ArrayList<>();
		heroes.add(new Hero("Hulk", 49));
		heroes.add(new Hero("Black Widow", 34));
		heroes.add(new Hero("Captain America", 100));
		heroes.add(new Hero("Thor", 1501));

		// TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
		Collections.sort(heroes);

		System.out.println("\nOrder by name:");
		showList(heroes);

		// TODO 2: Add a Comparator and sort by age (descending)

		boolean reverseOrder = true;

		class SortbyAge implements Comparator<Hero> {
			public int compare(Hero h1, Hero h2) {
				Integer i1 = h1.getAge();
				Integer i2 = h2.getAge();
				if (reverseOrder)
					return i2.compareTo(i1);
				else
					return i1.compareTo(i2);
			}
		}

		Collections.sort(heroes, new SortbyAge());

		System.out.println("\nOrder by age:");
		showList(heroes);
	}

	private static void showList(List<Hero> heroes) {
		for (Hero heroe : heroes) {
			System.out.println(heroe.getName() + ", " + heroe.getAge());
		}
	}
}