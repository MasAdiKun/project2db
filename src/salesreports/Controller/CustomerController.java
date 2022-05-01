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
import salesreports.Model.CustomerModel;
import salesreports.Query.CustomerQuery;

/**
 *
 * @author masad
 */
public class CustomerController extends BaseController {
    Helper helper= new Helper();
    CustomerQuery query = new CustomerQuery();
    
    public boolean create(CustomerModel model) throws ParseException    {  
        
      Map<Integer, Object> map = new HashMap<>();
      map.put(1, model.getName());
      map.put(2, model.getGender());
      map.put(3, model.getAddress());
      
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
    
    public ResultSet showByName(String name)    {
        String sql = this.query.showByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return this.getWithParameter(map, sql);
    }
    
    public boolean update(String id, CustomerModel model) throws ParseException  {
       Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getGender());
        map.put(3, model.getAddress());
        map.put(4,id);
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    public boolean delete(String id) throws ParseException   {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
}
