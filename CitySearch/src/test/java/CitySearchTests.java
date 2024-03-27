import com.citysearch.models.Cities;
import com.citysearch.models.CitySearch;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CitySearchTests {


    @Test
    public void testSearch() {
        //test that city names are Paris,
        // Budapest,
        // Skopje,
        // Rotterdam,
        // Valencia,
        // Vancouver,
        // Amsterdam,
        // Vienna, Sydney, New York City, London, Bangkok, Hong Kong, Dubai, Rome, Istanbul
        Cities cities = new Cities();
        List<String> cityList = cities.getCities();
        assertTrue(cityList.contains("Paris"));
        assertTrue(cityList.contains("Budapest"));
        assertTrue(cityList.contains("Skopje"));
        assertTrue(cityList.contains("Rotterdam"));
        assertTrue(cityList.contains("Valencia"));
        assertTrue(cityList.contains("Vancouver"));
        assertTrue(cityList.contains("Amsterdam"));
        assertTrue(cityList.contains("Vienna"));
        assertTrue(cityList.contains("Sydney"));
        assertTrue(cityList.contains("New York City"));
        assertTrue(cityList.contains("London"));
        assertTrue(cityList.contains("Bangkok"));
        assertTrue(cityList.contains("Hong Kong"));
        assertTrue(cityList.contains("Dubai"));
        assertTrue(cityList.contains("Rome"));
        assertTrue(cityList.contains("Istanbul"));
    }

    @Test
    public void aSearchContainingFewerThanTwoCharactersReturnsNothing() {
        String inputString = "";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(0, searchResults.size());


    }

    @Test
    public void aSearchContainingTwoCharactersReturnsResults() {
        String inputString = "Pa";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(1, searchResults.size());
        assertEquals("Paris", searchResults.getFirst());
    }

    @Test
    public void aSearchContainingTwoOrMoreCharactersReturnsAllResultsStartingWithSearchTerm() {
        String inputString = "Va";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(2, searchResults.size());
        assertEquals("Valencia", searchResults.getFirst());
        assertEquals("Vancouver", searchResults.getLast());
    }

    @Test
    public void searchIsCaseInsensitive() {
        String inputString = "pa";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(1, searchResults.size());
        assertEquals("Paris", searchResults.getFirst());
    }

    @Test
    public void partialSearchSucceeds()
    {
        String inputString = "ape";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(1, searchResults.size());
        assertEquals("Budapest", searchResults.getFirst());
    }

    @Test
    public void asteriskReturnsEverything() {
        String inputString = "*";
        List<String> searchResults = CitySearch.search(inputString);
        assert searchResults != null;
        assertEquals(16, searchResults.size());
    }

}
