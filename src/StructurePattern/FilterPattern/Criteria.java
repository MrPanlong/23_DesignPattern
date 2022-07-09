package StructurePattern.FilterPattern;

import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:16
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> peoples);
}
