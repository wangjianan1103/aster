package core.com.aster.service.impl;

import core.com.aster.dao.ConfigBannerDao;
import core.com.aster.dao.ConfigProductDao;
import core.com.aster.exception.AsterException;
import core.com.aster.model.ConfigBanner;
import core.com.aster.model.ConfigProduct;
import core.com.aster.model.lend.ConfigProductInfo;
import core.com.aster.model.lend.GoodInfoRequest;
import core.com.aster.model.lend.GoodInfoResponse;
import core.com.aster.model.lend.PreInfoResponse;
import core.com.aster.service.IndexService;
import core.com.aster.service.ProductService;
import core.com.aster.utils.Constants;
import core.com.aster.utils.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-10-3.
 */
@Service
public class IndexServiceImpl implements IndexService {
    private static final Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Autowired
    private ConfigProductDao configProductDao;

    @Autowired
    private ConfigBannerDao configBannerDao;

    @Autowired
    private ProductService productService;

    @Override
    public PreInfoResponse preInfo() {
        logger.info("preInfo()");
        PreInfoResponse response = new PreInfoResponse();

        // 查询产品品牌
        List<ConfigProduct> configProductList = configProductDao.selectConfigProduct();
        if (configProductList != null && !configProductList.isEmpty()) {
            List<ConfigProductInfo> configProductInfoList = new ArrayList<>();
            for (ConfigProduct product : configProductList) {
                ConfigProductInfo info = new ConfigProductInfo(product);
                configProductInfoList.add(info);
            }
            response.setConfigProductInfoList(configProductInfoList);
        }

        // 首页banner
        List<ConfigBanner> configBannerList = configBannerDao.selectBannerByIndex(Constants.ConfigBannerIndex.INDEX_BANNER);
        if (configBannerList != null && !configBannerList.isEmpty()) {
            response.setBannerList(configBannerList);
        }

        // 产品
        response = productService.doProductInfo(response);
        logger.info("preInfo(): response={}", response);
        return response;
    }

    @Override
    public GoodInfoResponse getInfo(GoodInfoRequest request) {
        logger.info("getInfo(): request={}", request);

        GoodInfoResponse response = null;
        if (request == null || request.getSid() == null) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }

        response = productService.getProductInfo(request);
        logger.info("getInfo(): response={}", response);
        return response;

    }
}
