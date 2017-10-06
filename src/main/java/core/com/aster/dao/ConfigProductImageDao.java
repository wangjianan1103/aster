package core.com.aster.dao;

import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
public interface ConfigProductImageDao {

    List<String> selectImageGidByProduct(String productGid);
}
