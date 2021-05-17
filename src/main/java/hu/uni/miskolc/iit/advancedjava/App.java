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
            new Producer().produce();
            new Producer().produce();
            new Producer().produce();
            new Consumer().consume(0);
            System.out.println(new Store().remove(0).toString());
        } catch (StorageEmptyException e) {
            e.printStackTrace();
        } catch (StorageFullException e) {
            e.printStackTrace();
        }
    }
}
