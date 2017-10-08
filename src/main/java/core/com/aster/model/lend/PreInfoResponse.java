package core.com.aster.model.lend;

import core.com.aster.model.ConfigBanner;
import core.com.aster.utils.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-10-3.
 */
public class PreInfoResponse {

    private List<ProductInfo> bossList;
    private List<ProductInfo> hotList;
    private List<ProductInfo> newList;
    private List<ConfigBanner> bannerList;
    private List<ConfigProductInfo> configProductInfoList;

    public PreInfoResponse() {
        bossList = new ArrayList<>();
        hotList = new ArrayList<>();
        newList = new ArrayList<>();
    }

    public void add(ProductInfo info, int type) {

        switch (type) {
            case Constants.ProductViewType.TYPE_NEW:
                newList.add(info);
                break;
            case Constants.ProductViewType.TYPE_BOSS:
                bossList.add(info);
                break;
            case Constants.ProductViewType.TYPE_HOT:
                hotList.add(info);
                break;
            default:
                newList.add(info);
                break;
        }
    }

    public static class ProductInfo {
        private Integer sid;
        private String gid;
        private String name;
        private String imgUrl;
        private BigDecimal shopPrice;
        private int stock;
        private int views;

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

        public BigDecimal getShopPrice() {
            return shopPrice;
        }

        public void setShopPrice(BigDecimal shopPrice) {
            this.shopPrice = shopPrice;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        @Override
        public String toString() {
            return "ProductInfo{" +
                    "sid=" + sid +
                    ", gid='" + gid + '\'' +
                    ", name='" + name + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", shopPrice=" + shopPrice +
                    ", stock=" + stock +
                    ", views=" + views +
                    '}';
        }
    }


    public List<ProductInfo> getBossList() {
        return bossList;
    }

    public void setBossList(List<ProductInfo> bossList) {
        this.bossList = bossList;
    }

    public List<ProductInfo> getHotList() {
        return hotList;
    }

    public void setHotList(List<ProductInfo> hotList) {
        this.hotList = hotList;
    }

    public List<ProductInfo> getNewList() {
        return newList;
    }

    public void setNewList(List<ProductInfo> newList) {
        this.newList = newList;
    }

    public List<ConfigBanner> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<ConfigBanner> bannerList) {
        this.bannerList = bannerList;
    }

    public List<ConfigProductInfo> getConfigProductInfoList() {
        return configProductInfoList;
    }

    public void setConfigProductInfoList(List<ConfigProductInfo> configProductInfoList) {
        this.configProductInfoList = configProductInfoList;
    }

    @Override
    public String toString() {
        return "PreInfoResponse{" +
                "bossList=" + bossList +
                ", hotList=" + hotList +
                ", newList=" + newList +
                ", bannerList=" + bannerList +
                ", configProductInfoList=" + configProductInfoList +
                '}';
    }
}
