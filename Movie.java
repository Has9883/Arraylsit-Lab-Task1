import java.util.ArrayList;
import java.util.Objects;

public class Movie {
    private String title;
    private double rating;
    private int date;
    private String director;

    public Movie(String title, double rating, int date, String director) {
        this.title = title;
        this.rating = rating;
        this.date = date;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", date=" + date +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Double.compare(rating, movie.rating) == 0 && date == movie.date && Objects.equals(title, movie.title) && Objects.equals(director, movie.director);
    }


    public double getrating() {
        return rating;
    }

    public void setrating(double rating) {
        this.rating = rating;
    }


}
