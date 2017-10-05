package core.com.aster.model.lend;

import core.com.aster.model.ConfigProduct;

/**
 * Created by wangjianan on 17-10-5.
 */
public class GoodInfoRequest {

    private Integer sid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "GoodInfoRequest{" +
                "sid=" + sid +
                '}';
    }
}
