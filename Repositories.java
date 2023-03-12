/*
* Lab1
* Yelyzaveta Yakovleva
* 18544
* Computer Engineering in English
* Wroclaw Academy of Business
*/
package Repositories;
import models.Cart;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
public class Repositories{
    public Cart getCart(Integer id) {
        Cart result = Cart.generateMock(id);
        return result;
    }
    public ArrayList<Cart> getAllCarts(Date updateDate){
        ArrayList<Cart> result = new ArrayList<>();
        int cartCount = new Random().nextInt(35 ) + 7;
        for (int i = 0; i<cartCount;i++){
            result.add(Cart.generateMock(i));
        }
        return result;
    }
    public ArrayList<Cart> getAllCarts() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
