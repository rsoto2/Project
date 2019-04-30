
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CellPhoneFinderTest {
    @Test
    public void registerTag(List<String> a) {
        a = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();

        expected.add("Owner: Pickles, Toe");
        expected.add("ID: 8675309");
        expected.add("Location: Within phone proximity");

        // Test to see if generated List matches the expected List
        // assertEquals(a, expected);
    }

}
