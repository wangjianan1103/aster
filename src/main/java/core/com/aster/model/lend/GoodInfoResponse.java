package core.com.aster.model.lend;

import java.math.BigDecimal;

/**
 * Created by wangjianan on 17-10-5.
 */
public class GoodInfoResponse {

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static class Product {
        private Integer id;
        private String name;
        private String imgUrl;
        private BigDecimal shopPrice;
        private BigDecimal promotePrice;
        private String content;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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

        public BigDecimal getPromotePrice() {
            return promotePrice;
        }

        public void setPromotePrice(BigDecimal promotePrice) {
            this.promotePrice = promotePrice;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "product{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", shopPrice=" + shopPrice +
                    ", promotePrice=" + promotePrice +
                    ", content='" + content + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GoodInfoResponse{" +
                "product=" + product +
                '}';
    }
}
