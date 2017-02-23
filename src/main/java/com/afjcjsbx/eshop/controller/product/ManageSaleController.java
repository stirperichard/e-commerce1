package com.afjcjsbx.eshop.controller.product;

import com.afjcjsbx.eshop.controller.search.FilteredSearchController;
import com.afjcjsbx.eshop.entity.advertisement.Advertisement;
import com.afjcjsbx.eshop.entity.catalogue.Keyword;
import com.afjcjsbx.eshop.entity.catalogue.Product;
import com.afjcjsbx.eshop.entity.login.Producer;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ManageSaleController {


	/*

	public ReadableProductPrice calculatePrice() {}

	private List<ReadableProduct> relatedItems(){}
	
    */


    public Product displayProduct(String pid) throws SQLException {

        PreparedStatement preparedStatement = DataSource.getConnection().prepareStatement(Query.SEARCH_PRDUCT_BY_ID);
        preparedStatement.setString(1, pid);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return FilteredSearchController.retrieveProductInfoFromDatabaseQuery(resultSet);
        }

        throw new SQLException();
    }


    public boolean insertProduct(Product product, Producer producer) {

        try {

            PreparedStatement statement = DataSource.getConnection().prepareStatement(Query.ADD_REVIEW);

            statement.setString(1, producer.getEmail());
            statement.setString(2, product.getCategory().getName());
            statement.setString(3, product.getName());
            statement.setString(4, product.getDescription());
            statement.setString(5, product.getPicture());
            statement.setString(6, Float.toString(product.getPrice()));
            statement.setString(7, product.getManufacturer());
            statement.setString(8, product.isCharitable() ? "1" : "0");
            statement.setString(9, keywordsToString(product.getKeywords()));
            statement.setString(10, Integer.toString(product.getDiscountPercentage()));
            statement.setString(11, Float.toString(product.getShipmentCost()));
            statement.setString(12, product.isAvailability() ? "1" : "0");

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


    public void updateproduct(Advertisement advertisement) {

        /*
        try {

            PreparedStatement statement = DataSource.getConnection().prepareStatement(Query.);

            statement.setString(1, advertisement.getProduct().getName());
            statement.setString(2, advertisement.getProduct().getDescription());
            statement.setString(3, Float.toString(advertisement.getProduct().getPrice()));
            statement.setString(4, Integer.toString(advertisement.getProduct().getDiscountPercentage()));

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

        */
    }


    public boolean deleteProduct(Advertisement advertisement) {

        try {

            PreparedStatement statement = DataSource.getConnection().prepareStatement(Query.DELETE_PRODUCT);

            statement.setString(1, Integer.toString(advertisement.getProductToSell().getId()));

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


    private String keywordsToString(List<Keyword> keywords) {
        StringBuilder string_keywords = new StringBuilder();

        for (Keyword keyword : keywords) {
            string_keywords.append(keyword).append(", ");
        }

        return string_keywords.toString();
    }
}

