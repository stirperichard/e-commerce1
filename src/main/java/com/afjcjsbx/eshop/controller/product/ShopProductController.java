package com.afjcjsbx.eshop.controller.product;

import com.afjcjsbx.eshop.controller.search.FilteredSearchController;
import com.afjcjsbx.eshop.entity.catalog.Keyword;
import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ShopProductController {


	/*

	public ReadableProductPrice calculatePrice() {}

	private List<ReadableProduct> relatedItems(){}
	
    */


    public Product displayProduct(String pid) throws SQLException {

        PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRDUCT_BY_ID);
        preparedStatement.setString(1, pid);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return FilteredSearchController.retrieveProductInfoFromDatabaseQuery(resultSet);
        }

        throw new SQLException();
    }


    public boolean insertProduct(String producer_email, String category_name, String product_name, String description, String picture, String price, String discountPercentage, String shipmentCost, String manufacturer, String keywords, String isCharitable) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.INSERT_PRODUCT);

            statement.setString(1, producer_email);
            statement.setString(2, category_name);
            statement.setString(3, product_name);
            statement.setString(4, description);
            statement.setString(5, picture);
            statement.setFloat(6, Float.parseFloat(price));
            statement.setString(7, manufacturer);
            statement.setInt(8, Integer.parseInt(isCharitable));
            statement.setString(9, keywords);
            statement.setInt(10, Integer.parseInt(discountPercentage));
            statement.setFloat(11, Float.parseFloat(shipmentCost));
            statement.setInt(12, 1);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean updateproduct(Product p) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.UPDATE_PRODUCT);

            statement.setString(1, p.getName());
            statement.setString(2, p.getDescription());
            statement.setString(3, Float.toString(p.getPrice()));
            statement.setString(4, Integer.toString(p.getDiscountPercentage()));

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean deleteProduct(Product p) {

        try {

            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.DELETE_PRODUCT);

            statement.setString(1, Integer.toString(p.getId()));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    private String keywordsToString(List<Keyword> keywords) {
        StringBuilder string_keywords = new StringBuilder();

        for (Keyword keyword : keywords) {
            string_keywords.append(keyword).append(", ");
        }

        return string_keywords.toString();
    }
}

