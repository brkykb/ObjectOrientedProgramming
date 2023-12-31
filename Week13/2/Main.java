import java.util.*;

public class Main {
        public static void main(String[] args){
            ArrayList<Movie> list=new ArrayList<Movie>();
            list.add(new Movie(8.3,"Force Awakens", 2015));
            list.add(new Movie(8.7,"Stars Wars", 1977));
            list.add(new Movie(8.8,"Empire Strikes Back", 1980));
            list.add(new Movie(8.4,"Returns of the Jedi", 1983));

            System.out.println("Sorted by rating: ");
            RatingCompare ratingCompare=new RatingCompare();
            Collections.sort(list,ratingCompare);
            for (Movie movie: list) {
                System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
            }

            System.out.println("\nSorted by name");
            NameCompare nameCompare = new NameCompare() ;
            Collections.sort(list,nameCompare);

            for (Movie movie: list) {
                System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
            }

            System.out.println("\nSorted by year");
            Collections.sort(list);

            for (Movie movie: list) {
                System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
            }
        }
}
