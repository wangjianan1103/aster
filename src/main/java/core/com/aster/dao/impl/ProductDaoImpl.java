package core.com.aster.dao.impl;

import core.com.aster.dao.ProductDao;
import core.com.aster.dao.mapper.ProductMapper;
import core.com.aster.model.Product;
import core.com.aster.model.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> selectProductByConfigGid(String configGid) {
        ProductExample example = new ProductExample();
        example.createCriteria().andIsValidEqualTo(Boolean.TRUE)
                .andConfigGidEqualTo(configGid);
        return productMapper.selectByExample(example);
    }

    @Override
    public Product selectProductById(Integer sid) {
        Product product = productMapper.selectByPrimaryKey(sid);
        if (product != null) {
            return product;
        }
        return null;
    }

    @Override
    public Product selectProductByGid(String gid) {
        ProductExample example = new ProductExample();
        example.createCriteria().andIsValidEqualTo(Boolean.TRUE)
                .andGidEqualTo(gid);
        List<Product> list = productMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Product> selectProduct() {
        ProductExample example = new ProductExample();
        example.createCriteria().andIsValidEqualTo(Boolean.TRUE);
        return productMapper.selectByExample(example);
    }

}
