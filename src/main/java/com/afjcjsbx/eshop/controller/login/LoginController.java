package com.afjcjsbx.eshop.controller.login;


import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.FactoryUsers;
import com.afjcjsbx.eshop.entity.login.Guest;
import com.afjcjsbx.eshop.utils.ConnectionManager;
import com.afjcjsbx.eshop.utils.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController extends AbstractController {

	/*
	private AjaxResponse logon(){}


	public @ResponseBody String jsonLogon(){
	}
	
    private ShoppingCartData populateShoppingCartData(){}

*/

    public static AbstractUser login(String username, String password) {

        AbstractUser user = null;

        try{
            PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(Query.FIND_REGISTERED_USER);
            statement.setString(1, username);
            //statement.setString(2, UtilityMD5.stringByHashingPassword(password));
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            // if user does not exist set the isValid variable to false
            if (!resultSet.next()) {
                System.out.println("Sorry, you are not a registered user! Please sign up first");
                return null;
            } else {
                //if user exists set the isValid variable to true
                String type = resultSet.getString("Type");
                String firstName = resultSet.getString("Name");
                String lastName = resultSet.getString("Surname");
                String user_name = resultSet.getString("Username");
                String email = resultSet.getString("Mail");

                user = FactoryUsers.get(type);
                user.setName(firstName);
                user.setSurname(lastName);
                user.setUsername(user_name);
                user.setEmail(email);

                System.out.println("Welcome " + firstName + " " + lastName);
                user.setValid(true);
            }
        } catch (SQLException e) {
            System.out.println("Log In failed: An Exception has occurred!");
            e.printStackTrace();
        }
        return user;
    }


}
