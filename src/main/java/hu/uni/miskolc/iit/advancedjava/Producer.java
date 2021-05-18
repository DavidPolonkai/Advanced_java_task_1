package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Producer {
    private StoreWriter storeWriter;
    private StoreReader storeReader;

    public void produce() throws StorageFullException {
        String name = "product".concat(String.valueOf(this.storeReader.getProductCount()));
        Product product = new Product(this.storeReader.getProductCount(),name);
        storeWriter.add(product);
    }
}
