package my.zone.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public static List<Movie> allMovies(){  return movieRepository.findAll();  }
}

public Optional<Movie> singleMovie(String imdbId) {
    return movieRepository.findAll(imdbId);
}