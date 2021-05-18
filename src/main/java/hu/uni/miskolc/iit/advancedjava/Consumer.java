package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageEmptyException;
import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Consumer {
    private StoreReader storeReader=new StoreImpl();
    private StoreWriter storeWriter=new StoreImpl();

    public void consume(int id) throws StorageEmptyException, StorageFullException {
        storeWriter.add(storeReader.remove(id));
    }
}
