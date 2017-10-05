package core.com.aster.dao;

import core.com.aster.model.ConfigBanner;

import java.util.List;

/**
 * Created by wangjianan on 17-10-4.
 */
public interface ConfigBannerDao {

    public List<ConfigBanner> selectBannerByIndex(int index);
}
