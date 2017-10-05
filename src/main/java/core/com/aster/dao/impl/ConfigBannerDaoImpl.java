package core.com.aster.dao.impl;

import core.com.aster.dao.ConfigBannerDao;
import core.com.aster.dao.mapper.ConfigBannerMapper;
import core.com.aster.model.ConfigBanner;
import core.com.aster.model.ConfigBannerExample;
import core.com.aster.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjianan on 17-10-4.
 */
@Repository
public class ConfigBannerDaoImpl implements ConfigBannerDao {

    @Autowired
    private ConfigBannerMapper configBannerMapper;

    @Override
    public List<ConfigBanner> selectBannerByIndex(int index) {
        ConfigBannerExample example = new ConfigBannerExample();
        example.createCriteria()
                .andDisplayStartTimeLessThanOrEqualTo(Utility.getCurrentTimeStamp())
                .andDisplayEndTimeGreaterThanOrEqualTo(Utility.getCurrentTimeStamp())
                .andPositionIndexEqualTo(index);
        return configBannerMapper.selectByExample(example);
    }

}
