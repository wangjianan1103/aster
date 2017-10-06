package core.com.aster.dao.impl;

import core.com.aster.dao.ConfigProductDao;
import core.com.aster.dao.mapper.ConfigProductMapper;
import core.com.aster.model.ConfigProduct;
import core.com.aster.model.ConfigProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjianan on 17-10-3.
 */
@Repository
public class ConfigProductDaoImpl implements ConfigProductDao {

    @Autowired
    private ConfigProductMapper configProductMapper;

    @Override
    public List<ConfigProduct> selectConfigProduct() {
        ConfigProductExample example = new ConfigProductExample();
        example.createCriteria().andIsValidEqualTo(Boolean.TRUE);
        return configProductMapper.selectByExample(example);
    }

    @Override
    public ConfigProduct selectConfigProductById(int id) {
        ConfigProduct configProduct = configProductMapper.selectByPrimaryKey(id);
        if (configProduct != null) {
            return configProduct;
        }
        return null;
    }

}
