package core.com.aster.service.impl;

import core.com.aster.model.common.SiteMapXml;
import core.com.aster.service.SiteMapService;
import core.com.aster.utils.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-6-5.
 */
@Service
public class SiteMapServiceImpl implements SiteMapService {
    private static final Logger logger = LoggerFactory.getLogger(SiteMapServiceImpl.class);


    @Override
    public SiteMapXml siteMapXml() {

        return null;
    }

}
