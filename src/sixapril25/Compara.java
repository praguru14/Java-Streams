package sixapril25;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compara implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return  o1.name.compareTo(o2.name);
//        return 0;
    }
}


class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}

 class Main{
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("ACharlie", 35)
        );
//        Collections.sort(people,new Compara() );
people.sort(null);
        System.out.println(people);
    }
}

