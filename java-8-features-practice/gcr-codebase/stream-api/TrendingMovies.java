package streamApi;
import java.util.*;
public class TrendingMovies {

	public static void main(String[] args) {
//		Movie movie = new Movie();
		
		List<Movie> list = new ArrayList<>();
		 list.add(new Movie( 8.5f, 2022));
	        list.add(new Movie( 9.0f, 2024));
	        list.add(new Movie(7.2f, 2021));
	        list.add(new Movie( 8.5f, 2023));
	        list.add(new Movie( 6.9f, 2020));
		list.stream().filter(x -> x.rating>7.5).sorted(Comparator.comparingDouble(Movie :: getRating ).reversed() 
				.thenComparing(Comparator.comparingInt(Movie::getYear).reversed()))
		.limit(5);
	}

}
