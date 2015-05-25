package lab10;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by viacheslav on 21.05.15.
 1.Написать функцию для копирования из массива в коллекцию того же типа, что и массив
 void fromArrayToCollection(Object[] a, Collection c)
 2. Написать функцию для копирования одной коллекции в другую
 void copyAll(Collection collection, Collection out)
 Так, что бы можно было выполнять следующие операции
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
 3. Написать функцию, которая возвращает новую коллекцию, в которой находятся лишь те элементы
 из входной коллекции, которые больше заданного (так же подается как параметр в функцию)
 */
public class GenericsUtils {

    public static  <E> void fromArrayToCollection(E [] a, Collection<E> c){
        if (a==null) throw new NullPointerException("The source array is null");
        if (c==null) throw new NullPointerException("The destination array is null");
        for (E element : a) c.add(element);
    }

    public static <E> void copyAll(Collection<E> collection, Collection<? super E> out){
        if (collection == null) throw new NullPointerException("The source collection is null");
        if (out == null) out = new ArrayList<>();
        for (E element : collection) out.add(element);
    }


    public  static <E extends Comparable<? super E>> Collection<E>
    getLargerThen(Collection<? extends E> collection, E limit) {

        Collection<E> result = new ArrayList<>();

        for (E elem : collection) {
            if (elem.compareTo(limit) > 0) {
                result.add(elem);
            }
        }

        return result;
    }

}
