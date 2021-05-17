package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageEmptyException;
import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;

public class Consumer {
    private Store store=new Store();

    public void consume(int id) throws StorageEmptyException, StorageFullException {
        store.add(store.remove(id));
    }
}
