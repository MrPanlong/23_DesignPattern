package StructurePattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:21
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person people : peoples) {
            if(people.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(people);
            }
        }
        return singlePersons;
    }
}
