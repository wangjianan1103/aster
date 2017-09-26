package core.com.aster.service.impl;

import core.com.aster.model.common.BaiduUrlResponse;
import core.com.aster.service.BaiduUrlService;
import core.com.aster.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * baidu send url
 * <p>
 * Created by wangjianan on 17-7-18.
 */
@Service
public class BaiduUrlServiceImpl implements BaiduUrlService {
    private static final Logger logger = LoggerFactory.getLogger(BaiduUrlServiceImpl.class);
    private static final String baseUrl = "http://data.zz.baidu.com/urls?site=www.oopmind.com&token=L0IUiGaaBiv3ij5Q&type=original";


    @Autowired
    private VendorHttpClientService vendorHttpClientService;

    @Override
    public void pushUrl() {
//        StringBuilder param = new StringBuilder();
//        List<BlogLoan> blogLoanList = blogLoanDao.queryBlogLoan();
//        if (!CollectionUtils.isEmpty(blogLoanList)) {
//            for (BlogLoan loan : blogLoanList) {
//                Integer id = loan.getId();
//                param.append(Utility.getUrl(id)).append("\n");
//            }
//        }
//
//        BaiduUrlResponse response = vendorHttpClientService.post(baseUrl, param.toString(), BaiduUrlResponse.class);
//        logger.info("pushUrl(): response={}", response);
    }

    @Override
    public void pushUrl(String gid) {
//        BlogLoan loan = blogLoanDao.selectByGid(gid);
//        if (loan == null) {
//            logger.info("pushUrl(): loan is null, gid={}", gid);
//            return;
//        }
//        String param = Utility.getUrl(loan.getId()) + "\n";
//        BaiduUrlResponse response = vendorHttpClientService.post(baseUrl, param, BaiduUrlResponse.class);
//        logger.info("pushUrl(): response={}", response);
    }
}
