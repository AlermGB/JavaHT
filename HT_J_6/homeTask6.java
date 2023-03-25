package HT_J_6;
import java.util.ArrayList;

public class homeTask6 {
    public static void main(String[] args) {
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Иван", "Иванов", 33, male, "master"));
        persons.add(new Person("Иванка", "Трамп", 10, female, "masteress"));
        persons.add(new Person("Брюс", "Ли", 35, male, "fighter"));
        persons.add(new Person("Тони", "Старк", 53, male, "IronM"));
        persons.add(new Person("Иван", "Ивановцев", 33, male, "masterOK"));
        persons.add(new Person("Иван", "Бананов", 13, male, "bananan"));        
        for (Person person : persons) {
            if (person.getAge() > 20) {
                System.out.println(person.getInfo());
            }
        }       
    }    
}
