package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;

public class Producer {
    private Store store = new Store();

    public void produce() throws StorageFullException {
        String name = "product".concat(String.valueOf(this.store.getProductCount()));
        Product product = new Product(this.store.getProductCount(),name);
        store.add(product);
    }
}
