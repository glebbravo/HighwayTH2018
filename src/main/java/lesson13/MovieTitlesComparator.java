package lesson13;


import java.util.Comparator;

public class MovieTitlesComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.title.compareTo(o2.title);
    }
}
