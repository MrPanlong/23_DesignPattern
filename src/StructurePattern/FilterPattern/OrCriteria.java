package StructurePattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:24
 */
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(peoples);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(peoples);
        for (Person people : peoples) {
            if(!firstCriteriaItems.contains(people)){
                firstCriteriaItems.add(people);
            }
        }
        return firstCriteriaItems;
    }
}
