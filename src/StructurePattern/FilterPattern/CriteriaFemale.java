package StructurePattern.FilterPattern;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:20
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person people : peoples) {
            if(people.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(people);
            }
        }
        return femalePersons;
    }
}
