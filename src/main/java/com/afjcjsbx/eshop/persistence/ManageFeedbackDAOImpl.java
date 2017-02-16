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
public class ManageFeedbackDAOImpl implements ManageFeedbackDAO {

    private static ManageFeedbackDAOImpl instance;

    public static ManageFeedbackDAOImpl getInstance() {
        if (instance == null)
            instance = new ManageFeedbackDAOImpl();
        return instance;
    }

    private ManageFeedbackDAOImpl() {
    }

    @Override
    public boolean storeReview(Review review) throws DatabaseException {

        try {
            PreparedStatement stm = DataSource.getConnection().prepareStatement(Query.ADD_REVIEW);
            // setta i parametri della query
            stm.setInt(1, review.getReviewId());
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
        return false;

    }

    @Override
    public List<Review> findReviewsByProductId(int productId) throws DatabaseException {
        try {
            List<Review> reviewsList = new ArrayList<>();

            Connection conn = DataSource.getConnection();
            PreparedStatement stm = conn.prepareStatement(Query.FIND_REVIEWS_BY_PRODUCT_ID);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Review review = new Review();
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
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Review review = new Review();
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

}
