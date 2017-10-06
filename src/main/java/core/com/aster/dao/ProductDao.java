package core.com.aster.dao;

import core.com.aster.model.Product;

import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
public interface ProductDao {

    List<Product> selectProductByConfigGid(String configGid);
    Product selectProductById(Integer sid);
    Product selectProductByGid(String gid);
    List<Product> selectProduct();
}
