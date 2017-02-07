package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.controller.login.LoginController;
import com.afjcjsbx.eshop.entity.catalog.Category;
import com.afjcjsbx.eshop.entity.catalog.Keyword;
import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.FactoryUsers;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.entity.review.Review;
import com.afjcjsbx.eshop.entity.search.SearchBean;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class SearchController {


    public static ArrayList<Product> search(SearchBean searchBean) {

        ArrayList<Product> final_result = new ArrayList<>();

        return final_result;
    }


    public static Product retrieveProductInfoFromDatabaseQuery(ResultSet resultSet) throws SQLException {

        Integer p_id = resultSet.getInt("ProductID");
        Boolean p_ischaritable = resultSet.getInt("isCharitable") == 1;
        Boolean p_availability = resultSet.getInt("Availability") == 1;
        Integer p_discount_percentage = resultSet.getInt("DiscountPercentage");

        String p_name = resultSet.getString("ProductName"),
                p_description = resultSet.getString("ProductDescription"),
                p_picture = resultSet.getString("Picture"),
                p_manufacturer = resultSet.getString("Manufacturer"),
                p_producer_email = resultSet.getString("ProducerEmail");

        Float p_price = resultSet.getFloat("Price");
        Float p_shipment_cost = resultSet.getFloat("ShipmentCost");

        ArrayList<Keyword> p_keywords = null;
        ArrayList<Review> p_reviews = null;
        Category p_category = null;

        AbstractUser p_producer = LoginController.retrieveOwnerInfoByEmail(p_producer_email);

        return new Product(p_id, p_name, p_description, p_picture, p_price, p_discount_percentage, p_shipment_cost, p_producer, p_category, p_manufacturer, p_keywords, p_reviews, p_ischaritable, p_availability);
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
