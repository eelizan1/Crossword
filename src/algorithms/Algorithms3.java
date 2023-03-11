package algorithms;

import java.util.*;

public class Algorithms3 {
	
	public static List<Person> _People = new ArrayList<Person>() {
    	{
	    	add(new Person("Amy", "Monroe", 54));
	    	add(new Person("Amy", "Duval", 54));
	    	add(new Person("Joe", "Conrad", 14));
	    	add(new Person("Amy", "Jenkins", 34));
	    	add(new Person("Bill", "Monroe", 34));
	    	add(new Person("Amy", "Smith", 34));
	    	add(new Person("Joe", "Johnson", 14));
    	}
    }; 

	public static void main(String[] args) {
		List<String> sortedPeople = sortByLastNameThenFirstName(_People);
		System.out.println(sortedPeople);

		List<String> countByFirstName = countsByFirstName(_People);
		System.out.println(countByFirstName);
	}

	// Do not alter method signatures or types//
	// Write code to return a list of strings sorted by last name,
	// then first name, then age. Use the format: "{LastName} - {FirstName} - {Age}"
	//
	// Example string: Burgundy - Ron - 43
    public static List<String> sortByLastNameThenFirstName(List<Person> people)
    {
		Collections.sort(people,
				Comparator.comparing(Person::getLastName) // sort by last name
				.thenComparing(Person::getFirstName) // sort by first name
				.thenComparing(Person::getAge)); // sort by age

		// Convert each Person object to a string in the format "{LastName} - {FirstName} - {Age}"
		List<String> result = new ArrayList<>();
		for (Person person : people) {
			String formattedPerson = String.format("%s - %s - %d", person.getLastName(), person.getFirstName(), person.getAge());
			result.add(formattedPerson);
		}

		return result;
    }

	// Write code to return a list of strings string with a count of the number of times each first name occurs, ordered by occurence.
	// Use this format: "{name}, {count}"
	//
	// Example string: Ron, 2
    public static List<String> countsByFirstName(List<Person> people)
    {
		Map<String, Integer> nameCounts = new HashMap<>();

		// Count the occurrences of each first name
		for (Person person : people) {
			String firstName = person.getFirstName();
			int count = nameCounts.getOrDefault(firstName, 0);
			nameCounts.put(firstName, count + 1);
		}

		// Sort the first names by occurrence
		List<String> sortedNames = new ArrayList<>(nameCounts.keySet());
		Collections.sort(sortedNames, (name1, name2) -> nameCounts.get(name2) - nameCounts.get(name1));

		// Create the result strings
		List<String> result = new ArrayList<>();
		for (String name : sortedNames) {
			int count = nameCounts.get(name);
			result.add(name + ", " + count);
		}

		return result;
    }
}

class Person
{
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
    
    public Person () {}
    
    public Person (String FirstName, String LastName, int Age) {
    	firstName = FirstName;
    	lastName = LastName;
    	age = Age;
    }
}