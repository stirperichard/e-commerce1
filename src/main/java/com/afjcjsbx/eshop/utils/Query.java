package com.afjcjsbx.eshop.utils;


public class Query {

    public static final String FIND_REGISTERED_USER = "SELECT * FROM Users WHERE Username = ? and password = ?";

    public static final String FIND_USER_BY_EMAIL = "SELECT * FROM Users WHERE Username = ?";

    public static final String SEARCH_PRODUCTS_BY_NAME = "SELECT * " +
            "FROM Products " +
            "WHERE Aviability = 1 AND Products.ProductName LIKE ?";

    public static final String SEARCH_PRODUCT = "SELECT * " +
            "FROM Products";

    public static final String SEARCH_PRDUCT_BY_ID = "SELECT * " +
            "FROM Products " +
            "WHERE Products.ProductID = ?";

    public static final String INSERT_ADVERTISE = "INSERT INTO Products (ProducerID, Category, ProductName, " +
            "ProductDescription, Picture, Price, Manufacturer, isCharitable, Keywords, DiscountPercentage, " +
            "ShipmentCost, Availability) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_ADVERTISE = "UPDATE Products SET ProductName=?, ProductDescription=?, Price=?, DiscountPercentage=? WHERE ProductID=?";

    public static final String DELETE_ADVERTISE = "DELETE FROM Products WHERE ProductID=?";

}
