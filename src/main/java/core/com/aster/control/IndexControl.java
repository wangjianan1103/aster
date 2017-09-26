package core.com.aster.control;

import core.com.aster.utils.ErrorCode;
import core.com.aster.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by wangjianan on 2016/1/28.
 */
@RestController
@RequestMapping(value = "/")
public class IndexControl {
    private static final Logger logger = LoggerFactory.getLogger(IndexControl.class);

}
