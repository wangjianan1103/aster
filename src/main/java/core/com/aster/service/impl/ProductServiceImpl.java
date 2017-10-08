package core.com.aster.service.impl;

import core.com.aster.dao.ConfigProductDao;
import core.com.aster.dao.ConfigProductImageDao;
import core.com.aster.dao.ProductDao;
import core.com.aster.dao.ProductImageDao;
import core.com.aster.exception.AsterException;
import core.com.aster.model.ConfigProduct;
import core.com.aster.model.Product;
import core.com.aster.model.ProductImage;
import core.com.aster.model.lend.*;
import core.com.aster.service.ProductService;
import core.com.aster.utils.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-10-6.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ConfigProductDao configProductDao;

    @Autowired
    private ConfigProductImageDao configProductImageDao;

    @Autowired
    private ProductImageDao productImageDao;

    @Override
    public PreInfoResponse doProductInfo(PreInfoResponse response) {

        if (response == null) {
            return null;
        }

        // 查询所有产品
        List<Product> productList = productDao.selectProduct();
        if (productList == null || productList.isEmpty()) {
            return null;
        }

        for (Product product : productList) {
            PreInfoResponse.ProductInfo info = new PreInfoResponse.ProductInfo();
            info.setSid(product.getId());
            info.setGid(product.getGid());
            info.setName(product.getName());
            info.setImgUrl(product.getImgUrl());
            info.setShopPrice(product.getShopPrice());
            info.setStock(product.getStock());
            info.setViews(product.getViews());

            response.add(info, product.getViewType());
        }

        return response;
    }

    @Override
    public GoodInfoResponse getProductInfo(GoodInfoRequest request) {

        GoodInfoResponse response = new GoodInfoResponse();
        if (request == null || request.getSid() == null) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }

        Product product = productDao.selectProductById(request.getSid());
        if (product == null) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }
        GoodInfoResponse.ProductInfo productInfo = new GoodInfoResponse.ProductInfo();
        productInfo.setViews(product.getViews());
        productInfo.setStock(product.getStock());
        productInfo.setShopPrice(product.getShopPrice());
        productInfo.setImgUrl(product.getImgUrl());
        productInfo.setSid(product.getId());
        productInfo.setGid(product.getGid());
        productInfo.setName(product.getName());
        productInfo.setContent(product.getContent());
        productInfo.setShops(product.getShops());

        String gid = product.getGid();
        List<String> list = configProductImageDao.selectImageGidByProduct(gid);
        if (list != null) {
            List<ProductImage> imageList = productImageDao.selectByGid(list);
            if (imageList != null) {
                List<GoodInfoResponse.ProductImageInfo> imageInfoList = new ArrayList<>();
                for (ProductImage image : imageList) {
                    GoodInfoResponse.ProductImageInfo imageInfo = new GoodInfoResponse.ProductImageInfo();
                    imageInfo.setName(image.getName());
                    imageInfo.setImgUrl(image.getImgUrl());
                    imageInfoList.add(imageInfo);
                }

                productInfo.setImageInfoList(imageInfoList);
            }
        }

        response.setProduct(productInfo);
        return response;
    }

    @Override
    public GoodListResponse getProductList(GoodInfoRequest request) {
        GoodListResponse response = new GoodListResponse();
        if (request == null || request.getCid() == null) {
            throw new AsterException(ErrorCode.SYS_PARAMS_ERROR);
        }

        ConfigProduct configProduct = configProductDao.selectConfigProductById(request.getCid());
        if (configProduct == null) {
            return response;
        }

        ConfigProductInfo configProductInfo = new ConfigProductInfo(configProduct);
        response.setConfigProductInfo(configProductInfo);

        String configGid = configProduct.getGid();
        List<Product> productList = productDao.selectProductByConfigGid(configGid);
        if (productList == null || productList.isEmpty()) {
            return response;
        }

        List<GoodListResponse.ProductInfo> productInfoList = new ArrayList<>();
        for (Product product : productList) {
            GoodListResponse.ProductInfo info = new GoodListResponse.ProductInfo();
            info.setSid(product.getId());
            info.setGid(product.getGid());
            info.setName(product.getName());
            info.setImgUrl(product.getImgUrl());
            info.setShopPrice(product.getShopPrice());
            info.setStock(product.getStock());
            info.setViews(product.getViews());
            info.setShops(product.getShops());

            productInfoList.add(info);
        }
        response.setProductInfoList(productInfoList);
        return response;
    }
}
