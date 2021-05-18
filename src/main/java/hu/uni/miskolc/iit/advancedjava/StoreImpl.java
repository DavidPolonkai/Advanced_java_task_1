package hu.uni.miskolc.iit.advancedjava;

import hu.uni.miskolc.iit.advancedjava.exceptions.StorageEmptyException;
import hu.uni.miskolc.iit.advancedjava.exceptions.StorageFullException;
import java.util.ArrayList;
import java.util.List;

public class StoreImpl implements StoreReader,StoreWriter {
    private static List<Product> productList = new ArrayList<>();

    public void add(Product product) throws StorageFullException {
        this.productList.add(product);
    }

    public Product remove(int id) throws StorageEmptyException{
       return this.productList.remove(id);
    }

    public void reset(){
        this.productList.clear();
    }

    public int getProductCount(){
        return this.productList.size();
    }
}
