/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.listener;

import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import petrovic.jovan.fon.fisweb.model.User;

/**
 *
 * @author KORISNIK
 */
@WebListener
public class MyApplicationContextListener implements ServletContextListener {

    public MyApplicationContextListener() {
        System.out.println("======================================================");
        System.out.println("========= MyApplicationContextListener=================");
        System.out.println("=======================================================");
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("======================================================");
        System.out.println("=========        contextInitialized  =================");
        System.out.println("=======================================================");
        // lista korisnika
        sce.getServletContext().setAttribute("users", createUsers());
        // lista departmana
        sce.getServletContext().setAttribute("departments", new ArrayList<>());
        // max department id
        sce.getServletContext().setAttribute("maxId", 0L);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    private Object createUsers() {
        return new ArrayList<User>(){
            {
                add(new User("Jovan","Jovanovic", "jovan@gmail.com", "jovan"));
                add(new User("Ivana","Ivanovic", "ivana@gmail.com", "ivana"));
                add(new User("Zoran","Zoric", "zoran@gmail.com", "zoran"));
            }
        };
    }
    
}
