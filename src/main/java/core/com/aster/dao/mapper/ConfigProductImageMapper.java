package core.com.aster.dao.mapper;

import core.com.aster.model.ConfigProductImage;
import core.com.aster.model.ConfigProductImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigProductImageMapper {
    int countByExample(ConfigProductImageExample example);

    int deleteByExample(ConfigProductImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigProductImage record);

    int insertSelective(ConfigProductImage record);

    List<ConfigProductImage> selectByExample(ConfigProductImageExample example);

    ConfigProductImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigProductImage record, @Param("example") ConfigProductImageExample example);

    int updateByExample(@Param("record") ConfigProductImage record, @Param("example") ConfigProductImageExample example);

    int updateByPrimaryKeySelective(ConfigProductImage record);

    int updateByPrimaryKey(ConfigProductImage record);
}