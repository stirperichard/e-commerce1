package com.afjcjsbx.eshop.dao;

/**
 * Created by Davide on 13/02/2017.
 */
public interface FeedbackDAO {

    public storeFeedback(Feedback feedback);

    public getFeedbacks(int productId);
}
