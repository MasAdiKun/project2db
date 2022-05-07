/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesreports.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import salesreports.Helper.Helper;
import salesreports.Model.ProductModel;
import salesreports.Model.SalesModel;
import salesreports.Query.ProductQuery;
import salesreports.Query.SalesQuery;

/**
 *
 * @author masad
 */
public class SalesController extends BaseController {
    Helper helper= new Helper();
    SalesQuery query = new SalesQuery();
    ProductQuery pquery = new ProductQuery();
    
    public boolean create(SalesModel model) throws ParseException    {  
      String date = helper.parseDateToString(model.getTransaction_date());  
        
      Map<Integer, Object> map = new HashMap<>();
      map.put(1, model.getCustomer_id());
      map.put(2, model.getProduct_id());
      map.put(3, model.getQuantity());
      map.put(4, model.getTotal());
      map.put(5, date);
      
      String sql = this.query.create;
      
      return this.preparedStatement(map, sql);
    }
    public ResultSet get()  {
        String sql = this.query.get;
        return this.get(sql);
    }
    
    public ResultSet showById(String id)    {
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
    public boolean update(String id, SalesModel model) throws ParseException  {
        String date = helper.parseDateToString(model.getTransaction_date());
       
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getCustomer_id());
        map.put(2, model.getProduct_id());
        map.put(3, model.getQuantity());
        map.put(4, model.getTotal());
        map.put(5, date);
        map.put(6, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    public boolean delete(String id) throws ParseException   {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
    public ResultSet showByDate(String date1, String date2) throws ParseException  {
        String sql = this.query.showByDate;
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, date1);
        map.put(2, date2);
        return this.getWithParameter(map, sql);
    }
    public boolean stockDecrease(String id, ProductModel model) throws ParseException  {     
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getStock());
        map.put(2, id);
        
        String sql = this.query.stockMin;
        
        return this.preparedStatement(map, sql);
    }
    public boolean stockIncrease (String id, ProductModel model) throws ParseException {
        Map<Integer,Object> map = new HashMap<>();
        map.put (1, model.getStock());
        map.put(2, id);
        
        String sql = this.query.stockPlus;
        
        return this.preparedStatement(map,sql);
    }
}
