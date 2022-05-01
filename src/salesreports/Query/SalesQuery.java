/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Query;

/**
 *
 * @author masad
 */
public class SalesQuery {
    public String create = "Insert Into sales (customer_id, product_id, "
            + "quantity , total_price , transaction_date)VALUES (?,?,?,?,?)";
    
    public String get = "SELECT sales.id AS 'Sales ID',product.product_id AS "
            + "'Product ID',product.product_name AS 'Product Name',"
            + "product.product_price AS'Price',product.product_Stock AS 'Stock',"
            + "sales.quantity AS'Quantity',sales.total_price AS 'Total Price',"
            + "customer.customer_id AS 'Customer ID',customer.customer_name "
            + "AS 'Customer Name',"
            + "customer.customer_address AS'Customer Address',"
            + "sales.transaction_date AS 'Transaction Date' FROM sales"
            + " INNER JOIN product ON product.product_id = sales.product_id" 
            + " INNER JOIN customer ON customer.customer_id = sales.customer_id";
    public String showById = "SELECT * FROM sales WHERE id = ?";
//    public String showByName= "SELECT sales.id AS 'Sales ID',product.product_id AS "
//            + "'Product ID',product.product_name AS 'Product Name',"
//            + "product.product_price AS'Price',sales.quantity AS"
//            + "'Quantity',sales.total_price AS 'Total Price',"
//            + "customer.customer_id AS 'Customer ID',customer.customer_name "
//            + "AS 'Customer Name',"
//            + "customer.customer_address AS'Customer Address',"
//            + "sales.transaction_date AS 'Transaction Date' FROM sales"
//            + "INNER JOIN product ON product.product_id = sales.product_id" 
//            + "INNER JOIN customer ON customer.customer_id = sales.customer_id"
//            +"WHERE customer.customer_name = ?";
    
    public String update = "UPDATE sales SET customer_id = ?, product_id = ?, "
            + "quantity =? , total_price  =?, transaction_date= ?"
            + " WHERE id = ?";
    public String delete = "DELETE FROM sales WHERE id = ?";
    public String showByDate = "SELECT sales.id AS 'Sales ID',product.product_id AS "
            + "'Product ID',product.product_name AS 'Product Name',"
            + "product.product_price AS'Price',product.product_Stock AS 'Stock',"
            + "sales.quantity AS 'Quantity',sales.total_price AS 'Total Price',"
            + "customer.customer_id AS 'Customer ID',customer.customer_name "
            + "AS 'Customer Name',"
            + "customer.customer_address AS'Customer Address',"
            + "sales.transaction_date AS 'Transaction Date' FROM sales"
            + " INNER JOIN product ON product.product_id = sales.product_id" 
            + " INNER JOIN customer ON customer.customer_id = sales.customer_id" 
            +" WHERE sales.transaction_date BETWEEN ? AND ?";
    public String productMin = "UPDATE product SET product_stock = ?, "
            + "WHERE product_id = ?";        
            
}
