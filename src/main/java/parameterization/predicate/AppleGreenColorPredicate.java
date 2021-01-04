package parameterization.predicate;

import parameterization.Apple;
import parameterization.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return "GREEN".equals(apple.getColor());
    }
}
