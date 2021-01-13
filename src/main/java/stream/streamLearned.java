package stream;

import parameterization.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamLearned {

    public void splitString(List<String> list) {
        //以，将字符串进行拆分，返回数组到新流中
        Stream<String[]> stringArray = list.stream().map(s -> s.split(","));
        //以，将字符串进行拆分，返回一个流Stream<String>，返回到新流中
        Stream<Stream<String>> newStream = list.stream().map(s -> Arrays.stream(s.split(",")));
        //返回一个新流，将每一个元素添加到新流中，与map相比，进行了扁平化操作
        Stream<String> flatMapStringStream = list.stream().flatMap(s -> Arrays.stream(s.split(",")));
    }

    public List<String> naturalSort(List<String> list) {
        //自然排序，以流中实现的compareTo（）方法进行排序
//        return list.stream().sorted().collect(Collectors.toList());

        //自然逆序
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Apple> sort(List<Apple> apples) {
//        return apples.stream()
//                .sorted((x,y) -> {
//                    return Integer.compare(x.getWeight(), y.getWeight());
//                })
//                .collect(Collectors.toList());

        return apples.stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .collect(Collectors.toList());
    }

    public List<Apple> filterGreenApple(List<Apple> apples) {
        //filter在流中排除某些元素
        return apples.stream()
                .filter(apple -> "GREEN".equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    public List<Apple> limit(List<Apple> apples) {
        //limit返回流中前几个元素
        return apples.stream().limit(3).collect(Collectors.toList());
    }

    public List<Apple> skip(List<Apple> apples) {
        //skip去掉流中前几个元素
        return apples.stream().skip(3).collect(Collectors.toList());
    }

    public List<String> distinct(List<String> list) {
        //distinct去掉重复的元素
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
