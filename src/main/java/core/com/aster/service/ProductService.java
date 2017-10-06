package core.com.aster.service;

import core.com.aster.model.lend.GoodInfoRequest;
import core.com.aster.model.lend.GoodInfoResponse;
import core.com.aster.model.lend.GoodListResponse;
import core.com.aster.model.lend.PreInfoResponse;

/**
 * Created by wangjianan on 17-10-6.
 */
public interface ProductService {

    PreInfoResponse doProductInfo(PreInfoResponse response);

    GoodInfoResponse getProductInfo(GoodInfoRequest request);

    GoodListResponse getProductList(GoodInfoRequest request);
}
