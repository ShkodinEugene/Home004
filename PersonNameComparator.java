import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if(first.equals(second)){
            return 0;
        }
        return first.getName().compareTo(second.getName());
    }
}