package predicate;

import java.util.function.Predicate;

public class UsePredicate {
    Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();//函数式接口predicate应用筛选出不为空的字符串
}
