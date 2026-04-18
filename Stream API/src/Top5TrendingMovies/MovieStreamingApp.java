package Top5TrendingMovies;

import java.util.*;
        import java.util.stream.*;

public class MovieStreamingApp {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("MovieA", 8.5, 2023),
                new Movie("MovieB", 9.0, 2024),
                new Movie("MovieC", 8.7, 2022),
                new Movie("MovieD", 9.2, 2024),
                new Movie("MovieE", 8.9, 2023),
                new Movie("MovieF", 9.1, 2021),
                new Movie("MovieG", 8.3, 2024)
        );

        List<Movie> topMovies = movies.stream()
                .filter(m -> m.year >= 2022)
                .sorted((m1, m2) -> {
                    if (m2.rating == m1.rating) {
                        return m2.year - m1.year;
                    }
                    return Double.compare(m2.rating, m1.rating);
                })
                .limit(5)
                .collect(Collectors.toList());

        topMovies.forEach(System.out::println);
    }
}