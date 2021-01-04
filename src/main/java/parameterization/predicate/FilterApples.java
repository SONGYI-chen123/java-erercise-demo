package parameterization.predicate;

import parameterization.Apple;

import java.util.ArrayList;
import java.util.List;

public class FilterApples {
    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
