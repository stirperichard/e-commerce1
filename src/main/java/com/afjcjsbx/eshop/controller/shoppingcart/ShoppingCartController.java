package com.afjcjsbx.eshop.controller.shoppingcart;

import com.afjcjsbx.eshop.controller.AbstractController;
import com.afjcjsbx.eshop.entity.catalog.Product;
import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.Guest;
import com.afjcjsbx.eshop.entity.shoppingcart.ShoppingCart;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ShoppingCartController extends AbstractController {


    public float getCartPrice(HttpServletRequest request) {

        AbstractUser user = getSessionAttribute("currentSessionUser", request);
        if (user == null) {
            user = new Guest();
        }
        ShoppingCart shoppingCart = user.getShoppingCart();


        float price = 0.0f;
        for (int i = 0; i < shoppingCart.getShoppingCartItems().size(); i++) {
            Product p = shoppingCart.getShoppingCartItems().get(i);
            price = price + p.getPrice() + p.getShipmentCost();
        }
        return price;
    }


    public boolean addProduct(HttpServletRequest request, Product p) {

        AbstractUser user = getSessionAttribute("currentSessionUser", request);

        if (user == null) {
            user = new Guest();
        }

        for (int i = 0; i < user.getShoppingCart().getShoppingCartItems().size(); i++) {

            if (p.getId() == user.getShoppingCart().getShoppingCartItems().get(i).getId()) {
                System.err.println("PRODOTTO GIA PRESENTE NEL CARRELLO");
                return false;
            }
        }

        user.getShoppingCart().getShoppingCartItems().add(p);
        setSessionAttribute("currentSessionUser", user, request);

        return true;
    }


    public void removeProduct(HttpServletRequest request, int product_id) {

        AbstractUser user = getSessionAttribute("currentSessionUser", request);

        if (user == null) {
            user = new Guest();
        }

        for (int i = 0; i < user.getShoppingCart().getShoppingCartItems().size(); i++) {
            if (user.getShoppingCart().getShoppingCartItems().get(i).getId() == product_id) {
                user.getShoppingCart().getShoppingCartItems().remove(i);
            }
        }

        setSessionAttribute("currentSessionUser", user, request);
    }


    public int productCount(HttpServletRequest request) {

        AbstractUser user = getSessionAttribute("currentSessionUser", request);
        if (user == null) {
            user = new Guest();
        }
        ShoppingCart shoppingCart = user.getShoppingCart();

        return shoppingCart.getShoppingCartItems().size();
    }


    public List<Product> getProducts(HttpServletRequest request) {

        AbstractUser user = getSessionAttribute("currentSessionUser", request);
        if (user == null) {
            user = new Guest();
        }
        ShoppingCart shoppingCart = user.getShoppingCart();

        return shoppingCart.getShoppingCartItems();
    }


    public AbstractUser retriveUserSession(HttpServletRequest request){
        return getSessionAttribute("currentSessionUser", request);
    }

    /*

	public boolean emptyCart(){
		cart.clear();
		return true;
	}

	*/


}
