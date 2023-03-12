/*
* Lab1
* Yelyzaveta Yakovleva
* 18544
* Computer Engineering in English
* Wroclaw Academy of Business
*/
package Views;
import models.Cart;
import Services.CartService;
import java.util.ArrayList;
public class CartView {
    public ArrayList<Cart> getAllCarts(){
        CartService service = new CartService();
        return service.getAllCarts();
    }
}

