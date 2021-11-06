import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AnimalTest {
//    @Rule
//    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animals_instantiates_correctly(){
        Animal lucky = new Animal("Lucky");
        assertTrue(lucky instanceof Animal);
    }

    @Test
    public void getName_instanciates_with_name(){
        Animal lucky = new Animal("Lucky");
        lucky.getName();
        assertEquals("Lucky", lucky.getName());
    }

    @Test
    public void save_AnimalInsertObjectsIntoDatabase(){
        Animal lucky = new Animal("Lucky");
        lucky.save();
        assertTrue(Animal.all().get(0).equals(lucky));
    }

    @Test
    public void all_ReturnsAllAnimalInstances(){
        Animal lucky = new Animal("Lucky");
        lucky.save();
        Animal becky = new Animal("Becky");
        becky.save();
        Animal bucky = new Animal("Bucky");
        bucky.save();
        assertTrue(Animal.all().get(0).equals(lucky));
        assertTrue(Animal.all().get(0).equals(lucky));
        assertTrue(Animal.all().get(0).equals(lucky));

    }

    @Test
    public void find_returnsAnimalWithSameId_secondAnimal(){
        Animal lucky = new Animal("Lucky");
        lucky.save();
        Animal becky = new Animal("Becky");
        becky.save();
        assertEquals(Animal.find(becky.getId()), becky);
    }


}