package core.com.aster.dao.impl;

import core.com.aster.dao.ConfigProductImageDao;
import core.com.aster.dao.mapper.ConfigProductImageMapper;
import core.com.aster.model.ConfigProductImage;
import core.com.aster.model.ConfigProductImageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
@Repository
public class ConfigProductImageDaoImpl implements ConfigProductImageDao {

    @Autowired
    private ConfigProductImageMapper configProductImageMapper;

    @Override
    public List<String> selectImageGidByProduct(String productGid) {
        ConfigProductImageExample example = new ConfigProductImageExample();
        example.createCriteria().andProductGidEqualTo(productGid);
        List<ConfigProductImage> list = configProductImageMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            List<String> str = new ArrayList<>();
            for (ConfigProductImage image : list) {
                str.add(image.getImageGid());
            }

            return str;
        }
        return null;
    }
}
