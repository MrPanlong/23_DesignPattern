package StructurePattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 14:14
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        CriteriaMale male = new CriteriaMale();
        CriteriaFemale female = new CriteriaFemale();
        CriteriaSingle single = new CriteriaSingle();

        AndCriteria singleMale = new AndCriteria(single, male);
        OrCriteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Male: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales:");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Females:");
        printPersons(singleOrFemale.meetCriteria(persons));
    }
    public static void printPersons(List<Person> peoples){
        for (Person people : peoples) {
            System.out.println("person：[Name: "+people.getName()
            +", Gender: "+people.getGender()
            +",Marital Status: "+people.getMaritalStatus()
            +" ]");
        }
    }
}
