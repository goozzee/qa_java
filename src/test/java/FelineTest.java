import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTestShouldReturnFelineFoodList() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTestIsItFelineFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTestShouldReturnOne() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTestShouldReturnSpecifiedAmount() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}