import com.citysearch.models.CitySearch;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a search string: ");
        String searchString = System.console().readLine();
        List<String> searchResults = CitySearch.search(searchString);
        System.out.println("Corresponding search results: ");
        searchResults.forEach(System.out::println);


    }
}
