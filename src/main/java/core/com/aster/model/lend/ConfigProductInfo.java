package core.com.aster.model.lend;

import core.com.aster.model.ConfigProduct;

/**
 * Created by wangjianan on 17-10-8.
 */
public class ConfigProductInfo {

    private Integer sid;
    private String gid;
    private String name;
    private String imgUrl;

    public ConfigProductInfo() {
    }

    public ConfigProductInfo(ConfigProduct product) {
        this.sid = product.getId();
        this.gid = product.getGid();
        this.name = product.getName();
        this.imgUrl = product.getImgUrl();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "ConfigProductInfo{" +
                "sid=" + sid +
                ", gid='" + gid + '\'' +
                ", name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
