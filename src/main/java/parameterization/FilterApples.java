package parameterization;

import parameterization.predicate.AppleHeavyWeightPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApples {
    public static void main(String ...args){
        List<Apple> apples = Arrays.asList(new Apple("GREEN",80),
                new Apple("GREEN",155),
                new Apple("RED",120));
        //predicate
        List<Apple> heavyApples = filterApples(apples,new AppleHeavyWeightPredicate());

        //Anonymous class
        List<Apple> redApples = filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "RED".equals(apple.getColor());
            }
        });
    }

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
