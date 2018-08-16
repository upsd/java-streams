import java.util.ArrayList;
import java.util.List;

public class DataAnalyser {

    private List<Person> people;

    public DataAnalyser(List<Person> people) {
        this.people = people;
    }

    public List<Person> whereGenderIs(Gender gender) {
        List<Person> males = new ArrayList<>();

        for (Person p: people) {
            if (p.gender() == gender) {
                males.add(p);
            }
        }
        return males;
    }

    public List<Person> whereOlderThan(int age) {
        List<Person> older = new ArrayList<>();

        for (Person p: people) {
            if (p.age() > age) {
                older.add(p);
            }
        }
        return older;
    }
}
