import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface ReferenceTest {
    public  List<String>  mapListTo(List<Integer> integerList);
    public static String mapList(int a){
        return String.valueOf(a);
    }
}
