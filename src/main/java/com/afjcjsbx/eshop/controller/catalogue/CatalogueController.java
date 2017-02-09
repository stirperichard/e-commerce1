package com.afjcjsbx.eshop.controller.catalogue;

import com.afjcjsbx.eshop.controller.login.LoginController;
import com.afjcjsbx.eshop.entity.catalog.Category;
import com.afjcjsbx.eshop.entity.catalog.Keyword;
import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.review.Review;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by afjcjsbx on 09/02/17.
 */
public class CatalogueController {


        public static Category retrieveCategoryInfoFromDatabaseQuery(ResultSet resultSet) throws SQLException {

        String c_name = resultSet.getString("CategoryName"),
                c_description = resultSet.getString("CategoryDescription"),
                c_picture = resultSet.getString("Picture");

        return new Category(c_name, c_description, c_picture);
    }


    public ArrayList<Category> retrieveCategories() throws SQLException {

        PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.RETRIEVE_CATEGORIES);
        ResultSet resultSet = preparedStatement.executeQuery();

        System.err.println("query:" + preparedStatement.toString());

        ArrayList<Category> categories = new ArrayList<>();

        while (resultSet.next()) {
            Category c = retrieveCategoryInfoFromDatabaseQuery(resultSet);
            categories.add(c);
        }

        return categories;

    }

}
