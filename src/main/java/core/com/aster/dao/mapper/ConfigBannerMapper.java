package core.com.aster.dao.mapper;

import core.com.aster.model.ConfigBanner;
import core.com.aster.model.ConfigBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBannerMapper {
    int countByExample(ConfigBannerExample example);

    int deleteByExample(ConfigBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBanner record);

    int insertSelective(ConfigBanner record);

    List<ConfigBanner> selectByExample(ConfigBannerExample example);

    ConfigBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBanner record, @Param("example") ConfigBannerExample example);

    int updateByExample(@Param("record") ConfigBanner record, @Param("example") ConfigBannerExample example);

    int updateByPrimaryKeySelective(ConfigBanner record);

    int updateByPrimaryKey(ConfigBanner record);
}