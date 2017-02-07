package com.afjcjsbx.eshop.utils;


public class Query {

    public static final String FIND_REGISTERED_USER = "SELECT * FROM Users WHERE Username = ? and password = ?";

    public static final String SEARCH_PRODUCTS_BY_NAME = "SELECT * " +
            "FROM Products " +
            "WHERE Aviability = 1 AND Products.ProductName LIKE ?";

    public static final String SEARCH_PRDUCT_BY_ID = "SELECT * " +
            "FROM ProductS " +
            "WHERE Products.ProductID = ?";

}
