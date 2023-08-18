
import org.example.Reto1;
import org.example.Reto1B;
import org.junit.jupiter.api.Test;


import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

public class RetoTest {


    @Test

    public void testFindSubstringsAndSort() {

        String[] a1 = {"arp", "live", "strong"};

        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] expected = {"arp", "live", "strong"};

        assertArrayEquals(expected, Reto1B.findSubstringsAndSort(a1, a2));

    }


    @Test

    public void testFindSubstringsAndSortEmpty() {

        String[] a1 = {"tarp", "mice", "bull"};

        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] expected = {};

        String[] result = Reto1B.findSubstringsAndSort(a1, a2);

        assertArrayEquals(expected, result);


    }


}


