package core.com.aster.model;

public class ConfigBanner {
    private Integer id;

    private Integer createTime;

    private Integer updateTime;

    private String title;

    private String imageUrl;

    private String targetUrl;

    private Integer displayStartTime;

    private Integer displayEndTime;

    private Integer displaySequence;

    private Integer positionIndex;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    public Integer getDisplayStartTime() {
        return displayStartTime;
    }

    public void setDisplayStartTime(Integer displayStartTime) {
        this.displayStartTime = displayStartTime;
    }

    public Integer getDisplayEndTime() {
        return displayEndTime;
    }

    public void setDisplayEndTime(Integer displayEndTime) {
        this.displayEndTime = displayEndTime;
    }

    public Integer getDisplaySequence() {
        return displaySequence;
    }

    public void setDisplaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
    }

    public Integer getPositionIndex() {
        return positionIndex;
    }

    public void setPositionIndex(Integer positionIndex) {
        this.positionIndex = positionIndex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}