package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.entity.feedback.Review;
import com.afjcjsbx.eshop.exceptions.DatabaseException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteDAO implemented via JDBC. It is Singleton.
 */
public class ReviewDAOImpl implements ReviewDAO {

    private static ReviewDAOImpl instance;

    public static ReviewDAOImpl getInstance() {
        if (instance == null)
            instance = new ReviewDAOImpl();
        return instance;
    }

    private ReviewDAOImpl() {
    }

    @Override
    public void storeReview(Review review) throws DatabaseException {

        try {
            PreparedStatement stm = DataSource.getConnection().prepareStatement(Query.ADD_REVIEW);
            // setta i parametri della query
            //stm.setInt(1, review.getReviewId());
            stm.setInt(2, review.getProductId());
            stm.setString(3, review.getUsername());
            stm.setInt(4, review.getRating());
            stm.setString(5, review.getComment());

            stm.execute();

            stm.close();

            /*for (Feedback feedback1 : location.getFeedbacks())
                if (feedback1.getUsername().equals(user.getUsername())) {
                    location.getFeedbacks().remove(feedback1);
                    break;
                }

            this.location.getFeedbacks().add(feedback);
            filteredSearchResultLocation.loadFeedback(location);*/

        } catch (SQLException e) {
            throw new DatabaseException("Cannot write on database");
        }
    }

    @Override
    public List<Review> findReviewsByProductId(int productId) throws DatabaseException {
        try {
            List<Review> reviewsList = new ArrayList<>();

            Connection conn = DataSource.getConnection();
            PreparedStatement stm = conn.prepareStatement(Query.FIND_REVIEWS_BY_PRODUCT_ID);
            stm.setInt(1, productId);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Review review = new Review(rs.getInt("reviewId"),
                        rs.getInt("productId"),
                        rs.getString("username"),
                        rs.getInt("rating"),
                        rs.getString("comment"));
                /*lista.add(new Review(rs.getInt(FEEDBACK_ID), rs.getInt(LocazioneDAO.ID),
                        new UtenteCliente(rs.getString(UtenteGenericoDAO.CAMPO_NICKNAME)), rs.getString(COMMENTO)));
                */
                reviewsList.add(review);
            }
            stm.close();
            return reviewsList;
        } catch (SQLException e) {
            throw new DatabaseException("Cannot fetch from database", e);
        }
    }

    @Override
    public List<Review> findReviewsByUsername(String username) throws DatabaseException {
        try {
            List<Review> reviewsList = new ArrayList<>();

            Connection conn = DataSource.getConnection();
            PreparedStatement stm = conn.prepareStatement(Query.FIND_REVIEWS_BY_USERNAME);
            stm.setString(1, username);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Review review = new Review(rs.getInt("reviewId"),
                        rs.getInt("productId"),
                        rs.getString("username"),
                        rs.getInt("rating"),
                        rs.getString("comment"));
                reviewsList.add(review);
            }
            stm.close();
            return reviewsList;
        } catch (SQLException e) {
            throw new DatabaseException("Cannot fetch from database", e);
        }
    }

}
