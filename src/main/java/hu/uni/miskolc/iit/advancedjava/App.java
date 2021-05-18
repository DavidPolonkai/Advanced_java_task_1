package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageEmptyException;
import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            new Producer(new StoreImpl(),new StoreImpl()).produce();
            new Producer(new StoreImpl(),new StoreImpl()).produce();
            new Producer(new StoreImpl(),new StoreImpl()).produce();
            new Consumer(new StoreImpl(),new StoreImpl()).consume(0);
            System.out.println(new StoreImpl().remove(0).toString());
        } catch (StorageEmptyException|StorageFullException e) {
            e.printStackTrace();
        }
    }
}
