package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.login.*;
import com.afjcjsbx.eshop.persistence.DataSource;
import com.afjcjsbx.eshop.persistence.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Richard on 07/02/2017.
 */
public class RegistrationController extends AbstractController {

    public boolean register_consumer(Consumer consumer){

        return true;
    }

    public boolean register_charity(Charity charity){

        return true;
    }

    public boolean register_producer(Producer producer){

        return true;
    }
    /* private DatabaseUserSingleton database_singleton = DatabaseUserSingleton.getInstance();

    public boolean register_consumer(Customer c){
        for (int i=0; i < database_singleton.getSize(); i++){
            if (c.getUsername().equals(database_singleton.get(i).getUsername()) ||
                    c.getEmail().equals(database_singleton.get(i).getMail())){
                return false;
            }
        }
        database_singleton.addUser(c);
        return true;
    }

    public boolean register_producer(Producer p){
        for (int i=0; i < database_singleton.getSize(); i++){
            if (p.getUsername().equals(database_singleton.get(i).getUsername()) ||
                    p.getEmail().equals(database_singleton.get(i).getMail())) {
                return false;
            }
        }
        database_singleton.addUser(p);
        return true;
    } */

}
