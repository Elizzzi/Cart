/*
* Lab1
* Yelyzaveta Yakovleva
* 18544
* Computer Engineering in English
* Wroclaw Academy of Business
*/
package models;
import java.util.ArrayList;
import java.util.Date;
public class Cart {
    public static Cart generateMock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    int id;
    Date CreatedDate;
    Date UpdatedDate;
    int UserId;
    ArrayList<Articles> articles;
    double Value;
    public Cart() {
        this.articles = new ArrayList<>();
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setCreatedDate(Date createdDate) {
        this.CreatedDate = createdDate;
    }
    public Date getCreatedDate() {
        return CreatedDate;
    }
    public void setUpdatedDate(Date updatedDate) {
        this.UpdatedDate = updatedDate;
    }
    public Date getUpdatedDate() {
        return UpdatedDate;
    }
    public void setUserId(Integer userId) {
        this.UserId = userId;
    }
    public Integer getUserId() {
        return UserId;
    }
    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }
    public ArrayList<Articles> getArticles() {
        return articles;
    }
    public void setValue(Double value) {
        this.Value = value;
    }
    public Double getValue() {
        return Value;
    }
}