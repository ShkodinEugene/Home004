import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if(first.equals(second)){
            return 0;
        }
        return second.getBirthDate().compareTo(first.getBirthDate());
    }
}