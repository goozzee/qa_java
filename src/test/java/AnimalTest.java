import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void getFamilyAnimalTestShouldReturnExistingFamilyMessageString() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }


}