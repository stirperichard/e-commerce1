package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.controller.login.LoginController;
import com.afjcjsbx.eshop.controller.search.decoration.CategoryResearch;
import com.afjcjsbx.eshop.controller.search.decoration.DiscountResearch;
import com.afjcjsbx.eshop.controller.search.decoration.ManufacturerResearch;
import com.afjcjsbx.eshop.controller.search.decoration.PriceResearch;
import com.afjcjsbx.eshop.entity.catalog.Category;
import com.afjcjsbx.eshop.entity.catalog.Keyword;
import com.afjcjsbx.eshop.entity.catalog.Manufacturer;
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
import java.util.List;

public class FilteredSearchController {


    protected ArrayList<Product> search() throws SQLException {

        PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRODUCT);
        ResultSet resultSet = statement.executeQuery();

        ArrayList<Product> products = new ArrayList<>();

        while (resultSet.next()) {
            products.add(retrieveProductInfoFromDatabaseQuery(resultSet));
        }
        return products;
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


    public Product searchProductByID(String pid) throws SQLException {

        PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRDUCT_BY_ID);
        preparedStatement.setString(1, pid);
        ResultSet resultSet = preparedStatement.executeQuery();

        System.err.println("query:" + preparedStatement.toString());

        if (resultSet.next()) {
            return retrieveProductInfoFromDatabaseQuery(resultSet);
        }

        throw new SQLException();

    }


    public List<Product> searchByString(String search) {

        List<Product> result = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRODUCTS_BY_NAME);
            preparedStatement.setString(1, "%" + search + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            System.err.println("query:" + preparedStatement.toString());

            while (resultSet.next()) {

                Product p = retrieveProductInfoFromDatabaseQuery(resultSet);
                result.add(p);
            }

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return result;
    }




    public ArrayList<Product> startResearch(Category category, Integer minPrice, Integer maxPrice, Integer minDiscount,
                                            Integer maxDisount, Manufacturer manufacturer) throws SQLException {

        FilteredSearchController fsc = new FilteredSearchController();
        fsc = new PriceResearch(minPrice, maxPrice, fsc);

        if (category != null) fsc = new CategoryResearch(category, fsc);
        if (minDiscount > 0) fsc = new DiscountResearch(minDiscount, fsc);
        if (manufacturer != null) fsc = new ManufacturerResearch(manufacturer, fsc);

        return fsc.search();

    }


}
