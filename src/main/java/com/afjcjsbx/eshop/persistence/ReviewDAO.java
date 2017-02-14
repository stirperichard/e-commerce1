package com.afjcjsbx.eshop.persistence;

import com.afjcjsbx.eshop.entity.feedback.Review;
import java.util.List;

/**
 * Created by Davide on 13/02/2017.
 */
public interface ReviewDAO {

    public void storeReview(Review review);

    public List<Review> getReviews(int productId);
}
