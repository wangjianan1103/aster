package core.com.aster.model.lend;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wangjianan on 17-10-5.
 */
public class GoodListResponse {

    private List<ProductInfo> productInfoList;
    private ConfigProductInfo configProductInfo;

    public static class ProductInfo {
        private Integer sid;
        private String gid;
        private String name;
        private String imgUrl;
        private BigDecimal shopPrice;
        private int views;
        private int stock;
        private int shops;

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

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public int getShops() {
            return shops;
        }

        public void setShops(int shops) {
            this.shops = shops;
        }

        @Override
        public String toString() {
            return "ProductInfo{" +
                    "sid=" + sid +
                    ", gid='" + gid + '\'' +
                    ", name='" + name + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", shopPrice=" + shopPrice +
                    ", views=" + views +
                    ", stock=" + stock +
                    ", shops=" + shops +
                    '}';
        }

    }

    public ConfigProductInfo getConfigProductInfo() {
        return configProductInfo;
    }

    public void setConfigProductInfo(ConfigProductInfo configProductInfo) {
        this.configProductInfo = configProductInfo;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }

    @Override
    public String toString() {
        return "GoodListResponse{" +
                "productInfoList=" + productInfoList +
                ", configProductInfo=" + configProductInfo +
                '}';
    }
}
