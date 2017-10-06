package core.com.aster.model.lend;

/**
 * Created by wangjianan on 17-10-5.
 */
public class GoodInfoRequest {

    private Integer sid;

    private Integer cid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

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
                ", cid=" + cid +
                '}';
    }
}
