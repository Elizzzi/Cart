/*
* Lab1
* Yelyzaveta Yakovleva
* 18544
* Computer Engineering in English
* Wroclaw Academy of Business
*/
package models;
public class Articles {
    int id;
    String Name;
    double Price;
    int Quantity;
    String Unit;
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setPrice(Double price) {
        this.Price = price;
    }
    public Double getPrice() {
        return Price;
    }
    public void setQuantity(Integer quantity) {
        this.Quantity = quantity;
    }
    public Integer getQuantity() {
        return Quantity;
    }
    public void setUnit(String unit) {
        this.Unit = unit;
    }
    public String getUnit() {
        return Unit;
    }
}
