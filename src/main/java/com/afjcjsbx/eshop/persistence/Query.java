package com.afjcjsbx.eshop.persistence;


public class Query {

    public static final String RETRIEVE_CATEGORIES = "SELECT * FROM categories";

    public static final String FIND_REGISTERED_USER = "SELECT * FROM users WHERE Mail = ? and password = ?";

    public static final String FIND_USER_BY_EMAIL = "SELECT * FROM users WHERE Mail = ?";

    public static final String SEARCH_PRODUCTS_BY_NAME = "SELECT * " +
            "FROM products " +
            "WHERE Availability = 1 AND products.ProductName LIKE ?";

    public static final String SEARCH_PRODUCT = "SELECT * " +
            "FROM products";

    public static final String SEARCH_PRDUCT_BY_ID = "SELECT * " +
            "FROM products " +
            "WHERE products.ProductID = ?";

    public static final String INSERT_PRODUCT = "INSERT INTO Products (ProducerEmail, Category, ProductName, " +
            "ProductDescription, Picture, Price, Manufacturer, isCharitable, DiscountPercentage, " +
            "ShipmentCost) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_PRODUCT = "UPDATE products SET ProductName=?, ProductDescription=?, Price=?, DiscountPercentage=? WHERE ProductID=?";

    public static final String DELETE_PRODUCT = "DELETE FROM products WHERE ProductID = ?";

    public static final String ADD_REVIEW = "INSERT INTO reviews(productId, username, rating, comment) VALUES (?,?,?,?)";

    public static final String FIND_REVIEWS_BY_PRODUCT_ID = "SELECT * FROM reviews WHERE productId = ?";

    public static final String FIND_REVIEWS_BY_USERNAME = "SELECT * FROM reviews WHERE username = ?";

    public static final String FIND_SHIPMENT_STATUS = "SELECT * FROM shipments WHERE ShipmentTrack = ?"; //Creato da Richard

    public static final String FIND_USER_BY_USERNAME = "SELECT * FROM users WHERE Username = ?"; //Creato da Richard

    public static final String INSERT_USER = "INSERT INTO users (Username, Mail, Password, Name, Surname, Address1, Address2, City, State, PostalCode, Country, Phone, Website, PaypalAccount, Type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; //Creato da Richard
}
