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

public class ShoppingCartController extends AbstractController{


	@RequestMapping(value = "/test/{argument}", method = RequestMethod.GET)
	public void Controller(@PathVariable("argument") String argument) {

		System.out.println("PORCO DIO !!" + argument);
	}


	public float getCartPrice(HttpServletRequest request) {

		AbstractUser user = getSessionAttribute("currentSessionUser", request);
		if(user == null){
			user = new Guest();
		}
        ShoppingCart shoppingCart = user.getShoppingCart();


		float price = 0.0f;
		for(int i = 0; i < shoppingCart.getShoppingCartItems().size(); i++){
			Product p = shoppingCart.getShoppingCartItems().get(i);
			price = price + p.getPrice();
		}
		return price;
	}


	public void addProduct(HttpServletRequest request, Product p){

		AbstractUser user = getSessionAttribute("currentSessionUser", request);

		if(user == null){
			user = new Guest();
		}
		user.getShoppingCart().getShoppingCartItems().add(p);

		setSessionAttribute("currentSessionUser", user, request);
	}


	public void removeProduct(HttpServletRequest request, int product_id){

		AbstractUser user = getSessionAttribute("currentSessionUser", request);

		if(user == null){
			user = new Guest();
		}

		for(int i = 0; i < user.getShoppingCart().getShoppingCartItems().size(); i++){
			if(user.getShoppingCart().getShoppingCartItems().get(i).getId() == product_id){
				user.getShoppingCart().getShoppingCartItems().remove(i);
			}
		}

		setSessionAttribute("currentSessionUser", user, request);
	}


	public int productCount(HttpServletRequest request){

		AbstractUser user = getSessionAttribute("currentSessionUser", request);
		if(user == null){
			user = new Guest();
		}
		ShoppingCart shoppingCart = user.getShoppingCart();

		return shoppingCart.getShoppingCartItems().size();
	}


	public List<Product> getProducts(HttpServletRequest request){

		AbstractUser user = getSessionAttribute("currentSessionUser", request);
		if(user == null){
			user = new Guest();
		}
		ShoppingCart shoppingCart = user.getShoppingCart();

		return shoppingCart.getShoppingCartItems();
	}




		/*

	public boolean deleteProductInCart(Product p, Customer c) throws ProductNotFoundException {
		if(c.getShoppingCart().deleteProduct(p.getPid())){
			return true;
		}else{
			return false;
		}
	}


	public void eptyCart(Customer c){
		c.getShoppingCart().emptyCart();
	}



	public Product getProductFromCart(int pid) throws ProductNotFoundException {
		for(Product p : cart){
			if(p.getPid() == pid){
				return p;
			}else{
				throw new ProductNotFoundException();
			}
		}
		return null;
	}

	public void addCartProduct(Product p){

		for(Product p1 : cart){
			if(p1.getPid() == p.getPid()){
				p1.setQuantity(p1.getQuantity() + p.getQuantity());
				return;
			}
		}
		cart.add(p);
	}


	public boolean deleteProduct(int pid) throws ProductNotFoundException {

		for(int i = 0; i < cart.size(); i++){

			Product p = cart.get(i);
			if(p.getPid() == pid){
				if(p.getQuantity() == 1){
					cart.remove(i);
				}else{
					p.setQuantity(p.getQuantity() - 1);
				}
				return true;
			}
		}
		throw new ProductNotFoundException("Product with ID " + pid + " is not Found.");
	}




	public boolean emptyCart(){
		cart.clear();
		return true;
	}

	public ArrayList<Product> showCart(){
		return cart;
	}



	public float getCartPrice() {
		float price = 0.0f;
		for(int i = 0; i < cart.size(); i++){
			Product p = cart.get(i);
			price = price + (p.getPrice() * p.getQuantity());
		}
		return price;
	}

	public void print(){
		for(int i = 0; i < cart.size(); i++){
			Product p = cart.get(i);
			System.out.println(p.toString());
		}
	}


	public Product get(int pos){
		return cart.get(pos);
	}

	*/

}
