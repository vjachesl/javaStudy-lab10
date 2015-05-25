package lab10;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static lab10.GenericsUtils.*;

/**
 * Created by viacheslav on 25.05.15.
 */
public class GenericsUtilsTest {

    @Test
    public void testFromArrayToCollection() throws Exception {
        Integer [] array = {1, 2, 3, 4};
        Collection collection = new ArrayList<>();
        fromArrayToCollection(array, collection);
        System.out.println(collection);

   //     collection = null;
        fromArrayToCollection(array, collection);
        System.out.println(collection);

   //     array = null;
        fromArrayToCollection(array, collection);
        System.out.println(collection);

    }

    @Test
    public void testCopyAll() throws Exception {
        List<Fruit> fr = null;
        List<Apple> app = null;
        List<Orange> or = null;
        List<RedApple> rapp = null;
        List<Melon> mel = null;
        copyAll(or, fr);
        copyAll(rapp, fr);
        copyAll(rapp, app);
        copyAll(rapp, rapp);
      //copyAll(fr, or);
    }

    @Test
    public void testGetLargerThen() throws Exception {
        Collection<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple("Golden Apple", 45));
        fruits.add(new Melon("Large Melon", 25));
        fruits.add(new RedApple("Large Red Apple", 54));
        fruits.add(new Orange("Small Orange", 104));
        fruits.add(new Orange("Big Orange", 10));

        Collection<Fruit> fruitsLageThen = getLargerThen(fruits, new RedApple("Large", 54));
        System.out.println(fruitsLageThen.size());
        System.out.println(fruitsLageThen);
    }
}