package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.entity.feedback.Review;

import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public class ManageFeedbackDAOImpl implements ManageFeedbackDAO {

    @Override
    public void storeReview(Review review) {

    }

    @Override
    public List<Review> findReviewsByProductId(int productId) {
        return null;
    }

    @Override
    public List<Review> findReviewsByUsername(String username) {
        return null;
    }

}
