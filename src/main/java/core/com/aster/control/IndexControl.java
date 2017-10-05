package core.com.aster.control;

import core.com.aster.model.common.LightningResponse;
import core.com.aster.model.lend.GoodInfoRequest;
import core.com.aster.service.IndexService;
import core.com.aster.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * Created by wangjianan on 2016/1/28.
 */
@RestController
@RequestMapping(value = "/")
public class IndexControl {
    private static final Logger logger = LoggerFactory.getLogger(IndexControl.class);

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "preinfo", method = RequestMethod.GET)
    private LightningResponse preInfo() {
        logger.info("===> preInfo(): start");
        LightningResponse response = null;
        try {
            response = Utility.getSuccessResp(indexService.preInfo());
        } catch (Exception e) {
            response = Utility.getErrorResponse();
        }
        logger.info("<=== preInfo(): end, preInfo response={}", response);
        return response;
    }

    @RequestMapping(value = "getGoodInfo", method = RequestMethod.POST)
    private LightningResponse getGoodInfo(@RequestBody GoodInfoRequest request) {
        logger.info("===> getGoodInfo(): request={}", request);
        LightningResponse response = null;

        if (request == null || request.getSid() == null) {
            return Utility.getErrorResponse();
        }

        try {
            response = Utility.getSuccessResp(indexService.getInfo(request.getSid()));
        } catch (Exception e) {
            response = Utility.getErrorResponse();
        }
        logger.info("<=== getGoodInfo(): end, preInfo response={}", response);
        return response;
    }

}
