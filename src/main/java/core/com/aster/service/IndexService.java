package core.com.aster.service;

import core.com.aster.model.lend.GoodInfoResponse;
import core.com.aster.model.lend.PreInfoResponse;

/**
 * Created by wangjianan on 17-10-3.
 */
public interface IndexService {

    public PreInfoResponse preInfo();

    public GoodInfoResponse getInfo(Integer sid);
}
