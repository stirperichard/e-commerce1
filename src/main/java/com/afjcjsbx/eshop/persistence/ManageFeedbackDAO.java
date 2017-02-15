package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.entity.feedback.Review;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public interface ManageFeedbackDAO {

    void storeReview(Review review);

    List<Review> findReviewsByProductId(int productId);

    List<Review> findReviewsByUsername(String username);

    //void inizializzaDB(Connection conn) throws SQLException;
    // TODO serve inizializzare? Siamo sicuri di avere sempre il db sulla macchina?

}
