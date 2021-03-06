package core.com.aster.model.lend;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wangjianan on 17-10-5.
 */
public class GoodInfoResponse {

    private ProductInfo product;

    public static class ProductInfo {
        private Integer sid;
        private String gid;
        private String name;
        private String imgUrl;
        private BigDecimal shopPrice;
        private int views;
        private int stock;
        private int shops;
        private String content;
        private List<ProductImageInfo> imageInfoList;

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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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
                    ", content='" + content + '\'' +
                    ", imageInfoList=" + imageInfoList +
                    '}';
        }

        public List<ProductImageInfo> getImageInfoList() {
            return imageInfoList;
        }

        public void setImageInfoList(List<ProductImageInfo> imageInfoList) {
            this.imageInfoList = imageInfoList;
        }

    }

    public static class ProductImageInfo{
        private String name;
        private String imgUrl;

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
            return "ProductImageInfo{" +
                    "name='" + name + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    '}';
        }
    }

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "GoodInfoResponse{" +
                "product=" + product +
                '}';
    }
}
