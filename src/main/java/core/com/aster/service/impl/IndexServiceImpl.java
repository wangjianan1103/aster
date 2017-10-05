package core.com.aster.service.impl;

import core.com.aster.dao.ConfigBannerDao;
import core.com.aster.dao.ConfigProductDao;
import core.com.aster.exception.AsterException;
import core.com.aster.model.ConfigBanner;
import core.com.aster.model.ConfigProduct;
import core.com.aster.model.lend.GoodInfoResponse;
import core.com.aster.model.lend.PreInfoResponse;
import core.com.aster.service.IndexService;
import core.com.aster.utils.Constants;
import core.com.aster.utils.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public PreInfoResponse preInfo() {
        logger.info("preInfo()");
        PreInfoResponse response = new PreInfoResponse();

        List<ConfigProduct> configProductList = configProductDao.selectConfigProduct();
        if (configProductList != null && !configProductList.isEmpty()) {
            for (ConfigProduct product : configProductList) {
                response.add(product);
            }
        }

        List<ConfigBanner> configBannerList = configBannerDao.selectBannerByIndex(Constants.ConfigBannerIndex.INDEX_BANNER);
        if (configBannerList != null && !configBannerList.isEmpty()) {
            response.setBannerList(configBannerList);
        }
        logger.info("preInfo(): response={}", response);
        return response;
    }

    @Override
    public GoodInfoResponse getInfo(Integer sid) {
        logger.info("getInfo(): sid={}", sid);
        GoodInfoResponse response = new GoodInfoResponse();
        if (sid == null) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }

        ConfigProduct product = configProductDao.selectConfigProductById(sid);
        GoodInfoResponse.Product good = new GoodInfoResponse.Product();
        good.setId(product.getId());
        good.setName(product.getName());
        good.setContent(product.getContent());
        good.setImgUrl(product.getImgUrl());
        good.setShopPrice(product.getShopPrice());
        good.setPromotePrice(product.getPromotePrice());

        response.setProduct(good);
        logger.info("getInfo(): response={}", response);
        return response;
    }
}
