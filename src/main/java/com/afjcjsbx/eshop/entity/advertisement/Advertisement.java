package com.afjcjsbx.eshop.entity.advertisement;

import com.afjcjsbx.eshop.entity.Entity;
import com.afjcjsbx.eshop.entity.catalog.Category;
import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.entity.login.Producer;

/**
 * Created by afjcjsbx on 07/02/17.
 */
public class Advertisement extends Entity{

   /* private Product product;*/


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
