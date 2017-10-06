package core.com.aster.model;

public class ConfigProductImage {
    private Integer id;

    private String gid;

    private Integer createTime;

    private Integer updateTime;

    private String productGid;

    private String imageGid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductGid() {
        return productGid;
    }

    public void setProductGid(String productGid) {
        this.productGid = productGid == null ? null : productGid.trim();
    }

    public String getImageGid() {
        return imageGid;
    }

    public void setImageGid(String imageGid) {
        this.imageGid = imageGid == null ? null : imageGid.trim();
    }
}