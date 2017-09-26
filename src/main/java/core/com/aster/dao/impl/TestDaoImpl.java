package core.com.aster.dao.impl;

import core.com.aster.dao.TestDao;
import core.com.aster.exception.AsterException;
import core.com.aster.utils.ErrorCode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wangjianan on 16-11-24.
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = {Exception.class})
    public void dbId(boolean flag) {

        if (flag) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }
    }
}
