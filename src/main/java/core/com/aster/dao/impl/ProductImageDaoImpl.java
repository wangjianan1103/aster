package core.com.aster.dao.impl;

import core.com.aster.dao.ProductImageDao;
import core.com.aster.dao.mapper.ProductImageMapper;
import core.com.aster.model.ProductImage;
import core.com.aster.model.ProductImageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
@Repository
public class ProductImageDaoImpl implements ProductImageDao {

    @Autowired
    private ProductImageMapper productImageMapper;

    @Override
    public List<ProductImage> selectByGid(List<String> gidList) {
        ProductImageExample example = new ProductImageExample();
        example.createCriteria().andGidIn(gidList);
        return productImageMapper.selectByExample(example);
    }
}
