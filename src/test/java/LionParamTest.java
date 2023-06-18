import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(Parameterized.class)
public class LionParamTest {
    Lion lion;

    @Mock
    Feline feline;

    private String lionSex;
    private boolean hasMane;

    public LionParamTest(String lionSex, boolean hasMane) {
        this.lionSex = lionSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static List<Object[]> lionSex() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
        });
    }

    @Before
    public void createLion() throws Exception {
        initMocks(this);
        lion = new Lion(lionSex, feline);
    }

    @Test
    public void shouldHaveMane() throws Exception {
        boolean expected = hasMane;
        assertEquals(expected, lion.doesHaveMane());
    }
}