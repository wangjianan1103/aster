package core.com.aster.dao;

import core.com.aster.model.ConfigProduct;

import java.util.List;

/**
 * Created by wangjianan on 17-10-3.
 */
public interface ConfigProductDao {

    public List<ConfigProduct> selectConfigProduct();

    public ConfigProduct selectConfigProductById(int id);
}
