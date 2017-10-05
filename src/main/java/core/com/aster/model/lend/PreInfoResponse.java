package core.com.aster.model.lend;

import core.com.aster.model.ConfigBanner;
import core.com.aster.model.ConfigProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianan on 17-10-3.
 */
public class PreInfoResponse {

    private List<Products> bossList;
    private List<Products> hotList;
    private List<Products> newList;
    private List<Products> brandList;
    private List<ConfigBanner> bannerList;

    public PreInfoResponse() {
        this.bossList = new ArrayList<>();
        this.hotList = new ArrayList<>();
        this.newList = new ArrayList<>();
        this.brandList = new ArrayList<>();
    }

    public void add(ConfigProduct product) {
        if (product == null) {
            return;
        }

        Products products = new Products(product);
        newList.add(products);

        if (product.getIsBoss()) {
            bossList.add(products);
            brandList.add(products);
        } else if (product.getIsHot()) {
            hotList.add(products);
        }
    }

    public class Products {
        private int id;
        private String img;
        private String name;
        private BigDecimal shopPrice;
        private BigDecimal promotePrice;

        Products(){

        }

        public Products(ConfigProduct product){
            this.id = product.getId();
            this.img = product.getImgUrl();
            this.name = product.getName();
            this.shopPrice = product.getShopPrice();
            this.promotePrice = product.getPromotePrice();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        @Override
        public String toString() {
            return "Products{" +
                    "img='" + img + '\'' +
                    ", name='" + name + '\'' +
                    ", shopPrice=" + shopPrice +
                    ", promotePrice=" + promotePrice +
                    '}';
        }
    }

    public List<Products> getBossList() {
        return bossList;
    }

    public void setBossList(List<Products> bossList) {
        this.bossList = bossList;
    }

    public List<Products> getHotList() {
        return hotList;
    }

    public void setHotList(List<Products> hotList) {
        this.hotList = hotList;
    }

    public List<Products> getNewList() {
        return newList;
    }

    public void setNewList(List<Products> newList) {
        this.newList = newList;
    }

    public List<ConfigBanner> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<ConfigBanner> bannerList) {
        this.bannerList = bannerList;
    }

    public List<Products> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Products> brandList) {
        this.brandList = brandList;
    }

    @Override
    public String toString() {
        return "PreInfoResponse{" +
                "bossList=" + bossList +
                ", hotList=" + hotList +
                ", newList=" + newList +
                '}';
    }
}
