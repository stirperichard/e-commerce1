package com.afjcjsbx.eshop.persistence;


public class Query {

    public static final String RETRIEVE_CATEGORIES = "SELECT * FROM Categories";


    public static final String FIND_REGISTERED_USER = "SELECT * FROM Users WHERE Mail = ? and password = ?";

    public static final String FIND_USER_BY_EMAIL = "SELECT * FROM Users WHERE Mail = ?";

    public static final String FIND_USER_BY_USERNAME = "SELECT * FROM Users WHERE Username = ?"; //Creato da Richard

    public static final String SEARCH_PRODUCTS_BY_NAME = "SELECT * " +
            "FROM Products " +
            "WHERE Availability = 1 AND Products.ProductName LIKE ?";

    public static final String SEARCH_PRODUCT = "SELECT * " +
            "FROM Products";

    public static final String SEARCH_PRDUCT_BY_ID = "SELECT * " +
            "FROM Products " +
            "WHERE Products.ProductID = ?";

    public static final String INSERT_PRODUCT = "INSERT INTO Products (ProducerEmail, Category, ProductName, " +
            "ProductDescription, Picture, Price, Manufacturer, isCharitable, Keywords, DiscountPercentage, " +
            "ShipmentCost, Availability) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_PRODUCT = "UPDATE Products SET ProductName=?, ProductDescription=?, Price=?, DiscountPercentage=? WHERE ProductID=?";

    public static final String DELETE_PRODUCT = "DELETE FROM Products WHERE ProductID=?";

    public static final String ADD_REVIEW = "INSERT INTO Reviews(reviewId, productId, username, rating, comment) VALUES (?,?,?,?,?) ON CONFLICT (productId,username) DO UPDATE SET rating=EXCLUDED.rating, comment=EXCLUDED.comment";

    public static final String FIND_REVIEWS_BY_PRODUCT_ID = "SELECT * FROM Reviews WHERE productId = ?";

    public static final String FIND_REVIEWS_BY_USERNAME = "SELECT * FROM Reviews WHERE username = ?";

}
