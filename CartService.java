/*
* Lab1
* Yelyzaveta Yakovleva
* 18544
* Computer Engineering in English
* Wroclaw Academy of Business
*/
package Services;
import models.Articles;
import models.Cart;
import Repositories.Repositories;
import java.util.ArrayList;
public class CartService {
    public ArrayList<Cart> getAllCarts(){
        Repositories repository = new Repositories();
        ArrayList<Cart> result = repository.getAllCarts();
        result.forEach((cart) -> {
            Double cartValue = Double.valueOf(0);
            ArrayList<Articles> articles = cart.getArticles();
            for (int i = 0; i<articles.size();i++){
                cartValue += articles.get(i).getPrice()*articles.get(i).getQuantity();
            }
            cart.setValue(cartValue);
        });
        return result;
    }
}
