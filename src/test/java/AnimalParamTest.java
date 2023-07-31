import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String animalKindType;
    private final List<String> animalFood;

    public AnimalParamTest(String animalKindType, List<String> animalFood) {
        this.animalKindType = animalKindType;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodGroup() {
        return new Object[][]{
                {"Травоядное",
                        List.of("Трава", "Различные растения")},
                {"Хищник",
                        List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodTestShouldCorrelateAnimalKindAndFoodList() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(animalFood, animal.getFood(animalKindType));
    }
}
