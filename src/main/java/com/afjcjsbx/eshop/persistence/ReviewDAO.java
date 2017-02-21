package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.entity.feedback.Review;
import com.afjcjsbx.eshop.exceptions.DatabaseException;

import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public interface ReviewDAO {

    boolean storeReview(Review review) throws DatabaseException;

    List<Review> findReviewsByProductId(int productId) throws DatabaseException;

    List<Review> findReviewsByUsername(String username) throws DatabaseException;

    //void inizializzaDB(Connection conn) throws SQLException;
    // TODO serve inizializzare? Siamo sicuri di avere sempre il db sulla macchina?

}