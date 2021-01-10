package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamLearned {

    public void splitString(List<String> list) {
        //以，将字符串进行拆分，返回数组到新流中
        Stream<String[]> stringArray = list.stream().map(s -> s.split(","));
        //以，将字符串进行拆分，返回一个流Stream<String>，返回到新流中
        Stream<Stream<String>> newStream = list.stream().map(s -> Arrays.stream(s.split(",")));
    }
}
