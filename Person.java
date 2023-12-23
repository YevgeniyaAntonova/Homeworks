import javax.xml.namespace.QName;
import java.util.Arrays;

public class Person {
    String firstname;
    String lastname;
    int age;
    String sex;
    String [] interests;

    public Person(String firstname, String lastname, int age, String sex, String [] interests){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.interests = interests;
    }

    public static void main(String[] args) {
        Person man = new Person ("Artem","Antonov", 36, "male", new String[]{"bicycles", "mountains", "cars"});
        System.out.printf("man: %s %s, %d, %s, %s%n", man.firstname,man.lastname, man.age, man.sex, Arrays.toString(man.interests));

        Person woman = new Person("Yevgeniya", "Antonova", 33, "female", new String[] {"books", "mountains", "travel"});
        System.out.printf("woman: %s %s, %d, %s, %s%n", woman.firstname, woman.lastname, woman.age, woman.sex, Arrays.toString(woman.interests));
    }


}
