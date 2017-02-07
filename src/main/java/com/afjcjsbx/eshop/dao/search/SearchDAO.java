package com.afjcjsbx.eshop.dao.search;

import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchDAO {

    /**
     * Default constructor
     */
    public SearchDAO() { }

    public List<Product> search(String search) {

        List<Product> result = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = ConnectionManager.getConnection().prepareStatement(Query.SEARCH_PRODUCTS_BY_NAME);
            preparedStatement.setString(1, "%" + search + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            System.err.println("query:" + preparedStatement.toString());

            while (resultSet.next() ) {

                Product p = new Product();

                int productID = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                String photo = resultSet.getString("Picture");
                int discount = resultSet.getInt("Discount");
                float price = resultSet.getFloat("Price");

                p.setId(productID);
                p.setName(productName);
                p.setPhoto(photo);
                p.setDiscountPercentage(discount);
                p.setPrice(price);

                System.out.println(productID + " " + productName);

                result.add(p);
            }
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return result;
    }

/*
    public List<Request> searchWithoutFilter(String nation, String city, RequestStatus status) {
        EntityManager entityManager = JPAInitializer.getEntityManager();
        String querystring = "FROM Request r WHERE r.status = :s";
        if (!nation.equals("")) {
            querystring += " AND r.structure.address.nation = :n";
        }
        if (!city.equals("")) {
            querystring += " AND r.structure.address.city = :c";
        }
        TypedQuery<Request> query = entityManager.createQuery(querystring,Request.class);
        if (!nation.equals("")) {
            query.setParameter("n", nation);
        }
        if (!city.equals("")) {
            query.setParameter("c", city);
        }
        query.setParameter("s", status);
        List<Request> result;
        result = query.getResultList();
        entityManager.close();
        return result;
    }

    public List<Location> selectAcceptedRequests(String nation, String city) throws IllegalArgumentException, PersistenceException {
        EntityManager entityManager = JPAInitializer.getEntityManager();
        String querystring = "FROM Location l WHERE l.structure.request.status = 2";
        if (!nation.equals("")) {
            querystring += " AND l.structure.address.nation = :n";
        }
        if (!city.equals("")) {
            querystring += " AND l.structure.address.city = :c";
            }
        //can throw Illegal Argument exception
        TypedQuery<Location> query = entityManager.createQuery(querystring, Location.class);
        if (!nation.equals("")) {
            query.setParameter("n", nation);
        }
        if (!city.equals("")) {
            query.setParameter("c", city);
        }
        List<Location> result;
        //TODO tutte le eccezioni dovrebbero essere lanciate?
        result = query.getResultList();
        entityManager.close();
        return result;
    }

    public Location selectLocationWithId(Long id) {
        EntityManager entityManager = JPAInitializer.getEntityManager();
        TypedQuery<Location> query = entityManager.createQuery("FROM Location l WHERE l.id=:id",Location.class);
        query.setParameter("id",id);
        Location result;
        result = query.getSingleResult();
        entityManager.close();
        return result;
    }

    public void store(Manager managerInstance) {
        EntityManager entityManager = JPAInitializer.getEntityManager();
        entityManager.getTransaction().begin();
        Request newRequest = new Request(managerInstance);
        entityManager.persist(newRequest);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    */
}