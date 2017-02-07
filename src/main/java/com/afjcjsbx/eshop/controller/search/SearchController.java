package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.entity.search.SearchBean;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class SearchController {


    public static ArrayList<Product> search(SearchBean searchBean) {

        ArrayList<Product> final_result = new ArrayList<>();

        return final_result;
    }


    public Product searchProductByID(String pid) {

        Product p = new Product();

        try {
            PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRDUCT_BY_ID);
            preparedStatement.setString(1, pid);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.err.println("query:" + preparedStatement.toString());

            while (resultSet.next()) {

                int productID = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                String description = resultSet.getString("ProductDescription");
                String photo = resultSet.getString("Picture");
                int discount = resultSet.getInt("Discount");
                float price = resultSet.getFloat("Price");

                p.setId(productID);
                p.setName(productName);
                p.setDescription(description);
                p.setPicture(photo);
                p.setDiscountPercentage(discount);
                p.setPrice(price);

                System.out.println(productID + " " + productName);

            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return p;

    }


}
