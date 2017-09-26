package core.com.aster.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wangjianan on 16-11-27.
 */
public interface UploadFileService {

    public String put(MultipartFile attach);
}
