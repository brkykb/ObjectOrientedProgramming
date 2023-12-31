import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie o, Movie a) {
        return -(Double.compare(o.getRating(),a.getRating()));
    }
}
