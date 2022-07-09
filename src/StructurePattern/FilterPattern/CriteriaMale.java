package StructurePattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:17
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> malePersons = new ArrayList<>();
        for (Person people : peoples) {
            if(people.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(people);
            }
        }
        return malePersons;
    }
}
