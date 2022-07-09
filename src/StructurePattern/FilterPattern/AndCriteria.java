package StructurePattern.FilterPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:23
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> peoples) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(peoples);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
