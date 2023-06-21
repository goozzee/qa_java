import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void getKittensLionFemaleTestShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTestShouldReturnLionFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void shouldReturnException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("йцукен", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}