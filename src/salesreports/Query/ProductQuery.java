/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Query;

/**
 *
 * @author masad
 */
public class ProductQuery {
    public String create = "INSERT INTO product (product_name, product_category, "
            + "product_price,product_stock, restock) VALUES(?,?,?,?,?)";
    
    public String get = "SELECT product_id AS 'ID',product_name AS 'Product Name',"
            + "product_category AS 'Category', product_price as 'Product Price',"
            + "product_stock AS 'Stock', restock AS'Latest Update' FROM product";
    public String showById = "SELECT * FROM product WHERE product_id = ?";
    public String showByName= "SELECT * FROM product WHERE product_name LIKE ?";
    public String update = "UPDATE product SET product_name = ?, "
            + "product_category = ?,product_price = ?, product_stock = ?, "
            + "restock = ? WHERE product_id = ?";
    public String delete = "DELETE FROM product WHERE product_id = ?";
}
