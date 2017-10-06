package core.com.aster.dao;

import core.com.aster.model.Product;
import core.com.aster.model.ProductImage;

import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
public interface ProductImageDao {

    List<ProductImage> selectByGid(List<String> gidList);

}
