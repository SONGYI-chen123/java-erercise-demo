package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public <T,R> List<R> map(List<T> list, Function<T,R> f) {
        List<R> rs = new ArrayList<>();
        for (T t:list) {
            rs.add(f.apply(t));
        }
        return rs;
    }

    List<Integer> l = map(Arrays.asList("lambdas","in","action"),
            (String s) -> s.length()); //function接口apply方法的实现，每个字符串和其长度一一映射
}
