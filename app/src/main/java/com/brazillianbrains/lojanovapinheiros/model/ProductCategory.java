package com.brazillianbrains.lojanovapinheiros.model;

public class ProductCategory {

    Integer productid;
    String productname;

    public ProductCategory(Integer productid, String productname) {
        this.productid = productid;
        this.productname = productname;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
