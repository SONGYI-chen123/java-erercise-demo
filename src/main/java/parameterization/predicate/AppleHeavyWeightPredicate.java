package parameterization.predicate;

import parameterization.Apple;
import parameterization.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.getWeight()>150;
    }
}
