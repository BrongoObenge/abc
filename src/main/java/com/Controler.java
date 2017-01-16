package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by j on 1/16/17.
 */

@RestController
public class Controler {
    @Autowired
    EService service;

    @RequestMapping("/give")
    public String get(E e)throws Exception{
        System.out.println(e);
        this.insert(e);
        return "lolthx";
    }
    @Bean
    public EService service(){
        return new EServiceImpl();
    }

    void insert(com.E e) throws Exception{
        String DB_URL = "jdbc:mysql://localhost/fish";
        String USER = "root";
        String PASS = "jiar111";
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO username VALUES('"+e.getUsername()+"');";
            stmt.execute(sql);

        }catch (Exception f){
            f.printStackTrace();
        }finally{
            conn.close();
        }
    }
}
