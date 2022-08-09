import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Danny", 6, 56, new HashSet<>(Arrays.asList("eat", "run", "sleep")));
        DomesticCat cat = new DomesticCat("Garfield", 8, 90, new HashSet<>(Arrays.asList("sleep", "watch Tv", "eat")));

        Human mother = new Human("Arzu","Ismayilova",1975, 90, null);
        Human father = new Human("Senan","Ismayilov",1975, 94, null);
        Human child = new Human("Elnur","Ismayilov",2000,94, null);
        Human child1 = new Human("Emil","Ismayilov",1996,92, null);
        Human child2 = new Human("Elvin","Ismayilov",1996,92, null);
        Family family = new Family(mother, father);

        family.addChild(child);
        family.addChild(child1);
        family.addChild(child2);

        family.setPets(new HashSet<>(Arrays.asList(dog, cat)));

        System.out.println(family.deleteChild(2));

        family.deleteChild(child1);                      // the method will delete child1 object and all its duplicates (if any, by mistaken).

        Human child3 = family.bornChild();               // a newborn child automatically will be added to the family.
        System.out.println(child3);
        child3.greetPets();
        child3.describePets();
        child3.feedPets(false);
        System.out.println(child3.getFamily().getPets());

        child.setSchedule(new LinkedHashMap<>() {{ put(DayOfWeek.MONDAY.name(), "do homework");   //Insertion is less than selection and an ordered version is needed.
            put(DayOfWeek.TUESDAY.name(), "read the materials");                                  //That's why I used LinkedHashMap
            put(DayOfWeek.WEDNESDAY.name(), "finish homework");
            put(DayOfWeek.THURSDAY.name(), "take a walk");
            put(DayOfWeek.FRIDAY.name(), "read the materials");
            put(DayOfWeek.SATURDAY.name(), "go to the swimming pool");
            put(DayOfWeek.SUNDAY.name(), "go out with friends");}});
        System.out.println(child.getSchedule());
    }
}
