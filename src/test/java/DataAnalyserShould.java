import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DataAnalyserShould {

    private List<Person> people;
    private DataAnalyser analyser;

    @Before
    public void setUp() {
        people = asList(
                new Person("Ronald", Gender.MALE, 28),
                new Person("Sally", Gender.FEMALE, 23),
                new Person("Bob", Gender.MALE, 47),
                new Person("Sandra", Gender.FEMALE, 18),
                new Person("Phil", Gender.MALE, 19)
        );

        analyser = new DataAnalyser(people);
    }

    @Test
    public void get_all_males() {
        List<Person> allMales = analyser.whereGenderIs(Gender.MALE);


        assertThat(allMales, is(asList(
                new Person("Ronald", Gender.MALE, 28),
                new Person("Bob", Gender.MALE, 47),
                new Person("Phil", Gender.MALE, 19)
        )));
    }

    @Test
    public void get_all_females() {
        List<Person> allMales = analyser.whereGenderIs(Gender.FEMALE);


        assertThat(allMales, is(asList(
                new Person("Sally", Gender.FEMALE, 23),
                new Person("Sandra", Gender.FEMALE, 18)
        )));
    }

    @Test
    public void get_all_who_are_older_than_20() {
        List<Person> olderThanTwenty = analyser.whereOlderThan(20);


        assertThat(olderThanTwenty, is(asList(
                new Person("Ronald", Gender.MALE, 28),
                new Person("Sally", Gender.FEMALE, 23),
                new Person("Bob", Gender.MALE, 47)
        )));
    }
}
