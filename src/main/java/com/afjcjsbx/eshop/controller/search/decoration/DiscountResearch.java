package com.afjcjsbx.eshop.controller.search.decoration;

import com.afjcjsbx.eshop.controller.search.FilteredSearchController;
import com.afjcjsbx.eshop.controller.search.FilteredSearchDecorator;
import com.afjcjsbx.eshop.entity.catalogue.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class DiscountResearch extends FilteredSearchDecorator {

    private Integer minDiscount;

    public DiscountResearch(Integer minDiscount, FilteredSearchController filteredSearch) {
        super(filteredSearch);
        this.minDiscount = minDiscount;
    }

    private ArrayList<Product> filterResearchCity(ArrayList<Product> products) {

        ArrayList<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getDiscountPercentage() > minDiscount)
                filteredProducts.add(product);
        }
        return filteredProducts;
    }

    @Override
    public ArrayList<Product> search() throws SQLException {

        return filterResearchCity(super.search());

    }
}