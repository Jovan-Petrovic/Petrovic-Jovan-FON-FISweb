/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrovic.jovan.fon.fisweb.action.impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import petrovic.jovan.fon.fisweb.action.AbstractAction;
import petrovic.jovan.fon.fisweb.constants.PageConstants;
import petrovic.jovan.fon.fisweb.model.User;

/**
 *
 * @author KORISNIK
 */
public class LoginAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        System.out.println("====================================================");
        System.out.println("====================LoginAction=====================");
        System.out.println(email+"\t"+password);
        System.out.println("====================================================");
        
        User user=findUser(request, email, password);
        if (user==null){
            request.setAttribute("message", "User does not exist!");
            return PageConstants.VIEW_LOGIN;
        } else {
            request.getSession(true).setAttribute("loginUser", user);
            return PageConstants.VIEW_HOME;
        }
    }

    private User findUser(HttpServletRequest request, String email, String password) {
        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) return user;
        }
        return null;
    }
    
}
