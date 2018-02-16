package lesson13;

public class Movie implements Comparable<Movie> {
    public double score;
    public String title;

    public Movie (String title, double score){
        this.title = title;
        this.score = score;
    }

    @Override
    public int compareTo(Movie m) {
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "score=" + score +
                ", title='" + title + '\'' +
                '}';
    }
}

