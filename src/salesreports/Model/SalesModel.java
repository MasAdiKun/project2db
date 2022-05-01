/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Model;

import java.util.Date;

/**
 *
 * @author masad
 */
public class SalesModel {
    private String customer_id;
    private String product_id;
    private int quantity;
    private int total;
    private Date transaction_date;
    private Date start_date;
    private Date to_date;

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTotal(int price, int quantity) {
        this.total = price*quantity;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    public Date getTo_date() {
        return to_date;
    }
    
    
}
