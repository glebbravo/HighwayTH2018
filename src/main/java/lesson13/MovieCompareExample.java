package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieCompareExample {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.3));
        list.add(new Movie("C film", 2.2));
        list.add(new Movie("D film", 2.1));
        Collections.sort(list, new MovieTitlesComparator());
        System.out.println(list);
    }
}
