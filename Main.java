
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    private final static int COUNT = 5;

    public static void main(String[] args) {
        Person[] persons = new Person[COUNT];
        persons[0] = new Person("Valeri",    148, 1904, Calendar.FEBRUARY, 2);
        persons[1] = new Person("Polina",    147, 1907, Calendar.OCTOBER, 8);
        persons[2] = new Person("Aleksandr", 125, 1913, Calendar.MARCH, 8);
        persons[3] = new Person("Mixail",    175, 1919, Calendar.NOVEMBER, 10);
        persons[4] = new Person("Ivan",      135, 1920, Calendar.JUNE, 8);

        System.out.println("Not sorted :");
        print(persons);

        System.out.println();

        System.out.println("Sorted by age :");
        Arrays.sort(persons, new PersonAgeComparator());
        print(persons);

        System.out.println();

        System.out.println("Sorted by name :");
        Arrays.sort(persons, new PersonNameComparator());
        print(persons);
    }

    private static void print(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}