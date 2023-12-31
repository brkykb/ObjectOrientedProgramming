import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o,Movie a) {
        return o.getName().compareTo(a.getName());
    }
}
