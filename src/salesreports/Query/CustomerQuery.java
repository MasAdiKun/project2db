/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Query;

/**
 *
 * @author masad
 */
public class CustomerQuery {
    public String create = "Insert Into customer (customer_name,customer_gender,"
            + "customer_address) VALUES(?,?,?)";
    
    public String get = "SELECT customer_id AS 'Customer ID',"
            + "customer_name AS 'Customer Name',customer_gender AS "
            + "'Customer Gender',customer_address AS 'Address' FROM customer";
    public String showById = "SELECT * FROM customer WHERE customer_id = ?";
    public String showByName= "SELECT * FROM customer WHERE customer_name LIKE ?";
    public String update = "UPDATE customer SET customer_name = ?, "
            + "customer_gender = ?,customer_address = ? WHERE customer_id = ?";
    public String delete = "DELETE FROM customer WHERE customer_id = ?";
}
