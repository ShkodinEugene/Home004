import java.util.Calendar;
import java.time.LocalDate;

public class Person implements Comparable<Person>{
	private  String name;
    private  LocalDate birthday ;
    private  int documentID;
    
    public Person(String name, int documentID, int year, int month, int date) {
        this.name = name;
        this.birthday = LocalDate.of(year, month, date);
        this.documentID = documentID;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDocument() {
        return documentID;
    }
    
    public LocalDate getBirthDate() {
        return LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (documentID != person.documentID) return false;
        if (!name.equals(person.name)) return false;

        return birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + documentID;
        result = 31 * result + birthday.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person " + "name: " + name + ", ID:" + documentID + ", birthday: " + this.birthday.toString() + ";";
    }

    @Override
    public int compareTo(Person person) {
        if (this.equals(person)) {
            return 0;
        }

        if (this.getBirthDate().compareTo(person.getBirthDate()) == 0) {
            Integer firstId = new Integer(this.getDocument());
            Integer secondId = new Integer(person.getDocument());
            return firstId.compareTo(secondId);
        }

        return person.getBirthDate().compareTo(this.getBirthDate());
    }
}
