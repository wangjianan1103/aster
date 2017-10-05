package core.com.aster.dao.mapper;

import core.com.aster.model.ConfigProduct;
import core.com.aster.model.ConfigProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigProductMapper {
    int countByExample(ConfigProductExample example);

    int deleteByExample(ConfigProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigProduct record);

    int insertSelective(ConfigProduct record);

    List<ConfigProduct> selectByExampleWithBLOBs(ConfigProductExample example);

    List<ConfigProduct> selectByExample(ConfigProductExample example);

    ConfigProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigProduct record, @Param("example") ConfigProductExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigProduct record, @Param("example") ConfigProductExample example);

    int updateByExample(@Param("record") ConfigProduct record, @Param("example") ConfigProductExample example);

    int updateByPrimaryKeySelective(ConfigProduct record);

    int updateByPrimaryKeyWithBLOBs(ConfigProduct record);

    int updateByPrimaryKey(ConfigProduct record);
}